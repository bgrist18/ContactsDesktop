package com.theironyard;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import sample.Contact;

import java.io.*;
import java.net.URL;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Contacts Desktop");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static class Controller implements Initializable {

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
        public void initialize(URL location, ResourceBundle resources)

    }





    public void saveContacts() throws IOException {
        File contactsJson = new File("Contacts");
        JsonSerializer serializer;
        serializer = new JsonSerializer();
        ArrayList<Contact> contactArrayList = new ArrayList<>();
        contactArrayList.addAll("Contacts");
        ContactWrapper = new ContactWrapper(contactArrayList);
        String json = serializer.deep(true).serialize(ContactWrapper);
        FileWriter writeJson = new FileWriter(contactsJson);
        writeJson.write(json);
        writeJson.close();
    }
}