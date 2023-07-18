package Presenter;

import View.View;
import model.Model;

import java.util.Scanner;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        view.greeting();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            view.showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    view.showAllContacts(model.getListAgents());
                    break;

                case 2:
                    System.out.println("Введите имя контакта для поиска:");
                    String name = scanner.next();
                    view.showListAgent(model.fineAgentByName(name));
                    break;

                case 3:
                    view.addAgentMenu();
                    int AgentChoice = scanner.nextInt();
                    System.out.println("Введите имя нового контакта:");
                    String newName = scanner.next();
                    model.addAgent(AgentChoice, newName, view.communicationMenu(scanner));
                    System.out.println("Контакт добавлен!");
                    break;

                case 4:
                    System.out.println("Введите имя контакта для удаления:");
                    String removeName = scanner.next();
                    model.removeAgent(removeName);
                    System.out.println("Contact deleted!");
                    break;

                case 5:
                    model.addNewCommunication(view.getContactName(scanner), view.communicationMenu(scanner));
                    System.out.println("Способ связи добавлен!");
                    break;

                case 6:
                    model.removeCommunication(view.getContactName(scanner), view.getContactValue(scanner));
                    System.out.println("Способ связи удален!");
                    break;

                case 0:
                    view.bye();
                    flag = false;
                    scanner.close();
                    break;

                default:
                    break;
            }
        }
    }
}