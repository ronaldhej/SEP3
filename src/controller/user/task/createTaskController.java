package controller.user.task;

import Client.Client;
import Model.BacklogItemEntity;
import view.user.task.createTask.createTaskGUI;
import view.user.task.createTask.createTaskView;

import java.io.IOException;
import java.util.List;

import static view.user.task.taskGUI.tasks;

public class createTaskController {
    public  createTaskView view;
    public Client client;

    public createTaskController(createTaskView view, Client client) {
        this.view = view;
        this.client = client;
    }

    public void createTask() throws IOException {
        System.out.println("The task is: " + view.getTask());
        List<BacklogItemEntity> backlogItemEntities = null;
        backlogItemEntities.add(new BacklogItemEntity(view.getTask(), view.getPoints(), view.getPriority()));
        client.CreateBacklog(backlogItemEntities);
        taskController.refresh();
        view.closeWindow();
    }
}
