package model;

import model.agents.Company;
import model.agents.ListAgent;
import model.agents.Person;
import model.communications.Communication;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<ListAgent> listAgents;

    public Model(List<ListAgent> listAgents) {
        this.listAgents = listAgents;
    }

    public List<ListAgent> getListAgents() {
        return listAgents;
    }

    public List<ListAgent> fineAgentByName(String name) {
        List<ListAgent> findAgents = new ArrayList<>();
        for (ListAgent listAgent : listAgents) {
            if (listAgent.getName().equalsIgnoreCase(name)) {
                findAgents.add(listAgent);
            }
        }
        return findAgents;
    }

    public void addAgent(int choise, String name, Communication communication) {
        List<Communication> communications = new ArrayList<>();
        communications.add(communication);
        if (choise == 1) {
            listAgents.add(new Person(name, communications));
        } else if (choise == 2) {
            listAgents.add(new Company(name, communications));
        }
    }

    public void removeAgent(String name) {
        listAgents.removeAll(fineAgentByName(name));
    }

    public void addNewCommunication(String name, Communication communication) {
        for (ListAgent listAgent : fineAgentByName(name)) {
            listAgent.addCommunication(communication);
        }
    }

    public void removeCommunication(String name, String number) {
        for (ListAgent listAgent : fineAgentByName(name)) {
            Communication communicationForRemuve = null;
            for (Communication communication : listAgent.getCommunications()) {
                if (communication.getName().equalsIgnoreCase(number)) {
                    communicationForRemuve = communication;
                    break;
                }
            }
            listAgent.getCommunications().remove(communicationForRemuve);
        }
    }

}