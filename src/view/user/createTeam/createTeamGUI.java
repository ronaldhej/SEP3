package view.user.createTeam;

import controller.user.createTeam.createTeamController;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.lang.reflect.AccessibleObject;
import java.util.List;

public class createTeamGUI implements createTeamView {

    public createTeamController createTeamController;
    public ListView employeeListView;
    public TextField filterInput;
    public ListView teamListView;

    public createTeamGUI() {
        createTeamController = new createTeamController(this);
    }

    @FXML
    public void initialize() {
        ObservableList<String> employees = FXCollections.observableArrayList();
        employees.add("Ronald");
        employees.add("Pdawg");
        employees.add("Bobby");
        employees.add("Dziugas");
        FilteredList<String> filteredEmployees = new FilteredList<>(employees, s -> true);
        filterInput.textProperty().addListener(obs -> {
            String filter = filterInput.getText();
            if(filter == null || filter.length() == 0) {
                filteredEmployees.setPredicate(s ->  true);
            } else {
                filteredEmployees.setPredicate(s -> s.toLowerCase().contains(filter.toLowerCase()));
            }
        });

        employeeListView.setItems(filteredEmployees);

    }

    public String getSelectedEmployeeItem() {
        return (String) employeeListView.getSelectionModel().getSelectedItem();
    }

    public String getSelectedTeamMemberItem() {
        return (String) teamListView.getSelectionModel().getSelectedItem();
    }

    public void createTeamBtnPressed(ActionEvent actionEvent) throws Exception {
        createTeamController.refreshTeamGUI();
        getTeamMembers();
    }

    public void addToTeamBtnPressed() {
        teamListView.getItems().add(getSelectedEmployeeItem());
    }

    public void removeFromTeamBtnPressed() {
        teamListView.getItems().remove(teamListView.getSelectionModel().getSelectedIndex());
    }

    public List<String> getTeamMembers() {
        List<String> teamMembers = teamListView.getItems();
        for (String member:teamMembers
        ) {
            System.out.println(member);

        }
        return teamMembers;
    }
}
