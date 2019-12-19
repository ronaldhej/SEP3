package view.user.team;

import Client.Client;
import Model.Team;
import controller.user.team.teamController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Arrays;
import java.util.List;

public class teamGUI implements teamView {

    public final Client client;
    public TableView teamTableView;
    public Button createTeamBtn;
    public TableColumn taskColumn;
    public TableColumn membersColumn;
    public TableColumn durationWorkedColumn;
    private teamController teamController;

    public teamGUI() {
        this.teamController = new teamController(this, client = new Client());
    }

    @FXML
    public void initialize() {
        taskColumn.setCellValueFactory(new PropertyValueFactory<>("teamTasks"));
        membersColumn.setCellValueFactory(new PropertyValueFactory<>("members"));
        durationWorkedColumn.setCellValueFactory(new PropertyValueFactory<>("timeWorked"));

        List<String> teamOneMembers = Arrays.asList("Ronald", "Ronnie", "Ron");
        List<String> teamOneTasks = Arrays.asList("Server", "GUI");
        Team teamOne;
        teamOne = new Team(32,teamOneMembers,teamOneTasks,40);
        teamTableView.getItems().add(teamOne);
    }

    public Team getSelectedTeam() {
        return (Team) teamTableView.getSelectionModel().getSelectedItem();
    }

    public teamController getTeamController() {
        return teamController;
    }


    public void createTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.createTeamWindow();
    }

    public void deleteTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.deleteSelectedTeam();
    }

    public void editTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.editTeamWindow();
    }

    public void refresh() {
        // refresh tableView of teams
        System.out.println("Refreshed successfully");
    }

    public void createEmployeeBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.createEmployeeWindow();
    }
}
