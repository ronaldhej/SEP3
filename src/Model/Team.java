package Model;

import java.util.List;

public class Team {
    public int teamID;
    public List<String> members;
    public List<String> teamTasks;
    public int timeWorked;

    public Team(int teamID, List<String> members, List<String> teamTasks, int timeWorked) {
        this.teamID = teamID;
        this.members = members;
        this.teamTasks = teamTasks;
        this.timeWorked = timeWorked;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
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
                "teamID='" + teamID + '\'' +
                ", members=" + members +
                ", teamTasks=" + teamTasks +
                ", timeWorked=" + timeWorked +
                '}';
    }

    public Team() {

    }
}
