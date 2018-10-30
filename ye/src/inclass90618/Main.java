package inclass90618;

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
        TextField t1 = new TextField("");
        TextField t2 = new TextField("");
        TextField t3 = new TextField("");
        Label name = new Label("Name");
        Label phone= new Label("Phone#");
        Label email= new Label("Email");
        Label label= new Label("Please Enter the Following: ");
        Button b1= new Button("Submit");
        Button b2= new Button("Cancel");

        HBox hbox1= new HBox(10,name,t1);
        HBox hbox2= new HBox(10,phone,t2);
        HBox hbox3= new HBox(10,email,t3);
        HBox hbox4= new HBox(50,b1,b2);
        hbox4.setAlignment(Pos.CENTER);
        hbox1.setPadding(new Insets(10));
        hbox3.setPadding(new Insets(10));

        GridPane grid = new GridPane();
        grid.add(hbox1,1,0);
        grid.add(hbox2,1,1);
        grid.add(hbox3,1,2);
        grid.add(label,0,1);
        VBox vbox = new VBox(10,grid,hbox4);

        Scene myScene = new Scene(vbox);

        primaryStage.setScene(myScene);
        primaryStage.setTitle("In Class Grid");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
