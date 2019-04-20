/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Tanzimul Hoque
 */
public class TeacherPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label id;
    
    @FXML
    private Label fullName;
    
    @FXML
    private Label department;
            
    @FXML
    private Label phoneNumber;
    
    @FXML
    private Label email;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        email.setText("sas");
    }    
    
}
