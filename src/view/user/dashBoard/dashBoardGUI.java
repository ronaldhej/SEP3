package view.user.dashBoard;

import controller.user.dashBoard.dashBoardController;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class dashBoardGUI implements dashBoardView {
    dashBoardController dashBoardController;


    public dashBoardGUI() {
        this.dashBoardController = new dashBoardController(this);
    }

    public void testBtnPressed(ActionEvent actionEvent) {
        System.out.println("Test button pressed");
    }
}
