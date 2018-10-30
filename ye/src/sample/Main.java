package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button b1= new Button("Button 1");
        Button b2= new Button("Button 2");
        Button b3= new Button("Button 3");
        Button b4= new Button("Button 4");
        Button b5= new Button("Button 5");
        Button b6= new Button("Button 6");

        HBox hbox1= new HBox(10,b1,b2,b3);
        HBox hbox2= new HBox(10,b4,b5,b6);

        VBox vbox= new VBox(hbox1, hbox2);
        Scene myScene= new Scene(vbox,300,100);

        primaryStage.setScene(myScene);
        primaryStage.setTitle("Layout Demo");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
