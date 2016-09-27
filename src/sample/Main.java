package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jodd.json.JsonParser;

import java.io.File;
import java.io.FileReader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    package com.theironyard;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

    /**
     * Created by brettgrist on 9/27/16.
     */
    public class readwritejson {
        static com.theironyard.Contact load(String fileName) {
            File f = new File(fileName);
            try {
                FileReader fr = new FileReader(f);
                int fileSize = (int) f.length();     //cast to int
                char[] contents = new char[fileSize];
                fr.read(contents, 0, fileSize);
                JsonParser parser = new JsonParser();
                return parser.parse(contents, com.theironyard.Contact.class);
            }
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
