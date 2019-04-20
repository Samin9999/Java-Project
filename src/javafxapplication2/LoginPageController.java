/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import static java.awt.SystemColor.window;
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
    private TextField as;
    
    @FXML 
    private PasswordField pass;
    
    @FXML
    private Button confirm;
    
    @FXML
    private Button signup;
    @FXML 
    private Label enterName;
    
    @FXML 
    private Label enterPass;
    
    @FXML 
    private ChoiceBox Identity;
    
    
    String name;
    String password;
    String status;
    
    /**
     *
     * @param event
     */
    public void confirmButton(ActionEvent event){
        name= as.getText();
        System.out.println(name);
        password = pass.getText();
        System.out.println(password);
        status = Identity.getValue().toString();
        System.out.println(status);
    }
    
    /**
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void handleSignup(ActionEvent event) throws IOException{
        
        Parent root2;
        root2 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        
        Scene scene2;
        scene2 = new Scene(root2);
        
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(scene2);
        window2.show();
    }
    
    
    
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
        Identity.getItems().add("Teacher");
    }    

    
    
}
