package controller.user.task;

import Client.Client;
import view.user.task.createTask.createTaskGUI;
import view.user.task.createTask.createTaskView;

import static view.user.task.taskGUI.tasks;

public class createTaskController {
    public  createTaskView view;
    public Client client;

    public createTaskController(createTaskView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void createTask(String task) {
        System.out.println("The task is: " + task);
        tasks.add(task);
        taskController.refresh();
        view.closeWindow();
    }
}
