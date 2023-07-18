package model.agents;

import model.communications.Communication;

import java.util.List;

public class Person extends ListAgent {

    public Person(String name, List<Communication> communications) {
        super(name, communications);
    }

}