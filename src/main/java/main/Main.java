package main;

import javafx.application.Application;
import javafx.stage.Stage;
import view.MainView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainView mainView = new MainView();
        mainView.show(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
