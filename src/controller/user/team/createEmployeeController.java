package controller.user.team;

import Client.Client;
import view.user.team.createEmployee.createEmployeeView;

public class createEmployeeController {
    public Client client;
    public createEmployeeView view;

    public createEmployeeController(createEmployeeView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public void createEmployee() {
    }
}
