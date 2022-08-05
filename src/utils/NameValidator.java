package utils;

import java.util.Scanner;

public class NameValidator {

    // валидация ввода имени
    public static String validateNameInput(Scanner scanner) {
        String string = scanner.nextLine().trim();
        while (string.isEmpty()) {
            System.out.println(Constants.NAME_EMPTY_MSG);
            string = scanner.nextLine().trim();
        }
        return string;
    }
}
