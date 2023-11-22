package lagasse.c195.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lagasse.c195.model.Customer;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    public Button addCustomerBtn;
    public Button editCustomerButton;
    public Button removeCustomerBtn;
    public TableView appointmentTableView;
    public TableColumn appIdCol;
    public TableColumn appTitleCol;
    public TableColumn appDescriptionCol;
    public TableColumn appLocationCol;
    public TableColumn appContactCol;
    public TableColumn appTypeCol;
    public TableColumn appStartCol;
    public TableColumn appEndCol;
    public TableColumn appCustomerIdCol;
    public TableColumn appUserIdCol;
    public Button addAppBtn;
    public Button editAppBtn;
    public Button removeAppBtn;
    @FXML
    private TableColumn customerAddressCol;

    @FXML
    private TableColumn customerCountryCol;

    @FXML
    private TableColumn customerNameCol;

    @FXML
    private TableColumn customerPhoneCol;

    @FXML
    private TableColumn customerPostalCol;

    @FXML
    private TableColumn customerStateCol;

    @FXML
    private TableView customerTableView;

    private ObservableList<Customer> allCustomers = FXCollections.observableArrayList();

    public void onAddCustomer(ActionEvent actionEvent) {

    }

    public void onEditCustomer(ActionEvent actionEvent) {
    }

    public void onRemoveCustomer(ActionEvent actionEvent) {
    }

    public void onAddApp(ActionEvent actionEvent) {
    }

    public void onEditApp(ActionEvent actionEvent) {
    }

    public void onRemoveApp(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        customerNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        customerAddressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        customerCountryCol.setCellValueFactory(new PropertyValueFactory<>("country"));
        customerPhoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        customerPostalCol.setCellValueFactory(new PropertyValueFactory<>("postal"));
        customerStateCol.setCellValueFactory(new PropertyValueFactory<>("state"));

        customerTableView.setItems(allCustomers);


    }
}
