package view.user.task.editTask;

import Client.Client;
import controller.user.task.editTaskController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class editTaskGUI implements editTaskView {
    public final Client client;
    public editTaskController editTaskController;
    public Button saveButton;
    public TextField taskInput;

    public editTaskGUI() {
        this.editTaskController = new editTaskController(this, client = new Client());
    }

    public void editTaskBtnPressed(ActionEvent actionEvent) {
    }
}
