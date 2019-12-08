package view.user.createTeam;

import Client.Client;
import controller.user.createTeam.createTeamController;
import javafx.event.ActionEvent;

import java.lang.reflect.AccessibleObject;

public class createTeamGUI implements createTeamView {
    public Client client;
    public createTeamController createTeamController;

    public createTeamGUI() {
        client = new Client();
        createTeamController = new createTeamController(this, client);
    }


    public void createTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        System.out.println("Refresh Button pressed");
        createTeamController.refreshTeamGUI();
    }
}
