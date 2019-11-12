package view.user.team;

import controller.user.team.teamController;

public class teamGUI implements teamView {

    public teamGUI() {
        teamController view = new teamController(this);
    }
}
