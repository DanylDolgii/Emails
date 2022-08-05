package database;

import database.entities.Email;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    static Map<String, String> map;

    public static Map<String, String> getEmails() {

        map = new HashMap<>();
        map.put("Sasha", "sasha@mail.com");
        map.put("Valera", "valera@mail.com");
        map.put("Adelina", "adelina@mail.com");
        map.put("Dima" ,"dima@mail.com");
        map.put("Anya","anya@mail.com");

        return map;

    }

    public static Map<String, String> addEmail(Email name, Email email) {
        getEmails();
        map.put(name.getName(), email.getEmail());

        return map;
    }
}
