package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;

public class CivilPlayer extends BasePlayer {

    public CivilPlayer(String name) {
        super(name, 50);
    }
}
