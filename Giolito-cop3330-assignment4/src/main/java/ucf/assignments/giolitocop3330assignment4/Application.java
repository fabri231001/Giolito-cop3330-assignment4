/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ucf.assignments.giolitocop3330assignment4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TodoList.fxml"));
        Parent root = (Parent)fxmlLoader.load();
        TodoController controller = fxmlLoader.<TodoController>getController();

        // This will load the Opening screen and the To-do list
        // Until the file is given, the opening screen will be the only thing displayed
        // I'm still having trouble with the amount of times the function for the file name should be called
        // After a file is received we hide the opening screen
        // Call the setTable method with the readData function and initialize the table
        // Display the table


        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static TodoList readData(String name){

        // Read the file and parse it
        // Create list
        // Add every item based on the lines


        // I currently have two options for errors but for now close the program and return error

        // Return a new TodoList
        return null;
    }
}