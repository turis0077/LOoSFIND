package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ObjetoPerdido;

import java.time.LocalDate;

public class RegistroObjetoView {
    public void show(Stage stage) {
        VBox root = new VBox();
        TextField descripcionField = new TextField("Descripción");
        TextField ubicacionField = new TextField("Ubicación");
        Button btnRegistrar = new Button("Registrar");

        btnRegistrar.setOnAction(e -> {
            // Lógica para registrar objeto perdido
            ObjetoPerdido objeto = new ObjetoPerdido(
                    1,
                    descripcionField.getText(),
                    "placeholder.png",
                    ubicacionField.getText(),
                    LocalDate.now()
            );
            // Guardar el objeto en la base de datos o lista
        });

        root.getChildren().addAll(descripcionField, ubicacionField, btnRegistrar);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Registrar Objeto");
        stage.setScene(scene);
    }
}
