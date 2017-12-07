package fr.univ_amu.iut;/**
 * Created by Benoit CIANTAR on 01/06/2017
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.security.cert.Extension;


public class Réglages extends Application {

    private RadioButton clictactile;
    private RadioButton modenuit;

    private Image retourImage;
    private ImageView ivRetour;

    private HBox box = new HBox();

    private Button police1;
    private Button police2;
    private Button police3;

    private Button taille1;
    private Button taille2;
    private Button taille3;

    private Button couleur1;
    private Button couleur2;
    private Button couleur3;

    private Button retour;

    private BorderPane root;
    private GridPane reglageSecondaire;
    private GridPane reglagePrincipaux;

    public static boolean etatModeNuit = false; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonPolice1 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonPolice2 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonPolice3 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonTaille1 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonTaille2 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonTaille3 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonCouleur1 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonCouleur2 = "lightblue"; //Varibale globale pour sauvegarder l'etat
    public static String etatBouttonCouleur3 = "lightblue"; //Varibale globale pour sauvegarder l'etat

    @Override
    public void start(Stage primaryStage) {

        police1 = new Button("Symb");
        police2 = new Button("Basic");
        police3 = new Button("Serif");

        taille1 = new Button("13");
        taille2 = new Button("15");
        taille3 = new Button("17");

        couleur1 = new Button("Vert");
        couleur2 = new Button("Gris");
        couleur3 = new Button("Rouge");

        retourImage = new Image("http://imageshack.com/a/img922/6281/ckW8iT.png");
        ivRetour = new ImageView(retourImage);
        ivRetour.setFitHeight(25);
        ivRetour.setFitWidth(25);
        ivRetour.setPreserveRatio(true);
        retour = new Button("", ivRetour);
        retour.setStyle("-fx-background-color: none");

        clictactile = new RadioButton("Activer clic tactile");
        modenuit = new RadioButton("Mode nuit");

        police1.setMinWidth(70);
        police2.setMinWidth(70);
        police3.setMinWidth(70);

        taille1.setMinWidth(70);
        taille2.setMinWidth(70);
        taille3.setMinWidth(70);

        couleur1.setMinWidth(70);
        couleur2.setMinWidth(70);
        couleur3.setMinWidth(70);

        //Config bouttons de base
        police1.setStyle("-fx-background-color:" + etatBouttonPolice1);
        police2.setStyle("-fx-background-color:" + etatBouttonPolice2);
        police3.setStyle("-fx-background-color:"+ etatBouttonPolice3);

        taille1.setStyle("-fx-background-color:" + etatBouttonTaille1);
        taille2.setStyle("-fx-background-color:"+ etatBouttonTaille2);
        taille3.setStyle("-fx-background-color:"+ etatBouttonTaille3);

        couleur1.setStyle("-fx-background-color:" + etatBouttonCouleur1);
        couleur2.setStyle("-fx-background-color:" + etatBouttonCouleur2);
        couleur3.setStyle("-fx-background-color:" + etatBouttonCouleur3);

        //Config police et taille de base
        police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
        couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));

        //Evenement
        retour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                retour.setStyle("-fx-background-color: none");
                fr.univ_amu.iut.Menu retourMenu = new fr.univ_amu.iut.Menu();
                retourMenu.start(primaryStage);
            }
        });

        police1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonPolice1 = "darkgrey";
                etatBouttonPolice2 = "lightblue";
                etatBouttonPolice3 = "lightblue";
                police1.setStyle("-fx-background-color:" + etatBouttonPolice1);
                police2.setStyle("-fx-background-color:" + etatBouttonPolice2);
                police3.setStyle("-fx-background-color:" + etatBouttonPolice3);

                fr.univ_amu.iut.Menu.Pol="Symbola";
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));

            }
        });


        police2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonPolice1 = "lightblue";
                etatBouttonPolice2 = "darkgrey";
                etatBouttonPolice3 = "lightblue";
                police1.setStyle("-fx-background-color:" + etatBouttonPolice1);
                police2.setStyle("-fx-background-color:" + etatBouttonPolice2);
                police3.setStyle("-fx-background-color:" + etatBouttonPolice3);

                fr.univ_amu.iut.Menu.Pol=null;
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));


            }
        });


        police3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonPolice1 = "lightblue";
                etatBouttonPolice2 = "lightblue";
                etatBouttonPolice3 = "darkgrey";
                police1.setStyle("-fx-background-color:" + etatBouttonPolice1);
                police2.setStyle("-fx-background-color:" + etatBouttonPolice2);
                police3.setStyle("-fx-background-color:" + etatBouttonPolice3);

                fr.univ_amu.iut.Menu.Pol="Serif";
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
            }
        });

        taille1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonTaille1 = "darkgrey";
                etatBouttonTaille2 = "lightblue";
                etatBouttonTaille3 = "lightblue";
                taille1.setStyle("-fx-background-color:" + etatBouttonTaille1);
                taille2.setStyle("-fx-background-color:" + etatBouttonTaille2);
                taille3.setStyle("-fx-background-color:" + etatBouttonTaille3);

                fr.univ_amu.iut.Menu.Size = 13.0;
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
            }
        });

        taille2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonTaille1 = "lightblue";
                etatBouttonTaille2 = "darkgrey";
                etatBouttonTaille3 = "lightblue";
                taille1.setStyle("-fx-background-color:" + etatBouttonTaille1);
                taille2.setStyle("-fx-background-color:" + etatBouttonTaille2);
                taille3.setStyle("-fx-background-color:" + etatBouttonTaille3);

                fr.univ_amu.iut.Menu.Size = 15.0;
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
            }
        });

        taille3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonTaille1 = "lightblue";
                etatBouttonTaille2 = "lightblue";
                etatBouttonTaille3 = "darkgrey";
                taille1.setStyle("-fx-background-color:" + etatBouttonTaille1);
                taille2.setStyle("-fx-background-color:" + etatBouttonTaille2);
                taille3.setStyle("-fx-background-color:" + etatBouttonTaille3);

                fr.univ_amu.iut.Menu.Size = 17.0;
                police1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                police3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                taille3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur1.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur2.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
                couleur3.setFont(Font.font(fr.univ_amu.iut.Menu.Pol, fr.univ_amu.iut.Menu.Size));
            }
        });

        couleur1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonCouleur1 = "darkgrey";
                etatBouttonCouleur2 = "lightblue";
                etatBouttonCouleur3 = "lightblue";
                couleur1.setStyle("-fx-background-color:" + etatBouttonCouleur1);
                couleur2.setStyle("-fx-background-color:" + etatBouttonCouleur2);
                couleur3.setStyle("-fx-background-color:" + etatBouttonCouleur3);
                fr.univ_amu.iut.Menu.Save = "lightgreen";
                fr.univ_amu.iut.Menu.Bg = "lightgreen";
                root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);

            }
        });

        couleur2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonCouleur1 = "lightblue";
                etatBouttonCouleur2 = "darkgrey";
                etatBouttonCouleur3 = "lightblue";

                couleur1.setStyle("-fx-background-color:" + etatBouttonCouleur1);
                couleur2.setStyle("-fx-background-color:" + etatBouttonCouleur2);
                couleur3.setStyle("-fx-background-color:" + etatBouttonCouleur3);
                fr.univ_amu.iut.Menu.Save = "lightslategray";
                fr.univ_amu.iut.Menu.Bg = "lightslategray";
                root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);
            }
        });

        couleur3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                etatBouttonCouleur1 = "lightblue";
                etatBouttonCouleur2 = "lightblue";
                etatBouttonCouleur3 = "darkgrey";

                couleur1.setStyle("-fx-background-color:" + etatBouttonCouleur1);
                couleur2.setStyle("-fx-background-color:" + etatBouttonCouleur2);
                couleur3.setStyle("-fx-background-color:" + etatBouttonCouleur3);
                fr.univ_amu.iut.Menu.Save = "indianred";
                fr.univ_amu.iut.Menu.Bg = "indianred";
                root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);

            }
        });

        modenuit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (modenuit.isSelected()){
                    etatModeNuit= true; //sauvegarde de la valeur (pour que le bouton reste appuyé)
                    fr.univ_amu.iut.Menu.Bg = "black";
                    root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);
                }
                else if (!modenuit.isSelected()){
                    fr.univ_amu.iut.Menu.Bg = fr.univ_amu.iut.Menu.Save;
                    root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);
                }
            }
        });


        modenuit.setSelected(etatModeNuit); //Config du boutton
        reglagePrincipaux = new GridPane();
        reglagePrincipaux.add(police1,0,0);
        reglagePrincipaux.add(police2,1,0);
        reglagePrincipaux.add(police3,2,0);

        reglagePrincipaux.add(taille1,0,2);
        reglagePrincipaux.add(taille2,1,2);
        reglagePrincipaux.add(taille3,2,2);

        reglagePrincipaux.add(couleur1,0,4);
        reglagePrincipaux.add(couleur2,1,4);
        reglagePrincipaux.add(couleur3,2,4);
        reglagePrincipaux.setAlignment(Pos.CENTER);
        reglagePrincipaux.setHgap(5);
        reglagePrincipaux.setVgap(15);

        couleur3.setPadding(new Insets(5,5,5,0));

        reglageSecondaire = new GridPane();
        reglageSecondaire.add(clictactile, 0,1);
        reglageSecondaire.add(modenuit, 0,2);
        reglageSecondaire.setAlignment(Pos.CENTER);
        reglageSecondaire.setVgap(5);

        HBox.setMargin(retour, new Insets(20,0,10,2));
        box.getChildren().addAll(retour);
        box.setAlignment(Pos.BASELINE_LEFT);

        root = new BorderPane();
        root.setPrefSize(250, 400);
        root.setStyle("-fx-background-color:" + fr.univ_amu.iut.Menu.Bg);
        root.setBottom(reglageSecondaire);
        root.setTop(box);

        root.setCenter(reglagePrincipaux);



        Scene sceneReglage = new Scene(root);
        primaryStage.setScene(sceneReglage);
        primaryStage.setTitle("Réglages");
        primaryStage.show();


    }
}
