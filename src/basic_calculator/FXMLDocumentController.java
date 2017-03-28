/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author alamin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField Displayfield;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleoneButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"1";
        Displayfield.setText(newText);
    }

    @FXML
    private void handletwoButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"2";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlethreeButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"3";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlefourButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"4";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlefiveButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"5";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlsixButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"6";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlesevenButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"7";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlezeroButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"0";
        Displayfield.setText(newText);
    }

    @FXML
    private void handleeightButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"8";
        Displayfield.setText(newText);
    }

    @FXML
    private void handlenineButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        String newText=oldText+"9";
        Displayfield.setText(newText);
    }
    

    @FXML
    private void handledotButtonAction(ActionEvent event) {
        String oldText=Displayfield.getText();
        int b=oldText.length();
        if(oldText.indexof('.')!=-1)
        String {
        } else {
                newText=oldText+".";
        }
        Displayfield.setText(newText);
    }
    
}
