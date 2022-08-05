package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionValidator {

    public static int validateOption(Scanner scanner) {

        // массив для выбора действий
        int[] options = {0, 1, 2};
        int input;
        String string = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Constants.NAN_MSG, str);
        }
        input = scanner.nextInt();

        while (!contains(options, input)) {
            System.out.println(Constants.NO_SUCH_OPTION_MSG);
            while (!scanner.hasNextInt()) {
                try {
                    string = scanner.nextLine().trim();
                } catch (InputMismatchException ime) {
                    System.out.printf(Constants.NAN_MSG, string);
                }
            }
            input = scanner.nextInt();
        }
        return input;
    }

    // Проверка наличия ввода в массиве выбора
    // действий через contains()
    public static boolean contains(final int[] array, final int value) {
        boolean result = false;
        for (int i : array) {
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
