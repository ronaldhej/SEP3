package controller.user.team;


import Client.Client;
import view.user.team.createTeam.createTeamView;

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

    public void getTeamInfo() {
        view.getTeamMembers();
    }
}
