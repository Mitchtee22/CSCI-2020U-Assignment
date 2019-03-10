//Mitchell Theriault (100661137)

import java.util.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Q1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//creates Hbox
		HBox box = new HBox();
		Scene scene = new Scene(box);
		
		//set spacing
		box.setSpacing(3);
		
		//createb random class
		Random rand = new Random();
		
		//create numbers to be randomized
		int n1, n2, n3;
		
		//create first random num
		n1 = rand.nextInt(54) + 1;
		
		//conditionals to make sure next randoms arent the same as any other
		while (true) {
			n2 = rand.nextInt(54) + 1;
			
			if (n2 != n1) {
				break;
			}
		}
		
		while (true) {
			n3 = rand.nextInt(54) + 1;
			
			if (n3 != n1 && n3 != n2) {
				break;
			}
		}
		
		//create images using the random numbers
		ImageView c1 = new ImageView("cards/" + n1 + ".png");
		ImageView c2 = new ImageView("cards/" + n2 + ".png");
		ImageView c3 = new ImageView("cards/" + n3 + ".png");
		
		//add the images
		box.getChildren().add(c1);
		box.getChildren().add(c2);
		box.getChildren().add(c3);
		
		//display
		primaryStage.setTitle("Q1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
}
