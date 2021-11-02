/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ucf.assignments.giolitocop3330assignment4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class OpeningScreenController implements Initializable {


    private String fName;

    @FXML
    private Button createNewList;

    @FXML
    private Button exportList;

    @FXML
    private Button importList;

    @FXML
    private ChoiceBox<String> listChoice;

    @FXML
    private TextField newList;

    @FXML
    private Button openList;

    @FXML
    public void handleCreate() {
        // Create a new file from newList
        // Set to fName to newList
    }

    @FXML
    public void handleOpening() {
        // Set fName to String from listChoice
    }

    @FXML
    public void handleImport() {
        // Select a file to be imported and check it wil checkImport
        //If it returns true copy file and set fName
        // If false display error or throw exception
    }

    private boolean checkImport(String importFile) {
        // Read the data from importFile and make sure it is in the proper format to be parsed
        // Return status
        return false;
    }

    @FXML
    public void handleExport() {
        // select File from listChoice
        // ask user for a file name
        // copy file to new location
    }

    public String getFileName() {
        // Return fileName
        return fName;
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Read all fileNames from ./data/persistence
        // Set listChoice from the names read
    }

}