package com.andrew.moderncalculator_r1;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private TextField displayBox;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button mult;

    @FXML
    private Button div;

    @FXML
    private Button perc;

    @FXML
    private Button ce;

    @FXML
    private Button root;

    @FXML
    private Button square;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point = 0;
    
    @FXML
    void Calculation(ActionEvent event) {
        
        if (event.getSource() == one) {
        
            displayBox.appendText("1");
            
        }
        else if (event.getSource() == two) {
        
            displayBox.appendText("2");
            
        }
        else if (event.getSource() == three) {
        
            displayBox.appendText("3");
            
        }
        else if (event.getSource() == four) {
        
            displayBox.appendText("4");
            
        }
        else if (event.getSource() == five) {
        
            displayBox.appendText("5");
            
        }
        else if (event.getSource() == six) {
        
            displayBox.appendText("6");
            
        }
        else if (event.getSource() == seven) {
        
            displayBox.appendText("7");
            
        }
        else if (event.getSource() == eight) {
        
            displayBox.appendText("8");
            
        }
        else if (event.getSource() == nine) {
        
            displayBox.appendText("9");
            
        }
        else if (event.getSource() == zero) {
        
            displayBox.appendText("0");
            
        }
        else if (event.getSource() == dot && point == 0) {
        
            displayBox.appendText(".");
            point = 1;
            
        }
        else if (event.getSource() == ce) {
        
            displayBox.setText("");
            input1 = 0;
            input2 = 0;
            ps = 0;
            point = 0;
            
        }
        else if (event.getSource() == plus) {
        
            input1 = Double.parseDouble(displayBox.getText());
            displayBox.setText("");
            ps = 1;
            point = 0;
            
        }
        else if (event.getSource() == minus) {
        
            input1 = Double.parseDouble(displayBox.getText());
            displayBox.setText("");
            ps = 2;
            point = 0;
            
        }
        else if (event.getSource() == mult) {
        
            input1 = Double.parseDouble(displayBox.getText());
            displayBox.setText("");
            ps = 3;
            point = 0;
            
        }
        else if (event.getSource() == div) {
        
            input1 = Double.parseDouble(displayBox.getText());
            displayBox.setText("");
            ps = 4;
            point = 0;
            
        }
        else if (event.getSource() == perc) {
        
            input1 = Double.parseDouble(displayBox.getText());
            displayBox.setText("");
            ps = 5;
            point = 0;
            
        }
        else if (event.getSource() == root) {
        
            displayBox.setText(String.valueOf(java.lang.Math.sqrt(Double.parseDouble(displayBox.getText()))));
            
        }
        else if (event.getSource() == square) {
        
            displayBox.setText(String.valueOf(Double.parseDouble(displayBox.getText()) * Double.parseDouble(displayBox.getText())));
            
        }
        else if (event.getSource() == equal) {
        
            input2 = Double.parseDouble(displayBox.getText());
            DecimalFormat td = new DecimalFormat("#.00");
            switch(ps) {
            
                case 1:
                    result = input1 + input2;
                    displayBox.setText(String.valueOf(td.format(result)));
                    break;
                case 2:
                    result = input1 - input2;
                    displayBox.setText(String.valueOf(td.format(result)));
                    break;
                case 3:
                    result = input1 * input2;
                    displayBox.setText(String.valueOf(td.format(result)));
                    break;
                case 4:
                    result = input1 / input2;
                    displayBox.setText(String.valueOf(td.format(result)));
                    break;
                case 5:
                    result = input1 % input2;
                    displayBox.setText(String.valueOf(td.format(result)));
                    break;
            }
            
            ps = 0;
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
