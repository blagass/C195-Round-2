package lagasse.c195.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label zoneLabel;
    @FXML
    private Button buttonLogin;
    @FXML
    private void login(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String zone = String.valueOf(ZoneId.systemDefault());
        zoneLabel.setText(zone);

        ResourceBundle rb = ResourceBundle.getBundle("lagasse/c195/Lang", Locale.getDefault());

        if(Locale.getDefault().getLanguage().equals("fr"))
            System.out.println(rb.getString("Hello"));

        else
            System.out.println("Hello");

    }
}