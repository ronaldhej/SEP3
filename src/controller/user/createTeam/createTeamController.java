package controller.user.createTeam;


import controller.user.team.teamController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import view.user.createTeam.createTeamView;

public class createTeamController {
    public createTeamView view;


    public createTeamController(createTeamView view) {
        this.view = view;
    }

    public void refreshTeamGUI() throws Exception {
        teamController.refreshScene();
    }
}
