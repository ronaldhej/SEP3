package controller.user.team;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.user.team.teamView;

public class teamController {
    public static teamView view;

    public teamController(teamView view) {
        this.view = view;
    }


    public void createTeamWindow() throws Exception {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/view/user/team/createTeam/createTeamGUI.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/stylesheets/createTeamGUI.css").toExternalForm());
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
