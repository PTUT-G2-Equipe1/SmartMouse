package fr.univ_amu.iut;
/**
 * Created by Nicolas
 */

import com.sun.glass.ui.Size;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;


public class souris extends Application {

    //Boutons
    private Button retour;
    private Button RC;
    private Button LC;

    //Panneaux
    private BorderPane root = new BorderPane();
    private Pane drawPane = new Pane();

    //Images
    private Image Pad;
    private Image retourImage;
    private ImageView ivRetour;

    //Box
    private HBox box1 =new HBox();
    private HBox box2 =new HBox();


    @Override
    public void start(Stage primaryStage) {
        retourImage = new Image("http://imageshack.com/a/img922/6281/ckW8iT.png");
        ivRetour = new ImageView(retourImage);
        ivRetour.setFitHeight(25);
        ivRetour.setFitWidth(25);
        ivRetour.setPreserveRatio(true);
        retour = new Button("", ivRetour);
        RC = new Button ("RC");
        LC = new Button ("LC");

        //config couleur de base
        RC.setStyle("-fx-background-color: lightblue");
        LC.setStyle("-fx-background-color: lightblue");
        retour.setStyle("-fx-background-color: none");

        //Config police et taille
        RC.setFont(Font.font(Menu.Pol,Menu.Size));
        LC.setFont(Font.font(Menu.Pol,Menu.Size));

        //Evenement
        retour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                RC.setStyle("-fx-background-color: lightblue");
                LC.setStyle("-fx-background-color: lightblue");
                Menu retour = new Menu();
                retour.start(primaryStage);
            }
        });

        RC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RC.setStyle("-fx-background-color: lightgrey");
                retour.setStyle("-fx-background-color: none");
                LC.setStyle("-fx-background-color: lightblue");
            }
        });

        LC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LC.setStyle("-fx-background-color: lightgrey");
                RC.setStyle("-fx-background-color: lightblue");
                retour.setStyle("-fx-background-color: none");
            }
        });
        //Ecouteurs boutons (Nicolas)

        //Placement et réglage des boutons et la zone tactile
        box1.getChildren().addAll(LC,RC);
        box2.getChildren().addAll(retour);

        HBox.setMargin(LC,new Insets(10,10,20,5));
        HBox.setMargin(RC,new Insets(10,5,20,10));
        HBox.setMargin(retour, new Insets(20,0,10,2));

        box2.setAlignment(Pos.BASELINE_LEFT);

        LC.setMinWidth(115);
        LC.setMinHeight(50);
        RC.setMinWidth(115);
        RC.setMinHeight(50);

        root.setBottom(box1);
        root.setTop(box2);
        root.setCenter(drawPane);


        drawPane.setPrefSize(200, 350);
        drawPane.setStyle("-fx-background-color: lightgray");

        //Reglage de la scène (Nicolas)
        root.setMaxSize(200,400);
        root.setMargin(drawPane, new Insets(0,10,0,10));
        root.setStyle("-fx-background-color:" + Menu.Bg);

        Scene sceneSouris = new Scene(root);
        primaryStage.setScene(sceneSouris);
        primaryStage.setTitle("Souris");
        primaryStage.show();


    }
}


