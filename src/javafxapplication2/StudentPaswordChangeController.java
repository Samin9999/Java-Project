/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tanzimul Hoque
 */
public class StudentPaswordChangeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private PasswordField previousPassword;
    
    @FXML 
    private PasswordField newPassword;
    
    @FXML 
    private PasswordField confirmNewPassword;
    
    @FXML
    private Button confirm;
    
    String previousPasswordString;
    
    String newPasswordString;
    
    String confirmNewPasswordString;
    
    public void confirmButton(ActionEvent event){
        previousPasswordString= previousPassword.getText();
        
        newPasswordString = newPassword.getText();
      
        confirmNewPasswordString = confirmNewPassword.getText();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
