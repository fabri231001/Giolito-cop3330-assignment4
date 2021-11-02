/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ucf.assignments.giolitocop3330assignment4;

import javafx.collections.ObservableList;
import java.util.List;

public class TodoList {

    private ObservableList<TodoItem> list;
    private String fName;
    private String title;

    public TodoList(List<TodoItem> gList, String fName, String title){
        // Make To-do list with the items from the given list
        // Set fName using this.
        // Set title using this.
    }

    public void addItem(TodoItem item){
        // Add item to the list through .add
    }

    public void add(String name, String description, String dueDate){
        // Call TodoItem constructor with name, description and dueDate
        // Give next available ID from the list (numerical order)
        // Add item to list with .add
    }

    public void delete(String itemID){
        // Delete from the list using .remove
    }

    public void editTitle(String title){
        // Change title of the list using this.
    }

    public void editDescription(String itemID, String description){
        // Using get with the itemID then use the editDescription
    }

    public void editDueDate(String itemID, String date){
        // Make sure the format is correct, throw exception otherwise
        // Use get with the itemID and use editDueDate
    }

    public void changeCompletedMark(String itemID){
        // Use get with the itemID and call changeCompletedMark
    }

    public ObservableList<TodoItem> getList(){
        //return list
        return list;
    }

    public String getfName() {
        //return fName
        return fName;
    }

    private int getPos(String itemID){
        // Return index of the item in the list with the given ID
        return 0;
    }

    public TodoItem get(String itemID){
        // Return item with the given ID
        return null;
    }

    public ObservableList<TodoItem> getIncompletedItems(){
        // Create a new list and add any items with the completedMarker on false
        // Return list
        return null;
    }

    public ObservableList<TodoItem> getCompletedItems(){
        // Create a new list and add any items with the completedMarker on true
        // Return list
        return null;
    }

    public String getTitle(){
        // Return title
        return title;
    }

    public void editfName(String name){
        // Create a new file and a writer and use this. to translate all data
        // Change fName to name with this.
    }

    public void deleteList(){
        // Deletes the file
    }

    public void printFile(){
        // Create a new file and print the list
    }
}
