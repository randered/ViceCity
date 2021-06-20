package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

public class MainPlayer extends BasePlayer {
    private static final String mainPlayerName = "Tommy Vercetti";
    private static final int mainPlayerLifePoints = 100;

    public MainPlayer() {
        super(mainPlayerName, mainPlayerLifePoints);
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
