package viceCity.core;

import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.Neighbourhood;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;
import viceCity.common.ExceptionMessages;
import viceCity.common.ConstantMessages;

import java.util.Collection;
import java.util.Deque;

public class ControllerImpl implements Controller {
    private MainPlayer mainPlayer;
    private Collection<Player> civilPlayers;
    private Deque<Gun> guns;
    private Neighbourhood neighbourhood;

    public ControllerImpl() {


    }

    @Override
    public String addPlayer(String name) {
        Player player = new CivilPlayer(name);
        this.civilPlayers.add(player);
        return String.format(ConstantMessages.PLAYER_ADDED, name);
//        Creates a civil player with the given name.
//        The method should return the following message:
//•	"Successfully added civil player: {player name}!"
    }

    @Override
    public String addGun(String type, String name) {
        Gun gun = null;

        if (Pistol.class.getName().equals(type)) {
            gun = new Pistol(name);
        } else if (Rifle.class.getName().equals(type)) {
            gun = new Rifle(name);
        }
        if (gun == null) {
            return ConstantMessages.GUN_TYPE_INVALID;
        } else {
            this.guns.offer(gun);
            return String.format(ConstantMessages.GUN_ADDED, name, type);

        }
//        Creates a gun with the provided type and name.
//                If the gun type is invalid, the method should return the following message:
//•	"Invalid gun type!"
//        If the gun type is correct, keep the gun and return the following message:
//•	"Successfully added {gun name} of type: {gun type}"

    }

    @Override
    public String addGunToPlayer(String name) {
        return null;
//        Adds the first added gun to the player's gun repository.
//•	If there no guns in the queue, return the following message:
//        "There are no guns in the queue!"
//•	If the name of the player is "Vercetti", you need to add the gun to the main player's repository and return the following message:
//        "Successfully added {gun name} to the Main Player: Tommy Vercetti"
//•	If you receive a name which doesn't exist, you should return the following message:
//        "Civil player with that name doesn't exists!"
//•	If everything is successful, you should add the gun to the player's repository and return the following message:
//        "Successfully added {gun name} to the Civil Player: {player name}"

    }

    @Override
    public String fight() {
        return null;
    }
}
