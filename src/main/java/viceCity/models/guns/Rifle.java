package viceCity.models.guns;

import viceCity.common.ExceptionMessages;

public class Rifle extends BaseGun{
    private int bulletsPerBarrel = 50;
    private int totalBullets = 500;
    public Rifle(String name) {
        super(name, 50, 500);
    }

    @Override
    public int fire() {
        if (bulletsPerBarrel == 0) {
            if (totalBullets > 0){
                this.bulletsPerBarrel = 50;
                this.totalBullets = this.totalBullets - 50;
            }
        }else if(totalBullets <= 0 && bulletsPerBarrel <=0){
            throw new IllegalArgumentException(ExceptionMessages.TOTAL_BULLETS_LESS_THAN_ZERO);
        }
        bulletsPerBarrel =-5;
        return 5;

        //should fire 1 bullet
    }
}
