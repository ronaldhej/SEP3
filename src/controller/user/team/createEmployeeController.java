package controller.user.team;

import Client.Client;
import view.user.team.createEmployee.createEmployeeView;

import java.io.IOException;

public class createEmployeeController {
    public Client client;
    public createEmployeeView view;

    public createEmployeeController(createEmployeeView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public void createEmployee() throws IOException {
        client.PostEmployee(view.getName(), view.getPassword());
        view.closeWindow();
    }
}
