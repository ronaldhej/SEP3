package controller.user.team;


import view.user.team.editTeam.editTeamView;

public class editTeamController {
    public editTeamView view;


    public editTeamController(editTeamView view) {
        this.view = view;
    }

    public void refreshTeamGUI() throws Exception {
        teamController.refreshScene();
    }

}
