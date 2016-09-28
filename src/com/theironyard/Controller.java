package com.theironyard;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import sample.Contact;

import java.net.URL;
import java.util.ResourceBundle;

import static a.a.b.h.n;

public class Controller implements Initializable {

    @FXML
    TextField nameField;

    @FXML
    TextField phoneField;

    @FXML
    TextField emailField;

    @FXML
    ListView contactList;

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void addContact(){
        String n = nameField.getText();
        String p = phoneField.getText();
        String e = emailField.getText();
        Contact contact = new Contact(n, p, e);

    }

    public void removeContact(){
        Contact contact = (Contact) contactList.getSelectionModel().getSelectedItem();
        contacts.remove(contact);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
