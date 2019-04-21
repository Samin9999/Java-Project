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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
