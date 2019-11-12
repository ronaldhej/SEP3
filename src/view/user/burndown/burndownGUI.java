package view.user.burndown;

import controller.user.burndown.burndownController;
import controller.user.dashBoard.dashBoardController;

public class burndownGUI implements burndownView {

    public burndownGUI() {
        burndownController view = new burndownController(this);
    }
}
