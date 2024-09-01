package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BusquedaObjetoView {
    public void show(Stage stage) {
        VBox root = new VBox();
        TextField busquedaField = new TextField("Buscar objeto");
        Button btnBuscar = new Button("Buscar");

        btnBuscar.setOnAction(e -> {
            // Lógica para buscar objetos perdidos
        });

        root.getChildren().addAll(busquedaField, btnBuscar);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Buscar Objeto");
        stage.setScene(scene);
    }
}
