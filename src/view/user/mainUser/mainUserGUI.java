package view.user.mainUser;

import controller.user.mainUserController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainUserGUI implements mainUserView {
    public Pane dashBoardPane;
    public Pane reportPane;
    public Pane burndownPane;
    public Pane teamPane;

    private mainUserController mainUserGUIController;
    public Button btnLogout;

    public mainUserGUI() {
        this.mainUserGUIController = new mainUserController(this);
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

    public void reportButtonPressed(ActionEvent actionEvent) {
        reportPane.toFront();
    }

    public void burndownButtonPressed(ActionEvent actionEvent) {
        burndownPane.toFront();

    }

    public void teamButtonPressed(ActionEvent actionEvent) {
        teamPane.toFront();
    }
}
