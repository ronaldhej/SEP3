package controller.user.team;


import Client.Client;
import view.user.team.editTeam.editTeamView;

public class editTeamController {
    public editTeamView view;
    public Client client;


    public editTeamController(editTeamView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void refreshTeamGUI() throws Exception {
        teamController.refreshScene();
    }

    public void printSelectedTeamFromTeamMenu() {
        System.out.println(teamController.getSelectedItem().toString());
    }

}
