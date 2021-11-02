/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

package ucf.assignments.giolitocop3330assignment4;

import java.util.*;

public class TodoItem {

    private String name;
    private String description;
    private String dueDate;
    private String itemID;

    private Boolean completedMark;

    public TodoItem(String name, String dueDate, String description){
        // Set name, due date, and description using this.
        // Make completedMark false
    }

    public void editDescription(String newDescription){
        // Change description using this.
    }

    public void setItemID(String ID){
        //set ID using this.
    }

    public void editDueDate(String newDueDate){
        // Change due date using this.
        // Edit: if in the wrong format throw exception
        // If no date is given leave empty ""
    }

    public void changeCompletedMark(){
        // If false, change to true
        // If true, change to false (not needed but if user didn't finish or wants to change it
    }

    public String getName(){
        // Return name
        return name;
    }

    public String getDescription(){
        // Return description
        return description;
    }

    public String getDueDate(){
        // Return due date
        return dueDate;
    }

    public String getItemID(){
        // Return itemID
        return itemID;
    }

    public boolean getCompletedMark(){
        // Return completedMark
        return completedMark;
    }


}
