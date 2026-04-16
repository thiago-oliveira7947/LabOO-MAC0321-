package entities;

public class LP extends Song {
    
    private double velocity;

    public LP(String title, String album_name, String composer, String interpreter, int year, double velocity) {
        super(title, album_name, composer, interpreter, year);
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }

    @Override
    public String toString() {
        return super.toString() + "LP's velocity: " + getVelocity();
    }
}
