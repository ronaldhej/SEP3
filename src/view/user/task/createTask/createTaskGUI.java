package view.user.task.createTask;

import Client.Client;
import controller.user.task.createTaskController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class createTaskGUI implements createTaskView {
    public final Client client;
    public TextField taskInput;
    public Button createButton;
    public TextField pointsInput;
    public TextField priorityInput;
    createTaskController createTaskController;

    public createTaskGUI() {
        this.createTaskController = new createTaskController(this, client = new Client());
    }

    public void createTaskBtnPressed(ActionEvent actionEvent) throws IOException {
        createTaskController.createTask();
    }

    public void closeWindow() {
        Stage stage = (Stage) createButton.getScene().getWindow();
        stage.close();
    }

    public String getTask() {
        return taskInput.getText();
    }

    public String getPoints() {
        return pointsInput.getText();
    }

    public String getPriority() {
        return priorityInput.getText();
    }
}
