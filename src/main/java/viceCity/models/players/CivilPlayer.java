package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

public class CivilPlayer extends BasePlayer {

    public CivilPlayer(String name) {
        super(name, 50);
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int getLifePoints() {
        return this.getLifePoints();
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }
}
