package view.user.team.createEmployee;

import Client.Client;
import controller.user.team.createEmployeeController;
import javafx.event.ActionEvent;

public class createEmployeeGUI implements createEmployeeView {

    public final Client client;
    public createEmployeeController createEmployeeController;


    public createEmployeeGUI() {
        createEmployeeController = new createEmployeeController(this, client = new Client());
    }

    public void createEmployeeBtnPressed(ActionEvent actionEvent) {

    }
}
