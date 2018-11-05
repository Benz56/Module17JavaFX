/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module17javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Benjamin Staugaard | Benz56
 */
public class Module17JavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /* Chapter 1:*/
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World");

        final Button button = new Button("Say 'Hello World'");
        button.setOnAction(event -> {
            System.out.println("Hello World!");
        });

        final StackPane root = new StackPane(button);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    /* Chapter 2:*/
    @Override
    public void start(Stage primaryStage) throws Exception {
        final GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        final Text title = new Text("Welcome");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(title, 0, 0, 2, 1);

        gridPane.add(new Label("Username: "), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Label("Password: "), 0, 2);
        gridPane.add(new PasswordField(), 1, 2);

        final Button button = new Button("Sign in");
        final HBox hBox = new HBox(10, button);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        gridPane.add(hBox, 1, 4);

        final Text actionTarget = new Text();
        gridPane.add(actionTarget, 1, 6);

        button.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in button pressed");
        });

        Scene scene = new Scene(gridPane, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /* Chapter 4:*/
    @Override
    public void start(Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

        final Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
