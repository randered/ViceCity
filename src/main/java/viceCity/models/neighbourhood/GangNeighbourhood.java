package viceCity.models.neighbourhood;

import viceCity.models.players.Player;

import java.util.Collection;

import viceCity.models.guns.Gun;

public class GangNeighbourhood implements Neighbourhood {
    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {
        for (Player civilPlayer : civilPlayers) {
            for (Gun gunModel:mainPlayer.getGunRepository().getModels()) {
                while (civilPlayer.isAlive() && gunModel.canFire()){
                    civilPlayer.takeLifePoints(gunModel.fire());
                }
                if(!civilPlayer.isAlive()){
                    break;
                }
            }
        }

    }
}