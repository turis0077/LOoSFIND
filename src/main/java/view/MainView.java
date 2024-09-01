package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView {
    public void show(Stage stage) {
        VBox root = new VBox();
        Button btnRegistrar = new Button("Registrar Objeto");
        Button btnBuscar = new Button("Buscar Objeto");
        Button btnNotificaciones = new Button("Ver Notificaciones");

        // Agregar manejadores de eventos para cada botón
        btnRegistrar.setOnAction(e -> new RegistroObjetoView().show(stage));
        btnBuscar.setOnAction(e -> new BusquedaObjetoView().show(stage));

        root.getChildren().addAll(btnRegistrar, btnBuscar, btnNotificaciones);

        // Cargar y aplicar el archivo de estilos CSS
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        stage.setTitle("LOosFind UVG");
        stage.setScene(scene);
        stage.show();
    }
}
