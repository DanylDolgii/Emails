package utils;

import java.util.Scanner;

public class EmailValidator {

    // валидация ввода почты
    public static String validateEmailInput(Scanner scanner) {
        String string = scanner.nextLine().trim();
        while (string.isEmpty()) {
            System.out.println(Constants.EMAIL_EMPTY_MSG);
            string = scanner.nextLine().trim();
        }
        return string;
    }
}
