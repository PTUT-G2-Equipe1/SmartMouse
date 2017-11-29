package fr.univ_amu.iut;

import fr.univ_amu.iut.Menu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Menu PremierMenu = new Menu();
        PremierMenu.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
