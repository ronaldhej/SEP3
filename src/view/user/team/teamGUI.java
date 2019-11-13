package view.user.team;

import Client.Client;
import controller.user.team.teamController;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class teamGUI implements teamView {
    public TextField nameTextField;
    private teamController teamController;
    public Client client;

    public teamGUI() {
        client = new Client();
        teamController view = new teamController(this, client);
    }

    public String getNameTextFieldValue() {
        return nameTextField.getText();
    }

    public void addEmployeeBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.addEmployeeBtnPressed();
    }
}
