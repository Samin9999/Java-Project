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





public class EditStudentInfoController implements Initializable {

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
    private TextField motherName;
    
    @FXML
    private TextField fatherName;
    
    @FXML
    private TextField year;
    
    @FXML
    private TextField semester;
    
   
    @FXML
    private TextField address;
    
    @FXML
    private TextField result;
    
    @FXML 
    private Button confirm; 
    
    
    
    String idString;
    String nameString;
    String departmentString;
    String phoneNumberString;
    String emailString;
    String fatherNameString;
    String motherNameString;
    String yearString;
    String semesterString;
    String addressString;
    String resultString;
    
    public void confirmButton(ActionEvent event){
        idString= id.getText();
        
        nameString = name.getText();
      
        departmentString = department.getText();
        
        phoneNumberString = phoneNumber.getText();
        
        emailString = email.getText();
        
        fatherNameString = fatherName.getText();
        
        motherNameString = motherName.getText();
        
        yearString = year.getText();
        
        semesterString = semester.getText();
        
        addressString = address.getText();
        
        resultString = result.getText();
        
  
         
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
