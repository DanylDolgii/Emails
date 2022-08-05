package views;

import database.entities.Email;
import models.EmailCreateModel;
import utils.EmailValidator;
import utils.NameValidator;

import java.util.Scanner;

public class EmailCreateView {
    EmailCreateModel model;
    Email email;
    String title;
    Scanner scanner;

    public EmailCreateView(EmailCreateModel model) {
        this.model = model;
    }

    public Email doInputs() {

        scanner = new Scanner(System.in);
        email = new Email();

        // Ввод и валидация данных

        title = "Enter name: ";
        System.out.print(title);
        email.setName(NameValidator.validateNameInput(scanner));

        title = "Enter email: ";
        System.out.print(title);
        email.setEmail(EmailValidator.validateEmailInput(scanner));

        return email;
    }

    // Вывод уведомления
    public void getOutput(String output) {
        System.out.println(output);
    }
}

