package viceCity.models.guns;

import viceCity.models.players.BasePlayer;
import viceCity.common.ExceptionMessages;


public class Pistol extends BaseGun {
    private int barrel = 5;
    private int totalBullets = 50;

    public Pistol(String name) {
        super(name, 5, 50);
    }

    @Override
    public int fire() {
        if (barrel == 0) {
            if (totalBullets > 0){
            this.barrel = 5;
            this.totalBullets = this.totalBullets - 5;
            }
        }else if(totalBullets <= 0){
            throw new IllegalArgumentException(ExceptionMessages.TOTAL_BULLETS_LESS_THAN_ZERO);
        }
        return 1;

        //should fire 1 bullet
    }
}
