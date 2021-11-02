/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ucf.assignments.giolitocop3330assignment4;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


import java.net.URL;
import java.util.ResourceBundle;

public class TodoController implements Initializable{

    private TodoList list;
    private ObservableList<TodoItem> completedItems;

    @FXML
    private Button addB;

    @FXML
    private Button deleteB;

    @FXML
    private TextField date;

    @FXML
    private TextField description;

    @FXML
    private TextField name;

    @FXML
    private TableView<TodoItem> table;

    @FXML
    private TableColumn<TodoItem, String> todoDate;

    @FXML
    private TableColumn<TodoItem, String> todoDescription;

    @FXML
    private TableColumn<TodoItem, Boolean> todoCompletedMarker;

    @FXML
    private TableColumn<TodoItem, String> todoItem;

    @FXML
    private Menu exitMenu;

    @FXML
    private MenuItem menuCompletedItems;

    @FXML
    private MenuItem deleteList;

    @FXML
    private MenuItem changeTitle;

    @FXML
    private MenuItem viewAll;

    @FXML
    public void handleDeleteList() {
        // Delete the list
    }

    @FXML
    public void handleTitle() {
        // Ask the user for a new title and edit the file name
        // If invalid or something is wrong throw exception
    }


    @FXML
    public void handleMarkers() {
        // Check if item is null and set completedItems to the getCompletedMarkers of the list
        // Else if then check if the first item is completed which in that case set completedItems to getUncompletedMarkers of the list
        // Else set it to the getCompletedMarkers and change table data
    }

    @FXML
    public void handleAddButton() {
        // Create new item and read all the data
        // Add to the to-do list using .add
        // throw exception if error
    }

    @FXML
    public void handleDeleteButton() {
        // Delete item by getting the ID of the item
    }

    @FXML
    public void handleExit() {
        // Exit by printing to a file
    }

    @FXML
    public void handleViewAll() {
        // Set completedItems to null
        // Set table by using getList
    }

    @FXML
    public void handleTextChange(){
        // Get ID of item changed
        // Still working on this
    }


    // I might need to change this later or add more methods to allow it to work
    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Set all columns for item, description, date, and the marker
        // Set the table by using getList
        // Set all the information (name, description, date, marker)

    }
}