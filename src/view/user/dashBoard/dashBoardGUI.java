package view.user.dashBoard;

import Client.Client;
import controller.user.dashBoard.dashBoardController;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class dashBoardGUI implements dashBoardView {
    dashBoardController dashBoardController;
    public final Client client;


    public dashBoardGUI() {
        this.dashBoardController = new dashBoardController(this, client = new Client());
    }

    public void testBtnPressed(ActionEvent actionEvent) {
        System.out.println("Test button pressed");
    }
}
