package view.user.team.createEmployee;

import Client.Client;
import controller.user.team.createEmployeeController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class createEmployeeGUI implements createEmployeeView {

    public final Client client;
    public createEmployeeController createEmployeeController;
    public TextField nameInput;
    public TextField passwordInput;
    public Button createEmployeeButton;


    public createEmployeeGUI() {
        createEmployeeController = new createEmployeeController(this, client = new Client());
    }

    public void createEmployeeBtnPressed(ActionEvent actionEvent) throws IOException {
        createEmployeeController.createEmployee();

    }

    public String getName() {
        return nameInput.getText();
    }

    public String getPassword() {
        return passwordInput.getText();
    }

    public void closeWindow() {
        Stage stage = (Stage) createEmployeeButton.getScene().getWindow();
        stage.close();

    }
}
