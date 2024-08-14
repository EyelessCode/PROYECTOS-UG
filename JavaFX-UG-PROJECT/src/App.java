import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App extends Application {

    private Connection conn;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Formula 1 Data Viewer");

        // Conexión a la base de datos
        connectToDatabase();

        // Contenedor principal
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #2E2E2E;");
        root.setPadding(new Insets(20));

        // Título
        Label titleLabel = createLabel("Formula 1 Data Viewer", 18);
        titleLabel.setStyle("-fx-background-color: #1C1C1C; -fx-text-fill: #FFD700; -fx-padding: 10px;");

        // Sección de pilotos
        VBox driversSection = createDriversSection();
        driversSection.setPadding(new Insets(10));
        driversSection.setStyle("-fx-background-color: #1C1C1C; -fx-padding: 10px;");

        // Sección de carreras
        VBox racesSection = createRacesSection();
        racesSection.setPadding(new Insets(10));
        racesSection.setStyle("-fx-background-color: #1C1C1C; -fx-padding: 10px;");

        root.getChildren().addAll(titleLabel, driversSection, racesSection);

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    private Label createLabel(String text, double fontSize) {
        Label label = new Label(text);
        label.setFont(Font.font(fontSize));
        label.setTextFill(Color.WHITE);
        return label;
    }

    private VBox createDriversSection() {
        VBox vbox = new VBox(10);

        Label sectionLabel = createLabel("Datos del Piloto", 16);
        sectionLabel.setTextFill(Color.YELLOW);

        // ComboBox para seleccionar driverId
        ComboBox<Integer> driverIdComboBox = new ComboBox<>();
        for (int i = 1; i <= 35; i++) { // Suponiendo que hay 35 driverIds disponibles
            driverIdComboBox.getItems().add(i);
        }
        driverIdComboBox.setValue(1); // Valor inicial seleccionado

        Button fetchDriverDataBtn = new Button("Mostrar Datos del Piloto");
        Label driverInfoLabel = new Label();
        driverInfoLabel.setTextFill(Color.WHITE);

        fetchDriverDataBtn.setOnAction(e -> {
            int driverId = driverIdComboBox.getValue();
            String driverInfo = fetchDriverData(driverId);
            driverInfoLabel.setText(driverInfo);
        });

        vbox.getChildren().addAll(sectionLabel, driverIdComboBox, fetchDriverDataBtn, driverInfoLabel);
        return vbox;
    }

    private VBox createRacesSection() {
        VBox vbox = new VBox(10);

        Label sectionLabel = createLabel("Datos de la Carrera", 16);
        sectionLabel.setTextFill(Color.YELLOW);

        // ComboBox para seleccionar raceId
        ComboBox<Integer> raceIdComboBox = new ComboBox<>();
        for (int i = 1; i <= 45; i++) { // Suponiendo que hay 45 raceIds disponibles
            raceIdComboBox.getItems().add(i);
        }
        raceIdComboBox.setValue(1); // Valor inicial seleccionado

        Button fetchRaceDataBtn = new Button("Mostrar Datos de la Carrera");
        Label raceInfoLabel = new Label();
        raceInfoLabel.setTextFill(Color.WHITE);

        fetchRaceDataBtn.setOnAction(e -> {
            int raceId = raceIdComboBox.getValue();
            String raceInfo = fetchRaceData(raceId);
            raceInfoLabel.setText(raceInfo);
        });

        vbox.getChildren().addAll(sectionLabel, raceIdComboBox, fetchRaceDataBtn, raceInfoLabel);
        return vbox;
    }

    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/formula_01";
        String user = "cristhian";
        String password = "cris03022";

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String fetchDriverData(int driverId) {
        String query = "SELECT forename, surname, dob, nationality FROM drivers WHERE driverId = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, driverId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String forename = rs.getString("forename");
                String surname = rs.getString("surname");
                String dob = rs.getString("dob");
                String nationality = rs.getString("nationality");
                return "Forename: " + forename + "\nSurname: " + surname + "\nDate of Birth: " + dob + "\nNationality: " + nationality;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No se encontraron datos para el piloto con ID: " + driverId;
    }

    private String fetchRaceData(int raceId) {
        String query = "SELECT date, time, year FROM races WHERE raceId = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, raceId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String date = rs.getString("date");
                String time = rs.getString("time");
                int year = rs.getInt("year");
                return "Date: " + date + "\nTime: " + time + "\nYear: " + year;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No se encontraron datos para la carrera con ID: " + raceId;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
