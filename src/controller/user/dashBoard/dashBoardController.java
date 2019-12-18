package controller.user.dashBoard;

import Client.Client;
import view.user.dashBoard.dashBoardView;

public class dashBoardController {
    public dashBoardView view;
    public Client client;

    public dashBoardController(dashBoardView view, Client client) {
        this.view = view;
        this.client = client;
    }
}
