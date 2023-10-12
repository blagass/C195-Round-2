package lagasse.c195.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {

    @FXML
    private TextField customerAddressTxt;

    @FXML
    private Button customerBackBtn;

    @FXML
    private TextField customerNameTxt;

    @FXML
    private TextField customerPhoneTxt;

    @FXML
    private TextField customerPostalTxt;

    @FXML
    private Button customerSaveBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
