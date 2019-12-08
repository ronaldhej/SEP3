package controller.user.team;

import Client.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.user.team.teamView;

public class teamController {
    public static teamView view;
    public Client client;

    public teamController(teamView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public void createTeamWindow() throws Exception {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/view/user/createTeam/createTeamGUI.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = new Stage();

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void deleteSelectedTeam() {
        System.out.println("Delete selected team");
    }

    public void modifySelectedTeam() {
        System.out.println("Modify selected team");
    }

    public static void refreshScene() {
        view.refresh();
    }

}
