/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class LoginPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField id;
    
    @FXML 
    private PasswordField password;
    
    @FXML
    private Button confirm;
    
    
    @FXML 
    private Label enterName;
    
    @FXML 
    private Label enterPass;
    
    @FXML 
    private ChoiceBox Identity;
    
    
    String idString;
    String passwordString;
    String status;
    int a;
    
    /**
     *
     * @param event
     */
    
    
    
   @FXML
    private Button back;
    
    @FXML
    public void back(ActionEvent event) throws IOException{
        
        Parent root5;
        
        root5 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
      
        Scene scene5;
        scene5 = new Scene(root5);
        
        Stage window5 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window5.setScene(scene5);
        window5.show();
    }
    @FXML
    public void confirmButton(ActionEvent event) throws IOException{
        idString= id.getText();
        
        passwordString = password.getText();
       
        status = Identity.getValue().toString();
        
        id.clear();
        password.clear();
       
        
        
        Parent root2;

        if("Student".equals(status)){
            root2 = FXMLLoader.load(getClass().getResource("StudentPage.fxml"));
        } else {
            root2 = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        }
        Scene scene2;
        scene2 = new Scene(root2);
        
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window2.setScene(scene2);
        window2.show();
        
    }
    
    
    
    /**
     *
     * @
    
    
    
    
    
    
    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Identity.getItems().clear();
        Identity.getItems().add("Student");
        Identity.getItems().add("Admin");
    }    

    
    
}
