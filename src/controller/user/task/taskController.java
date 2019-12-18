package controller.user.task;

import Client.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.user.task.taskView;

public class taskController {
    public static taskView view;
    public Client client;

    public taskController(taskView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public static void refresh() {
       // refresh list of tasks
        view.refresh();
    }

    public void createTaskWindow() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/user/task/createTask/createTaskGUI.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = new Stage();

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
