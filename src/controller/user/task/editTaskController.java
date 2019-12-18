package controller.user.task;

import Client.Client;
import view.user.task.editTask.editTaskView;

public class editTaskController {

    public editTaskView view;
    public Client client;

    public editTaskController(editTaskView view, Client client) {
        this.view = view;
        this.client = client;
    }

}
