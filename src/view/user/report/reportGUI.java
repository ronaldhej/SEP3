package view.user.report;

import controller.user.dashBoard.dashBoardController;
import controller.user.report.reportController;

public class reportGUI implements reportView {

    public reportGUI() {
        reportController view = new reportController(this);
    }
}
