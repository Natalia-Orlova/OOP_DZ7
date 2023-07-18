package model.agents;

import model.communications.Communication;

import java.util.List;

public class Company extends ListAgent {

    public Company(String name, List<Communication> communications) {
        super(name, communications);
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Company name: " + super.name + "\n");
        for (Communication communication : super.communications) {
            sBuilder.append(" " + communication.toString() + "\n");
        }
        return sBuilder.toString();
    }

}
