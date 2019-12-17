package view.user.task.createTask;

import controller.user.task.createTaskController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class createTaskGUI implements createTaskView {
    public TextField taskInput;
    public Button createButton;
    createTaskController createTaskController;

    public createTaskGUI() {
        this.createTaskController = new createTaskController(this);
    }

    public void createTaskBtnPressed(ActionEvent actionEvent) {
        createTaskController.createTask(taskInput.getText());
    }

    public void closeWindow() {
        Stage stage = (Stage) createButton.getScene().getWindow();
        stage.close();
    }
}
