package myProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SampleController implements Initializable {
    @FXML
    private Button addButton;
    @FXML
    private ListView usersListView;
    @FXML
    private ListView reservationsListView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField emailTextField;

    public Database database = new Database.getInstance();

    private ObservableList<Account> accounts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        accounts = database.getAllAccounts();
        usersListView.setItems(accounts);
    }
}
