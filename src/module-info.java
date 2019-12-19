module SEP_3 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires google.http.client;
    requires google.http.client.jackson2;

    // git ignore test

    exports main to javafx.graphics;
    exports view.login to javafx.fxml;
    exports view.user.mainUser to javafx.fxml;
    exports view.user.dashBoard to javafx.fxml;
    exports view.user.burndown to javafx.fxml;
    exports view.user.report to javafx.fxml;
    exports view.user.team to javafx.fxml;
    exports view.user.team.createTeam to javafx.fxml;
    exports view.user.team.editTeam to javafx.fxml;
    exports view.user.task to javafx.fxml;
    exports view.user.task.createTask to javafx.fxml;
    exports view.user.task.editTask to javafx.fxml;
    exports view.user.team.createEmployee to javafx.fxml;
    exports Model to java.base;


    opens view.login to javafx.fxml;
    opens view.user.dashBoard to javafx.fxml;
    opens view.user.mainUser to javafx.fxml;
    opens view.user.burndown to javafx.fxml;
    opens view.user.report to javafx.fxml;
    opens view.user.team to javafx.fxml;
    opens view.user.team.createTeam to javafx.fxml;
    opens view.user.team.editTeam to javafx.fxml;
    opens view.user.task to javafx.fxml;
    opens view.user.task.createTask to javafx.fxml;
    opens view.user.task.editTask to javafx.fxml;
    opens view.user.team.createEmployee to javafx.fxml;
    opens Model to javafx.base;
}