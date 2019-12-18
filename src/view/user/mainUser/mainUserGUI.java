package view.user.mainUser;

import Client.Client;
import controller.user.mainUserController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainUserGUI implements mainUserView {
    public final Client client;
    public Pane dashBoardPane;
    public Pane burndownPane;
    public Pane teamPane;
    public Pane taskPane;

    private mainUserController mainUserGUIController;
    public Button btnLogout;

    public mainUserGUI() {
        this.mainUserGUIController = new mainUserController(this, client = new Client());
    }


    public void closeWindow() {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
    }

    public void logoutButtonPressed(ActionEvent actionEvent) {
        mainUserGUIController.logoutButtonPressed();
    }

    public void dashBoardButtonPressed(ActionEvent actionEvent) {
        dashBoardPane.toFront();
    }

    public void burndownButtonPressed(ActionEvent actionEvent) {
        burndownPane.toFront();

    }

    public void teamButtonPressed(ActionEvent actionEvent) {
        teamPane.toFront();
    }

    public void taskButtonPressed(ActionEvent actionEvent) {
        taskPane.toFront();
    }
}
