package lagasse.c195.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label zoneLabel;
    public Label zoneIdLabel;
    public Button loginText;

    public Parent parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String zone = String.valueOf(ZoneId.systemDefault());
        zoneLabel.setText(zone);

        ResourceBundle rb = ResourceBundle.getBundle("lagasse/c195/Lang", Locale.getDefault());

        if(Locale.getDefault().getLanguage().equals("fr"))
            System.out.println(rb.getString("hello"));
            zoneIdLabel.setText(rb.getString("hello"));
            loginText.setText(rb.getString("log"));
            zoneLabel.setText(zone);
    }

    @FXML
    public void buttonLogin(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/lagasse/c195/home-view.fxml"));
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 1300, 600);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
   // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));