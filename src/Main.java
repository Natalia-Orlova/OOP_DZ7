import Presenter.Presenter;
import model.Model;
import model.agents.Company;
import model.agents.ListAgent;
import model.agents.Person;
import model.communications.*;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ListAgent> listAgents = new ArrayList<>();
        List<Communication> nameCommunications = new ArrayList<>();
        Person petr = new Person("Иван", nameCommunications);
        nameCommunications.add(new PhoneNumber("8 926 555 55 55"));
        nameCommunications.add(new Email("iv63@mail.ru"));
        nameCommunications.add(new Address("Самара Краснодонская 10"));
        nameCommunications.add(new Telegram("ivan_tg"));
        nameCommunications.add(new VK("Ivan6363"));

        List<Communication> companyCommunications = new ArrayList<>();
        Company company = new Company("Company", companyCommunications);
        companyCommunications.add(new PhoneNumber("8 800 888 88 88"));
        companyCommunications.add(new Address("New Arbat 10"));
        companyCommunications.add(new Email("company@mail.ru"));

        listAgents.add(petr);
        listAgents.add(company);

        Presenter presenter = new Presenter(new View(), new Model(listAgents));
        presenter.start();
    }
}