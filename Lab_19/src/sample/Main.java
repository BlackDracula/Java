package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
        TextField Body_weight = new TextField();
        TextField Workout_Duration  = new TextField();
        Button calculate = new Button("Calculate");
        Button go_back = new Button("Go Back To Main");

        Text Result = new Text("Results: ");
        Text Cups   = new Text();
        Text Ounces   = new Text();
        Text Ounces_total   = new Text();
        Text litres   = new Text();
        Text Pints   = new Text();
    @Override
    public void start(Stage FirstStage) {

        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll("Metric","Imperial");
        combo.setValue("Metric");
        GridPane gridPane = new GridPane();
        GridPane gridPane_ = new GridPane();
        Result.setFont(Font.font("italic",20));
        gridPane_.setVgap(10);
        gridPane_.setHgap(10);
        gridPane_.add(Result,0,0);
        gridPane_.add(new Label("Your Daily water intake is: "),0,1);
        gridPane_.add(Cups,0,3);
        gridPane_.add(Ounces,0,4);
        gridPane_.add(Ounces_total,0,5);
        gridPane_.add(litres,0,6);
        gridPane_.add(Pints,0,7);
        gridPane_.add(go_back,0, 8);
        /*First Scene*/
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.add(combo,1,0);
        gridPane.add(new Label("Body weight"),0,1);
        gridPane.add(Body_weight,1,1);
        gridPane.add(new Label("Duration of workout"),0,2);
        gridPane.add(Workout_Duration,1,2);
        gridPane.add(calculate,1,3);
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setHalignment(calculate, HPos.LEFT);

        //create a scene
        FirstStage.setTitle("Pop Quiz");
        Scene first_scene = new Scene(gridPane);
        Scene second_scene = new Scene(gridPane_);
        FirstStage.setScene(first_scene);
        FirstStage.show();

        calculate.setOnAction(e -> {
            FirstStage.setScene(second_scene);
            Calculate();
        }
        );
        go_back.setOnAction(e ->FirstStage.setScene(first_scene));
    }
    public static void main(String[] args){
        launch(args);
    }
    private void Calculate(){
        double weight = Double.parseDouble(Body_weight.getText());
        double duration = Double.parseDouble(Workout_Duration.getText());
        Get get = new Get();
        Cups.setText(String.format("%.3f Cups ",get.Cups(weight,duration)));
        Ounces.setText(String.format("%.3f Ounces ",get.Ounces(duration)));
        Ounces_total.setText(String.format("%.3f Ounces total needed ",get.Ounces_total(duration)));
        litres.setText(String.format("%.3f litres of water needed ",get.litres(weight)));
        Pints.setText(String.format("%.3f total pints ",get.Pints()));
    }
}
class Get{
    double weight,duration;
    public Get(){
    }
    double Cups(double weight, double duration){
        this.weight = weight;
        this.duration = duration;
        return Ounces(duration)*0.125;
    }double Ounces(double duration){
        return (weight*2)/3;
    }double Ounces_total(double duration){
        return Ounces(duration)+30;
    }double litres(double weight){
        return Ounces(duration)*0.02957;
    }double Pints(){
        return this.Ounces(duration)/this.litres(weight);
    }

}