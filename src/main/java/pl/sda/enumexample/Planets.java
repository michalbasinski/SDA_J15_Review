package pl.sda.enumexample;

public enum Planets {
    EARTH(6100, true),
    VENUS(6050, false);

    int radius;
    boolean lifeExists;

    Planets(int radius, boolean lifeExists) {
        this.radius = radius;
        this.lifeExists = lifeExists;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isLifeExists() {
        return lifeExists;
    }
}
