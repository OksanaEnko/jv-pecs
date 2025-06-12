package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasBlade;

    public Bulldozer() {
    }

    public boolean isHasBlade() {
        return hasBlade;
    }

    public void setHasBlade(boolean hasBlade) {
        this.hasBlade = hasBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
