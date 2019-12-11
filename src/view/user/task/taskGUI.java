package view.user.task;

import controller.user.task.taskController;
import javafx.event.ActionEvent;

public class taskGUI implements taskView {
    taskController taskController;


    public taskGUI() {
        this.taskController = new taskController(this);
    }

    public void testBtnPressed(ActionEvent actionEvent) {
        taskController.test();
    }

}
