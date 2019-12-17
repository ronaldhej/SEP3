package view.user.team.editTeam;

import controller.user.team.editTeamController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class editTeamGUI implements editTeamView {

    public editTeamController editTeamController;
    public ListView employeeListView;
    public TextField filterInput;
    public ListView teamListView;
    ObservableList<String> employees = FXCollections.observableArrayList();

    public editTeamGUI() {
        editTeamController = new editTeamController(this);
    }

    @FXML
    public void initialize() {
        employees.add("Ronald");
        employees.add("Pdawg");
        employees.add("Bobby");
        employees.add("Dziugas");
        searchFilter();
    }

    public void clearFilterInput() {
        filterInput.setText("");
    }

    public String getSelectedEmployeeItem() {
        return (String) employeeListView.getSelectionModel().getSelectedItem();
    }

    public String getSelectedTeamMemberItem() {
        return (String) teamListView.getSelectionModel().getSelectedItem();
    }

    public void addToTeamBtnPressed() {
        teamListView.getItems().add(getSelectedEmployeeItem());
        employees.remove((String) employeeListView.getSelectionModel().getSelectedItem());
        employeeListView.setItems(employees);
        clearFilterInput();
        searchFilter();
    }

    public void removeFromTeamBtnPressed() {
        employees.add(getSelectedTeamMemberItem());
        teamListView.getItems().remove(teamListView.getSelectionModel().getSelectedIndex());
        employeeListView.setItems(employees);
        searchFilter();
        clearFilterInput();
    }

    public List<String> getTeamMembers() {
        List<String> teamMembers = teamListView.getItems();
        for (String member:teamMembers
        ) {
            System.out.println(member);

        }
        return teamMembers;
    }

    public void searchFilter() {
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

    public void saveChangesBtnPressed(ActionEvent actionEvent) throws Exception {
        editTeamController.refreshTeamGUI();
    }
}
