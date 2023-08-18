module lagasse.c195 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens lagasse.c195 to javafx.fxml;
    exports lagasse.c195;
    exports lagasse.c195.controller;
    opens lagasse.c195.controller to javafx.fxml;
}