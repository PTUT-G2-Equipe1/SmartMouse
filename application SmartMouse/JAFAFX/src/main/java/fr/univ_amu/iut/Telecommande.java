package fr.univ_amu.iut;
/**
 * Created by Nicolas on 29/05/2017.
 */

import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Telecommande extends Application {

    //Boutons
    private Button retour;
    private Button prec;
    private Button suiv;
    private Button pc;
    private Button quitter;

    //Panneaux
    private BorderPane root = new BorderPane();
    private Pane drawPane = new Pane();

    //Images
    private Image retourImage;
    private ImageView ivRetour;
    private Image Pad;

    //Boxes
    private HBox box1 =new HBox();
    private HBox box2 =new HBox();
    private HBox box3 =new HBox();



    @Override
    public void start(Stage primaryStage) {

        retourImage = new Image("http://imageshack.com/a/img922/6281/ckW8iT.png");
        ivRetour = new ImageView(retourImage);
        ivRetour.setFitHeight(25);
        ivRetour.setFitWidth(25);
        ivRetour.setPreserveRatio(true);
        retour = new Button("", ivRetour);

        prec = new Button ("Prec.");
        suiv = new Button ("Suiv.");
        pc = new Button ("Plein Ecran");
        quitter = new Button ("Quitter");

        //Config police et taille de base
        prec.setFont(Font.font(Menu.Pol,Menu.Size));
        suiv.setFont(Font.font(Menu.Pol,Menu.Size));
        pc.setFont(Font.font(Menu.Pol,Menu.Size));
        quitter.setFont(Font.font(Menu.Pol,Menu.Size));

        //Config couleur de base
        retour.setStyle("-fx-background-color: none");
        prec.setStyle("-fx-background-color: lightblue");
        suiv.setStyle("-fx-background-color: lightblue");
        pc.setStyle("-fx-background-color: lightblue");
        quitter.setStyle("-fx-background-color: lightblue");

        //Evenement
        quitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                prec.setStyle("-fx-background-color: lightblue");
                suiv.setStyle("-fx-background-color: lightblue");
                pc.setStyle("-fx-background-color: lightblue");
                quitter.setStyle("-fx-background-color: lightgrey");
            }
        });
        pc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                prec.setStyle("-fx-background-color: lightblue");
                suiv.setStyle("-fx-background-color: lightblue");
                pc.setStyle("-fx-background-color: lightgrey");
                quitter.setStyle("-fx-background-color: lightblue");
            }
        });

        retour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                prec.setStyle("-fx-background-color: lightblue");
                suiv.setStyle("-fx-background-color: lightblue");
                pc.setStyle("-fx-background-color: lightblue");
                quitter.setStyle("-fx-background-color: lightblue");
                Menu retour = new Menu();
                retour.start(primaryStage);
            }
        });

        prec.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                prec.setStyle("-fx-background-color: lightgrey");
                suiv.setStyle("-fx-background-color: lightblue");
                pc.setStyle("-fx-background-color: lightblue");
                quitter.setStyle("-fx-background-color: lightblue");
            }
        });

        suiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                prec.setStyle("-fx-background-color: lightblue");
                suiv.setStyle("-fx-background-color: lightgrey");
                pc.setStyle("-fx-background-color: lightblue");
                quitter.setStyle("-fx-background-color: lightblue");
            }

        });

        //Placement et réglage des boutons et la zone tactile
        box1.getChildren().addAll(retour);
        box2.getChildren().addAll(prec,suiv);
        box3.getChildren().addAll(pc,quitter);

        HBox.setMargin(prec,new Insets(10,5,20,5));
        HBox.setMargin(suiv,new Insets(10,5,20,5));
        HBox.setMargin(retour, new Insets(20,0,10,2));
        HBox.setMargin(pc,new Insets(10,5,5,5));
        HBox.setMargin(quitter,new Insets(10,5,5,5));

        box3.setAlignment(Pos.BOTTOM_CENTER);
        box1.setAlignment(Pos.BASELINE_LEFT);

        prec.setMinWidth(115);
        prec.setMinHeight(120);
        suiv.setMinWidth(115);
        suiv.setMinHeight(120);
        pc.setMinWidth(115);
        pc.setMinHeight(50);
        quitter.setMinWidth(115);
        quitter.setMinHeight(50);

        root.setCenter(box2);
        root.setBottom(box3);
        root.setTop(box1);

        root.setMinSize(250,400);
        root.setStyle("-fx-background-color:" + Menu.Bg);

        Scene sceneTelecommande = new Scene(root);
        primaryStage.setScene(sceneTelecommande);
        primaryStage.setTitle("Télécommande");
        primaryStage.show();


    }
}


