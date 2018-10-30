package inclass92018;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label title= new Label("Create an Account");
        Label userName= new Label("User Name");
        Label password= new Label("Password");
        Label rePassword= new Label("Re-enter Password");

        TextField userText= new TextField();
        PasswordField passText= new PasswordField();
        PasswordField rePassText= new PasswordField();

        Button submit= new Button("Submit");
        Button quit= new Button("Quit");


        GridPane grid= new GridPane();
        grid.add(userName,0,0);
        grid.add(userText,1,0);
        grid.add(password,0,1);
        grid.add(passText,1,1);
        grid.add(rePassword,0,2);
        grid.add(rePassText,1,2);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5));

        HBox hbox1= new HBox(10,title);
        HBox hbox2= new HBox(10,submit,quit);
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.BOTTOM_LEFT);

        VBox vbox= new VBox(10,hbox1,grid,hbox2);
        vbox.setAlignment(Pos.CENTER);

        userText.textProperty().addListener((source,oldString,newString) ->{
           String nameValue= userText.getText();
           String passValue= passText.getText();
           String rePassValue= rePassText.getText();
           submit.setDisable(nameValue.trim().equals("")||passValue.trim().equals("")||rePassValue.trim().equals(""));
        });

        passText.textProperty().addListener((source,oldString,newString) ->{
            String nameValue= userText.getText();
            String passValue= passText.getText();
            String rePassValue= rePassText.getText();
            submit.setDisable(nameValue.trim().equals("")||passValue.trim().equals("")||rePassValue.trim().equals(""));
        });

        rePassText.textProperty().addListener((source,oldString,newString) ->{
            String nameValue= userText.getText();
            String passValue= passText.getText();
            String rePassValue= rePassText.getText();
            submit.setDisable(nameValue.trim().equals("")||passValue.trim().equals("")||rePassValue.trim().equals(""));
        });



        Scene myScene = new Scene(vbox);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Dorms and Meals");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
