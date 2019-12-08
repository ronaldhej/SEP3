module SEP_3 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    exports main to javafx.graphics;
    exports view.login to javafx.fxml;
    exports view.user.mainUser to javafx.fxml;
    exports view.user.dashBoard to javafx.fxml;
    exports view.user.burndown to javafx.fxml;
    exports view.user.report to javafx.fxml;
    exports view.user.team to javafx.fxml;
    exports view.user.createTeam to javafx.fxml;
    exports Model to java.base;


    opens view.login to javafx.fxml;
    opens view.user.dashBoard to javafx.fxml;
    opens view.user.mainUser to javafx.fxml;
    opens view.user.burndown to javafx.fxml;
    opens view.user.report to javafx.fxml;
    opens view.user.team to javafx.fxml;
    opens view.user.createTeam to javafx.fxml;
}