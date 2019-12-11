package controller.user.task;

import view.user.task.taskView;

public class taskController {
    public static taskView view;

    public taskController(taskView view) {
        this.view = view;
    }

    public void test() {
        System.out.println("This is from the task controller");
    }


}
