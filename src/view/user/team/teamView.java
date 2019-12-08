package view.user.team;

import Model.Team;
import controller.user.team.teamController;

public interface teamView {
    Team getSelectedTeam();
    void refresh();
    teamController getTeamController();
}
