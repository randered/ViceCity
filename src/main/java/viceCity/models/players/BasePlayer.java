package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;
import viceCity.common.ExceptionMessages;

public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;

    public BasePlayer(String name, int lifePoints) {
       setName(name);
       setLifePoints(lifePoints);
    }

    @Override
    public boolean isAlive() {
        if(lifePoints>0){
            return true;
        }
        return false;
    }

    @Override
    public void takeLifePoints(int points) {
        this.lifePoints = this.lifePoints - points;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            throw new NullPointerException
                    (ExceptionMessages.NAME_NULL);
        }
        this.name = name;
    }

    public void setLifePoints(int lifePoints) {
        if(lifePoints >= 0){
            this.lifePoints = lifePoints;
        }
        throw new IllegalArgumentException(ExceptionMessages.PLAYER_LIFE_POINTS_LESS_THAN_ZERO);
    }
}
