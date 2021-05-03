package sample5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller5 {
    @FXML
    TextField valueO;

    @FXML
    public void plus(ActionEvent actionOne){
        double a = Double.parseDouble(valueO.getText());
        valueO.setText(Double.toString(a+1));
    }

    @FXML
    public void minus(ActionEvent actionTwo){
        double a = Double.parseDouble(valueO.getText());
        valueO.setText(Double.toString(a-1));
    }
}