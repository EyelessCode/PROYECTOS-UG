package vista;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class InterfaceLayout extends Application implements Initializable{

    private ObservableList<String> personList = FXCollections.observableArrayList();

    @FXML
    private RowConstraints gpPrimero;

    @FXML
    private RowConstraints gpSegundo;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ListView<?> listViewPerson;

    @FXML
    private TextField txtAdornoPrimero;

    @FXML
    private TextField txtAdornoSegundo;

    @FXML
    private TextField txtIngreso;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("interface.fxml"));
        Scene ventaScene=new Scene(root);

        arg0.setTitle("Interfaz de personas");
        arg0.setScene(ventaScene);
        arg0.show();


        ListView<String> listViewPerson = new ListView<>(personList);
        TextField txtIngreso = new TextField();

        txtIngreso.setOnAction(e -> {
            // Agregar el texto ingresado al ListView
            String nuevoTexto = txtIngreso.getText();
            personList.add(nuevoTexto);
            txtIngreso.clear(); // Limpiar el TextField
        });


    }

    public static void main(String[] args) {
        launch(args);
    }

}
