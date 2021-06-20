package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.Repository;
import viceCity.common.ExceptionMessages;


public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;

    public BasePlayer(String name, int lifePoints) {
        this.setName(name);
        setLifePoints(lifePoints);

    }

    @Override
    public boolean isAlive() {
        return this.getLifePoints() > 0;
    }

    @Override
    public void takeLifePoints(int points) {
        if (this.getLifePoints() - points >= 0) {
            this.setLifePoints(this.getLifePoints() - points);
        }
        this.setLifePoints(0);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException
                    (ExceptionMessages.NAME_NULL);
        }
        this.name = name;
    }

    public void setLifePoints(int lifePoints) {
        if (lifePoints >= 0) {
            this.lifePoints = lifePoints;
        }
        throw new IllegalArgumentException(ExceptionMessages.PLAYER_LIFE_POINTS_LESS_THAN_ZERO);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }
}
