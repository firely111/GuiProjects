package inclass91118;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button button1 = new Button("Remove");
        Button button2 = new Button("Remove");
        Button button3 = new Button("Remove");
        Button button4 = new Button("Remove");

        Label label1= new Label("Ruby");
        Label label2= new Label("Weiss");
        Label label3= new Label("Blake");
        Label label4= new Label("Yang");

        HBox hbox1= new HBox(10,label1,button1);
        HBox hbox2= new HBox(10,label2,button2);
        HBox hbox3= new HBox(10,label3,button3);
        HBox hbox4= new HBox(10,label4,button4);

        VBox vbox = new VBox(10,hbox1,hbox2,hbox3,hbox4);

        button1.setOnAction(event -> {
            hbox1.getChildren().removeAll(label1,button1);
        });

        button2.setOnAction(event -> {
            hbox2.getChildren().removeAll(label2,button2);
        });

        button3.setOnAction(event -> {
            hbox3.getChildren().removeAll(label3,button3);
        });

        button4.setOnAction(event -> {
            hbox4.getChildren().removeAll(label4,button4);
        });

        Scene myScene = new Scene(vbox);
        vbox.setPadding(new Insets(100));
        vbox.setAlignment(Pos.CENTER);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Remove Items");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
