package Model;

import java.util.List;

public class Team {
    public String teamID;
    public List<String> members;
    public List<String> teamTasks;
    public int timeWorked;


    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getTeamTasks() {
        return teamTasks;
    }

    public void setTeamTasks(List<String> teamTasks) {
        this.teamTasks = teamTasks;
    }

    public int getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(int timeWorked) {
        this.timeWorked = timeWorked;
    }

    @Override
    public String toString() {
        return "Team{" +
                "members=" + members +
                '}';
    }

    public Team() {

    }
}
