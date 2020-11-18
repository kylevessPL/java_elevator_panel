package elevator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class Controller {

    @FXML
    public TextField display;

    public Integer currentFloor = 0;
    public boolean up = true;

    public void numButtonOnClick(ActionEvent actionEvent) {
        ToggleButton button = ((ToggleButton) actionEvent.getSource());
        if (button.isSelected()) {
            Integer floor = Integer.parseInt(button.getText());
            if (floor > currentFloor) {
                up = true;
            } else if (floor < currentFloor) {
                up = false;
            }
            display.setText(floor + (up ? " ↑" : " ↓"));
            currentFloor = floor;
        }
    }

    public void otherButtonOnClick(ActionEvent actionEvent) {
        display.setText(((ToggleButton) actionEvent.getSource()).getText());
    }

}
