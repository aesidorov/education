package oldLesson;

public class Car {

    private String model;

    private int Fuel;

    public void beepBeep(){
        System.out.println("Машина посигналила");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return Fuel;
    }

    public void setFuel(int fuel) {
        Fuel = fuel;
    }
}
