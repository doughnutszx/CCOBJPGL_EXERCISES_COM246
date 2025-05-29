package com.example;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomeController implements Initializable {

    
    ObservableList<User> mylist = FXCollections.observableArrayList();

    @FXML
    Label usernameLabel;

        @FXML
    private TableColumn<User, String> acColumn;

    @FXML
    private Button createButton;

    @FXML
    private Button deleteButton;

     @FXML
    private TableView<User> mytable;

    @FXML
    private TableColumn<User, String> pwordColumn;

    @FXML
    private TextField pwordField;

    @FXML
    private TableColumn<User, String> statusColumn;

    @FXML
    private ChoiceBox<User> statusDropdown;

    @FXML
    private TableColumn<String, User> unameColumn;

    @FXML
    private TextField unameField;

    @FXML
    private Button updateButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeCol();
        loadData();
        // TODO Auto-generated method stub
        String username = LoginController.user.getUsername();
        usernameLabel.setText(username);
    } 

    private void initializeCol(){

        unameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        pwordColumn.setCellValueFactory(new PropertyValueFactory<>("password"));
        acColumn.setCellValueFactory(new PropertyValueFactory<>("accountcreated"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("accountstatus"));
    }

    private void loadData(){
         mylist.clear();

        try {
            // Create object from File class
            File myFile = new File("accounts.txt");

            // .exists() method checks if a file exists in the pathname
            if (myFile.exists()) {

                Scanner filescanner = new Scanner(myFile);

                while (filescanner.hasNextLine()) {

                    String data = filescanner.nextLine();
        
                    String username = data.split(",")[0];
                    String password = data.split(",")[1];
                    String dcreated = data.split(",")[2];
                    String status = data.split(",")[3];

                    mylist.add(new User(username, password, dcreated, status));
                } 
                mytable.setItems(mylist);

                filescanner.close();
            }
            else {
                System.out.println(myFile.getName() + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
        } 
    }
}

