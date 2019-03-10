//Mitchell Theriault (100661137)

import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class Q2 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane pane = new GridPane();
		
		//creates labels
		Label amountL = new Label("Investment Amount");
		Label yearsL = new Label("Years");
		Label interestL = new Label("Annual Interest Rate");
		Label futureL = new Label("Future Value");
		
		//new text fields for all texts
		TextField amount = new TextField();
		amount.setPromptText("Amount");
		amount.setAlignment(Pos.BASELINE_RIGHT);
		
		TextField years = new TextField();
		years.setPromptText("Years");
		years.setAlignment(Pos.BASELINE_RIGHT);
		
		TextField interest = new TextField();
		interest.setPromptText("Interest Rate");
		interest.setAlignment(Pos.BASELINE_RIGHT);
		
		TextField future = new TextField();
		future.setPromptText("Future Value");
		future.setAlignment(Pos.BASELINE_RIGHT);
		
		Button btn = new Button("Calculate");
		GridPane.setHalignment(btn, HPos.RIGHT);
		btn.setDefaultButton(true);
		
		DecimalFormat f = new DecimalFormat("#.00");
		
		
		//action handler for when button is clicked
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				//calculations for future value
				double a = Double.parseDouble(amount.getText());
				double t = Double.parseDouble(years.getText());
				double i = Double.parseDouble(interest.getText());
				
				double monthly = i / 12 / 100;
				
				double fVal = a * Math.pow(1 + monthly, t * 12);
				
				future.setText(f.format(fVal));
				
			}
		});
		
		//add all labels and text boxes
		pane.add(amountL, 0, 0);
		pane.add(amount, 1, 0);
		
		pane.add(yearsL, 0, 1);
		pane.add(years, 1, 1);
		
		pane.add(interestL, 0, 2);
		pane.add(interest, 1, 2);
		
		pane.add(futureL, 0, 3);
		pane.add(future, 1, 3);

		pane.add(btn, 1, 4);
		
		//add pane to scene and show
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Q2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
