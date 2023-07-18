package model.agents;

import model.communications.Communication;

import java.util.List;

public class ListAgent {
    protected String name;
    protected List<Communication> communications;

    public ListAgent(String name, List<Communication> communications) {
        this.name = name;
        this.communications = communications;
    }

    public String getName() {
        return name;
    }

    public List<Communication> getCommunications() {
        return communications;
    }

    public void addCommunication(Communication communication) {
        communications.add(communication);
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Name: " + name + "\n");
        if (communications != null) {
            for (Communication communication : communications) {
                sBuilder.append(" " + communication.toString() + "\n");
            }
        }
        return sBuilder.toString();
    }

    public void setCommunications(List<Communication> communications) {
        this.communications = communications;
    }

}
