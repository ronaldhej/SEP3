package controller.user.task;

import view.user.task.createTask.createTaskGUI;
import view.user.task.createTask.createTaskView;

import static view.user.task.taskGUI.tasks;

public class createTaskController {
    public  createTaskView view;

    public createTaskController(createTaskView view) {
        this.view = view;
    }

    public void createTask(String task) {
        System.out.println("The task is: " + task);
        tasks.add(task);
        taskController.refresh();
        view.closeWindow();
    }
}
