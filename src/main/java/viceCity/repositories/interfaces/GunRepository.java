package viceCity.repositories.interfaces;

import java.util.Collection;

public class GunRepository implements Repository{
    @Override
    public Collection getModels() {
        return null;
    }

    @Override
    public void add(Object model) {

    }

    @Override
    public boolean remove(Object model) {
        return false;
    }

    @Override
    public Object find(String name) {
        return null;
    }
}
