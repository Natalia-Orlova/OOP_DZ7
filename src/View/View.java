package View;

import model.agents.ListAgent;
import model.communications.*;

import java.util.List;
import java.util.Scanner;

public class View {
    private void showCommunicationMenu() {
        System.out.println("1 - Номер телефона");
        System.out.println("2 - Email");
        System.out.println("3 - VK");
        System.out.println("4 - Telegram");
        System.out.println("5 - Адрес");
    }

    public void showListAgent(List<ListAgent> listAgents) {
        if (listAgents.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (ListAgent listAgent : listAgents) {
                System.out.println(listAgent.toString());
                System.out.println("______________________________________");
            }
        }
    }

    public void showAllContacts(List<ListAgent> listAgents) {
        System.out.println("________________________________");
        if (listAgents.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (ListAgent listAgent : listAgents) {
                System.out.println(listAgent.getName());
                System.out.println("____________________________");
            }
        }
    }

    public void showMenu() {
        System.out.println("1 - Список всех контактов");
        System.out.println("2 - Найти контакт");
        System.out.println("3 - Добавить контакт");
        System.out.println("4 - Удалить контакт");
        System.out.println("5 - Добавить новый способ связи");
        System.out.println("6 - Удалить способ связи");
        System.out.println("0 - Выход");

    }

    public void greeting() {
        System.out.println("КОНТАКТЫ");
    }

    public void bye() {
        System.out.println("Спасибо за использование приложения \"КОНТАКТЫ\"!");
    }

    public void addAgentMenu() {
        System.out.println("Выберите тип контакта");
        System.out.println(" 1 - Физическое лицо");
        System.out.println(" 2 - Юридическое лицо");
    }

    public Communication communicationMenu(Scanner scanner) {
        showCommunicationMenu();
        int choice = scanner.nextInt();
        String value = "";
        Communication communication = null;

        switch (choice) {
            case 1:
                System.out.println("Введите номер телефона:");
                value = scanner.next();
                communication = new PhoneNumber(value);
                break;
            case 2:
                System.out.println("Введите адрес электронной почты:");
                value = scanner.next();
                communication = new Email(value);
                break;
            case 3:
                System.out.println("Введите адрес страницы VK:");
                value = scanner.next();
                communication = new VK(value);
                break;
            case 4:
                System.out.println("Введите адрес Telegram:");
                value = scanner.next();
                communication = new Telegram(value);
                break;
            case 5:
                System.out.println("Введите адрес:");
                value = scanner.next();
                communication = new Address(value);
                break;

            default:
                break;
        }
        return communication;
    }

    public String getContactName(Scanner scanner) {
        System.out.println("Введите имя контакта для добавления / удаления способа связи:");
        return scanner.next();
    }

    public String getContactValue(Scanner scanner) {
        System.out.println("Введите номер/адрес/vk/tg/email, который нужно удалить:");
        return scanner.next();
    }

}
