package model.communications;

public class VK implements Communication {

    private String name;

    public VK(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VK: " + name;
    }

    @Override
    public String getName() {
        return name;
    }

}