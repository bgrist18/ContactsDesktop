package sample;

import javafx.collections.ObservableList;

/**
 * Created by brettgrist on 9/27/16.
 */
public class Contact {
    String name;
    String email;
    String phone;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, email, phone);
    }
}
