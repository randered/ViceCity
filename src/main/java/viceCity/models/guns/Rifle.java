package viceCity.models.guns;

public class Rifle extends BaseGun{
    public Rifle(String name) {
        super(name, 50, 500);
    }

    @Override
    public int fire() {
        return super.fire();
        // should fire 5 bullets
    }
}
