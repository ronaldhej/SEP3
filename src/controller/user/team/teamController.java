package controller.user.team;

import Client.Client;
import view.user.team.teamView;

public class teamController {
    public teamView view;
    public Client client;

    public teamController(teamView view, Client client) {
        this.view = view;
        this.client = client;
    }


    public void addEmployeeBtnPressed() throws Exception {
        System.out.println("Attempting to add employee");

        client.addEmployee(view.getNameTextFieldValue());
    }
}
