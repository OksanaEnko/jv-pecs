package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;

    public Excavator() {
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
