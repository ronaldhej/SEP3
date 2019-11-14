package view.user.burndown;

import controller.user.burndown.burndownController;
import controller.user.dashBoard.dashBoardController;

public class burndownGUI implements burndownView {
    burndownController burndownController;

    public burndownGUI() {
        this.burndownController = new burndownController(this);
    }
}
