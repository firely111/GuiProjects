package inclass100218;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button button1= new Button("Close");
        Label label1= new Label("Click me");

        VBox vbox= new VBox(10,label1,button1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));


        Scene myScene = new Scene(vbox,500,300);
        myScene.getStylesheets().add("/inclass100218/myStyle.css");
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Ye");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
