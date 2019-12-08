package view.user.team;

import Client.Client;
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
    public Client client;

    public teamGUI() {
        client = new Client();
        this.teamController = new teamController(this, client);
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
        createTeamBtn.setText("Success!");
    }
}
