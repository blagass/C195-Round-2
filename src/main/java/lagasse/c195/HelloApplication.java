package lagasse.c195;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lagasse.c195.helper.CustomerQuery;
import lagasse.c195.helper.JDBC;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene;
        scene = new Scene(fxmlLoader.load(), 1300, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) throws SQLException {
        Locale.setDefault(new Locale("fr"));

        JDBC.openConnection();

        int rowsAffected = CustomerQuery.insert("John",19);
        if(rowsAffected > 0 ){
            System.out.println("Insert Successful!");
        }
        else{
            System.out.println("Insert Failed :(");
        }

        //launch();

        JDBC.closeConnection();
    }
}