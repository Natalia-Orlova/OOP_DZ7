package model.communications;

public class Telegram implements Communication {

    private String name;

    public Telegram(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telegram: " + name;
    }


    @Override
    public String getName() {
        return name;
    }
}