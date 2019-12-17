package controller.user.team;


import view.user.team.createTeam.createTeamView;

public class createTeamController {
    public createTeamView view;


    public createTeamController(createTeamView view) {
        this.view = view;
    }

    public void refreshTeamGUI() throws Exception {
        teamController.refreshScene();
    }

    public void getTeamInfo() {
        view.getTeamMembers();
    }
}
