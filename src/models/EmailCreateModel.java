package models;

import database.DataProvider;
import database.entities.Email;

import java.util.Map;

public class EmailCreateModel {

    // Имитация записи в БД.
    public Map<String, String> createEmail(Email email) {
        return DataProvider.addEmail(email, email);
    }
}
