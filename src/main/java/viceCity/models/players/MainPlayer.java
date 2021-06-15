package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

public class MainPlayer extends BasePlayer {
    public MainPlayer() {
        super("Tommy Vercetti", 100);
    }

    @Override
    public String getName() {
        return MainPlayer.this.getName();
    }

    @Override
    public int getLifePoints() {
        return MainPlayer.this.getLifePoints();
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }
}
