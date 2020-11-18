package elevator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class Controller {

    @FXML
    public TextField display;

    public Integer currentFloor = 0;

    public void numButtonOnClick(ActionEvent actionEvent) {
        ToggleButton button = ((ToggleButton) actionEvent.getSource());
        if (button.isSelected()) {
            Integer floor = Integer.parseInt(button.getText());
            if (floor > currentFloor) {
                display.setText(floor + " ↑");
            } else if (floor < currentFloor) {
                display.setText(floor + " ↓");
            }
            currentFloor = floor;
        }
    }

    public void otherButtonOnClick(ActionEvent actionEvent) {
        display.setText(((ToggleButton) actionEvent.getSource()).getText());
    }

}
