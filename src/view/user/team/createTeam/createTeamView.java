package view.user.team.createTeam;

import java.util.List;

public interface createTeamView {
    void clearFilterInput();
    String getSelectedEmployeeItem();
    String getSelectedTeamMemberItem();
    List<String> getTeamMembers();
}
