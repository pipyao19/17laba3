package sample4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller4 {
    @FXML
    TextField valueA;
    @FXML
    TextField valueB;
    @FXML
    TextField valueSum;

    @FXML
    public void sum(ActionEvent actionOne){
        double a = Double.parseDouble(valueA.getText());
        double b = Double.parseDouble(valueB.getText());
        valueSum.setText(Double.toString(a+b));
    }

    @FXML
    public void clear(ActionEvent actionTwo){
        valueA.setText("");
        valueB.setText("");
        valueSum.setText("");
    }
}
