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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tanzimul Hoque
 */
public class SignUpController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField id;
    
    @FXML
    private TextField name;
    
    @FXML
    private TextField department;
    
    @FXML
    private TextField phoneNumber;
    
    @FXML
    private TextField email;
    
    @FXML
    private TextField authenCode;
    
    
    
    @FXML 
    private Button confirm; 
    
    
    
    String idString;
    String nameString;
    String departmentString;
    String phoneNumberString;
    String emailString;
    String authenCodeString;
    
    
    public void confirmButton(ActionEvent event){
        idString= id.getText();
        
        nameString = name.getText();
      
        departmentString = department.getText();
        
        phoneNumberString = phoneNumber.getText();
        
        emailString = email.getText();
        
        authenCodeString = authenCode.getText();
       
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
