package view.user.createTeam;

import controller.user.createTeam.createTeamController;
import javafx.event.ActionEvent;

import java.lang.reflect.AccessibleObject;

public class createTeamGUI implements createTeamView {

    public createTeamController createTeamController;

    public createTeamGUI() {
        createTeamController = new createTeamController(this);
    }


    public void createTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        System.out.println("Refresh Button pressed");
        createTeamController.refreshTeamGUI();
    }
}
