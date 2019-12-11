package view.user.team;

import Model.Team;
import controller.user.team.teamController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class teamGUI implements teamView {
    public TextField nameTextField;
    public TableView teamTableView;
    public Button createTeamBtn;
    private teamController teamController;

    public teamGUI() {
        this.teamController = new teamController(this);
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

    public void modifyTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        teamController.modifySelectedTeam();
    }

    public void refresh() {
        System.out.println("Refreshed successfully");
    }
}
