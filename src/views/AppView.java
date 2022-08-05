package views;

import models.AppModel;
import utils.OptionValidator;

import java.util.Scanner;

public class AppView {
    AppModel model;
    Scanner scanner;
    int choice;

    public AppView(AppModel model) {
        this.model = model;
    }

    public int doChoice() {

        int option;
        scanner = new Scanner(System.in);

        System.out.print("""
                --------------------------
                Choose an option:
                1 - Create email.
                2 - View emails.
                0 - Close the application.
                """);

        choice = OptionValidator.validateOption(scanner);
        model.setChoice(choice);
        option = model.getChoice();

        return option;
    }

    public void getOutput(String output, int choice) {
        if (choice == 0) System.out.println(output);
        // Scanner лучше закрыть здесь,
        // т.к. в этом методе завершаем программу.
        scanner.close();
        System.exit(0);
    }
}
