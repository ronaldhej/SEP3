package controller.user.createTeam;

import Client.Client;
import controller.user.team.teamController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import view.user.createTeam.createTeamView;

public class createTeamController {
    public createTeamView view;
    public Client client;

    public createTeamController(createTeamView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void refreshTeamGUI() throws Exception {
        teamController.refreshScene();
    }
}
