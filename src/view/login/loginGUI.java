package view.login;

//import client.Client;
import Client.Client;
import controller.login.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginGUI implements loginView {

    public final Client client;
    public Button btnLogin;
    private controller.login.loginController loginController;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtPassword;

    public loginGUI() throws Exception {
        this.loginController = new loginController(this, client = new Client());
    }


    public String getCPR() {
        return txtId.getText();
    }

    public String getPassword() {
        return txtPassword.getText();
    }

    public void clearInput() {
        txtId.setText("");
        txtPassword.setText("");
    }

    public void closeWindow() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }

    public void hideWindow() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.hide();
    }

    public void loginBtnPressed(ActionEvent actionEvent) throws Exception {
        loginController.loginBtnPressedNoVerify();
        // Uncomment when checking password loginController.loginBtnPressed(Integer.parseInt(txtId.getText()), txtPassword.getText());
    }

    public void onEnter(ActionEvent actionEvent) throws Exception {
        loginController.loginBtnPressedNoVerify();
        // Uncomment when checking password loginController.loginBtnPressed(Integer.parseInt(txtId.getText()), txtPassword.getText());
    }
}


