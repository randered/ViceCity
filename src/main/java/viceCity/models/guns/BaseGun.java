package viceCity.models.guns;

import viceCity.common.ExceptionMessages;

public abstract class BaseGun implements Gun {
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private boolean canFire;

    public BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        setName(name);
        setBulletsPerBarrel(bulletsPerBarrel);
        setTotalBullets(totalBullets);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new NullPointerException
                    (ExceptionMessages.NAME_NULL);
        }
        this.name = name;
    }

    public void setBulletsPerBarrel(int bulletsPerBarrel) {
        if (bulletsPerBarrel >= 0) {
            this.bulletsPerBarrel = bulletsPerBarrel;
        }
        throw new IllegalArgumentException
                (ExceptionMessages.BULLETS_LESS_THAN_ZERO);
    }

    public void setTotalBullets(int totalBullets) {
        if (totalBullets >= 0) {
            this.totalBullets = totalBullets;
        }
        throw new IllegalArgumentException
                (ExceptionMessages.TOTAL_BULLETS_LESS_THAN_ZERO);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }


    @Override
    public int getTotalBullets() {
        return this.totalBullets;
    }

    @Override
    public int fire() {
        if(canFire){
            if(getName().equals("Pistol")){
                return 1;
            }else if (getName().equals("Rifle")){
                return 5;
            }
        } return 0;

    }

    @Override
    public boolean canFire() {
        if(getBulletsPerBarrel() > 0){
            return true;
        }else return getBulletsPerBarrel() > 0 && totalBullets > getBulletsPerBarrel();

    }
}
