/* Aron Hubbard
   CS 2450.02
   9/17/18
   Project 1
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application{

    public void start(Stage primaryStage) throws Exception{

        TextField text1= new TextField();
        TextField text2= new TextField();
        TextField text3= new TextField();
        TextField text4= new TextField();
        TextField text5= new TextField();
        TextField text6= new TextField();
        TextField text7= new TextField();

        Label statement = new Label("Enter the following information");
        Label numOfDays= new Label("Number of days on the trip");
        Label airfareFees= new Label("Amount of airfare, if any");
        Label carFees= new Label("Amount of car rental fees, if any");
        Label milesDriven= new Label("Miles Driven, if a private vehicle was used");
        Label parkingFees= new Label("Amount of parking fees, if any");
        Label registrationFees= new Label("Conference or seminar fees, if any");
        Label lodgingFees= new Label("Lodging charges, per night");

        Button submit = new Button("Submit");

        HBox hbox1= new HBox(10,statement);
        HBox hbox2= new HBox(10,submit);
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);

        GridPane grid= new GridPane();
        grid.add(numOfDays,0,1);
        grid.add(text1,1,1);
        grid.add(airfareFees,0,2);
        grid.add(text2,1,2);
        grid.add(carFees,0,3);
        grid.add(text3,1,3);
        grid.add(milesDriven,0,4);
        grid.add(text4,1,4);
        grid.add(parkingFees,0,5);
        grid.add(text5,1,5);
        grid.add(registrationFees,0,6);
        grid.add(text6,1,6);
        grid.add(lodgingFees,0,7);
        grid.add(text7,1,7);

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));

        VBox vbox = new VBox(10, hbox1,grid,hbox2);
        vbox.setPadding(new Insets(50));

        submit.setOnAction(event -> {
            double days= Double.parseDouble(text1.getText());
            double airfare= Double.parseDouble(text2.getText());
            double car= Double.parseDouble(text3.getText());
            double miles= Double.parseDouble(text4.getText());
            double parking= Double.parseDouble(text5.getText());
            double regi= Double.parseDouble(text6.getText());
            double lodging= Double.parseDouble(text7.getText());



            double reMeals= days*47.0;

            double parkingPerDay= parking/days;
            double reParking= 0.0;
            if(parkingPerDay<=20.0){
                reParking= parkingPerDay*days;
            }
            else{
                reParking= 20*days;
            }

            double reLodging= 0.0;
            if(lodging<=195.0){
                reLodging= lodging*days;
            }
            else{
                reLodging= 195.0*days;
            }

            double reMile= miles*.42;

            double totalLodging= lodging*days;
            double totalExpense= airfare+car+parking+regi+totalLodging;
            double totalRe= reMeals+reParking+reLodging+reMile;
            double excess= totalExpense-totalRe;
            double saved= 0.0;
            if(excess<0.0){
                saved= excess*(-1);
            }
            if(excess<=0.0){
                excess= 0.0;
            }

            Label resultStatement= new Label("Expense Report");
            Label resultLabel1= new Label("Total Expenses");
            Label resultLabel2= new Label("Total Reimbursement");
            Label resultLabel3= new Label("Excess Paid");
            Label resultLabel4= new Label("Total Saved");

            Label result1= new Label("");
            Label result2= new Label("");
            Label result3= new Label("");
            Label result4= new Label("");

            result1.setText(String.format("%,.2f",totalExpense));
            result2.setText(String.format("%,.2f",totalRe));
            result3.setText(String.format("%,.2f",excess));
            result4.setText(String.format("%,.2f",saved));

            GridPane pane= new GridPane();
            pane.add(resultLabel1,0,1);
            pane.add(result1,1,1);
            pane.add(resultLabel2,0,2);
            pane.add(result2,1,2);
            pane.add(resultLabel3,0,3);
            pane.add(result3,1,3);
            pane.add(resultLabel4,0,4);
            pane.add(result4,1,4);
            pane.setAlignment(Pos.CENTER);
            pane.setHgap(10);
            pane.setVgap(10);
            pane.setPadding(new Insets(25));

            HBox box= new HBox(10,resultStatement);
            box.setAlignment(Pos.CENTER);

            vbox.getChildren().removeAll(hbox1,grid,hbox2);
            vbox.getChildren().addAll(box,pane);
            vbox.setAlignment(Pos.CENTER);
            vbox.setPadding(new Insets(150));

        });

        Scene myScene= new Scene(vbox);

        primaryStage.setTitle("Travel Expenses");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}