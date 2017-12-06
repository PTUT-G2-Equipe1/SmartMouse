package fr.univ_amu.iut;/**
 * Created by f15003938 on 29/05/17.
 */

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
import javafx.event.EventHandler;

import static javafx.scene.text.Font.font;


public class Menu extends Application {

    private Button telecommande;
    private Button souris;
    private Button reglages;
    private Image logo;

    public static String Bg= "lightslategray"; //variable globale de couleur de fond
    public static String Pol= null; //variable globale de la police
    public static Double Size= 13.0; //variable globale de la taille
    public static String Save="lightslategray"; //variable globale pour garder en mémoire les bouttons préssés

    private BorderPane root;

    @Override

    public void start(Stage primarystage) {

        //debutReglagesBoutons
        telecommande = new Button("Télécommande");
        souris = new Button ("Souris");
        reglages = new Button("Réglages");

        telecommande.setId("telecommande");
        souris.setId("Souris");
        reglages.setId("Réglages");

        telecommande.setMinWidth(200);
        souris.setMinWidth(200);
        reglages.setMinWidth(200);

        telecommande.setStyle("-fx-background-color: lightblue");
        souris.setStyle("-fx-background-color: lightblue");
        reglages.setStyle("-fx-background-color: lightblue");

        telecommande.setFont(font(Pol,Size));
        souris.setFont(font(Pol,Size));
        reglages.setFont(font(Pol,Size));


        //Evenement bouttons
        souris.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                souris.setStyle("-fx-background-color: lightgrey");
                telecommande.setStyle("-fx-background-color: lightblue");
                reglages.setStyle("-fx-background-color: lightblue");
                fr.univ_amu.iut.souris menuSouris = new souris();
                menuSouris.start(primarystage);
            }
        });

        telecommande.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telecommande.setStyle("-fx-background-color: lightgrey");
                souris.setStyle("-fx-background-color: lightblue");
                reglages.setStyle("-fx-background-color: lightblue");
                Telecommande menuTelecommande = new Telecommande();
                menuTelecommande.start(primarystage);
            }
        });

        reglages.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                reglages.setStyle("-fx-background-color: lightgrey");
                souris.setStyle("-fx-background-color: lightblue");
                telecommande.setStyle("-fx-background-color: lightblue");
                Réglages menuReglage = new Réglages();
                menuReglage.start(primarystage);
            }
        });
        //finReglagesBoutons


        //debutAjoutImage
        logo = new Image("https://image.noelshack.com/fichiers/2017/22/1496297577-18816674-1712937978719718-1072737265-n.png");
        ImageView IV = new ImageView();
        IV.setImage(logo);
        IV.setFitHeight(200);
        IV.setFitWidth(200);
        IV.setPreserveRatio(true);
        //finAjoutImage

        //gridPanePourBoutons
        GridPane gridPane = new GridPane();
        gridPane.add(telecommande, 1,1);
        gridPane.add(souris, 1,2);
        gridPane.add(reglages, 1, 3);
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setVgap(30);
        //finGridpane

        //Config Bouttons
        souris.setMinHeight(30);
        telecommande.setMinHeight(30);
        reglages.setMinHeight(30);

        //Config root
        root = new BorderPane();
        root.setPrefSize(250, 400);
        root.setMaxSize(250,400);
        root.setTop(gridPane);

        root.setBottom(IV);
        root.setAlignment(IV, Pos.BOTTOM_CENTER);

        root.setStyle("-fx-background-color:" + Bg);

        Scene sceneMenu = new Scene(root);
        primarystage.setScene(sceneMenu);
        primarystage.setTitle("Menu");
        primarystage.show();



    }





}

