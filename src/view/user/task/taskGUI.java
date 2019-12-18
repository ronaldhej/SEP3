package view.user.task;

import Client.Client;
import controller.user.task.taskController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class taskGUI implements taskView {
    public final Client client;
    public TextField filterInput;
    public ListView<String> taskListView;
    taskController taskController;
    public static ObservableList<String> tasks = FXCollections.observableArrayList();


    public taskGUI() {
        this.taskController = new taskController(this, client = new Client());
    }

    @FXML
    public void initialize() {
        tasks.add("Create GUI");
        tasks.add("Create server");
        tasks.add("Create backend stuff");

        taskListView.setItems(tasks);
        searchFilter();

        filterInput.focusedProperty().addListener(obs -> {
            searchFilter();
        });
    }


    public void createTaskBtnPressed(ActionEvent actionEvent) {
        taskController.createTaskWindow();
    }

    public void editTaskBtnPressed(ActionEvent actionEvent) {
    }

    public void removeTaskBtnPressed(ActionEvent actionEvent) {
    }

    public void assignTaskBtnPressed(ActionEvent actionEvent) {
    }

    public void refresh() {
        //refresh list of tasks
        taskListView.setItems(tasks);
        System.out.println("Refreshed task list successfully");
    }


    public void searchFilter() {
        FilteredList<String> filteredTasks = new FilteredList<>(tasks, s -> true);
        filterInput.textProperty().addListener(obs -> {
            String filter = filterInput.getText();
            if(filter == null || filter.length() == 0) {
                filteredTasks.setPredicate(s ->  true);
            } else {
                filteredTasks.setPredicate(s -> s.toLowerCase().contains(filter.toLowerCase()));
            }
        });

        taskListView.setItems(filteredTasks);
    }
}
