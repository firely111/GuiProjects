package inclass100918;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        RadioButton data8= new RadioButton("8 gigabytes per month: $45.00 per month");
        RadioButton data16= new RadioButton("16 gigabytes per month: $65.00 per month");
        RadioButton data20= new RadioButton("20 gigabytes per month: $99.00 per month");

        ToggleGroup myToggleGroup1= new ToggleGroup();
        data8.setToggleGroup(myToggleGroup1);
        data16.setToggleGroup(myToggleGroup1);
        data20.setToggleGroup(myToggleGroup1);

        RadioButton phone100= new RadioButton("Model 100: $299.95");
        RadioButton phone110= new RadioButton("Model 110: $399.95");
        RadioButton phone200= new RadioButton("Model 200: $499.95");

        ToggleGroup myToggleGroup2= new ToggleGroup();
        phone100.setToggleGroup(myToggleGroup2);
        phone110.setToggleGroup(myToggleGroup2);
        phone200.setToggleGroup(myToggleGroup2);

        CheckBox extra1= new CheckBox("Insurance: $5.00 per month");
        CheckBox extra2= new CheckBox("Wifi Hotspot Capability: $10.00 per month");


        VBox vbox1= new VBox(10,data8,data16,data20);
        VBox vbox2= new VBox(10,phone100,phone110,phone200);
        VBox vbox3= new VBox(10,extra1,extra2);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setPadding(new Insets(10));
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(10));
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setPadding(new Insets(10));

        VBox mainBox= new VBox(10,vbox1,vbox2,vbox3);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setPadding(new Insets(10));


        Scene myScene = new Scene(mainBox);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Ye");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
