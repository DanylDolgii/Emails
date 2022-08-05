package models;

import database.DataProvider;

import java.util.Map;

public class EmailReadModel {

    // Имитация чтения из БД.
    public Map<String, String> readEmails() {
        return DataProvider.getEmails();
    }
}
