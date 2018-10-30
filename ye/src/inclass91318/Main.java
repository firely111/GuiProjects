package inclass91318;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Label dorm = new Label("Dorms");
        ChoiceBox<String> dormChoice = getDormChoice();

        Label mealPlan= new Label("Meal Plan");
        ChoiceBox<String> mealPlanChoice = getMealPlanChoice();

        Button submit = new Button("Submit");
        HBox hbox = new HBox(10,dorm,dormChoice,mealPlan,mealPlanChoice);
        VBox vbox= new VBox(10,hbox,submit);
        vbox.setPadding(new Insets(10));


        Scene myScene = new Scene(vbox);
       // vbox.setAlignment(Pos.CENTER);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Dorms and Meals");
        primaryStage.show();

    }

    ChoiceBox<String> getDormChoice() {
        ChoiceBox<String> dormChoice = new ChoiceBox<>();
        dormChoice.getItems().addAll("Allen Hall", "Pike Hall", "Farthing Hall", "University Hall");
        return dormChoice;
    }

    ChoiceBox<String> getMealPlanChoice() {
        ChoiceBox<String> mealPlanChoice = new ChoiceBox<>();
        mealPlanChoice.getItems().addAll("7 meals per week","14 meals per week","Unlimited Meals");
        return mealPlanChoice;
    }




    public static void main(String[] args) {
        launch(args);
    }
}
