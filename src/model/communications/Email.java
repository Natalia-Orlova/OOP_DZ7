package model.communications;

public class Email implements Communication {

    private String name;

    public Email(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Email: " + name;
    }


    @Override
    public String getName() {
        return name;
    }

}