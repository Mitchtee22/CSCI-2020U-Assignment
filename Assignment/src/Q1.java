import java.util.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Q1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box = new HBox();
		Scene scene = new Scene(box);
		
		box.setSpacing(3);
		
		Random rand = new Random();
		
		int n1, n2, n3;
		
		n1 = rand.nextInt(54) + 1;
		
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
		
		ImageView c1 = new ImageView("cards/" + n1 + ".png");
		ImageView c2 = new ImageView("cards/" + n2 + ".png");
		ImageView c3 = new ImageView("cards/" + n3 + ".png");
		
		box.getChildren().add(c1);
		box.getChildren().add(c2);
		box.getChildren().add(c3);
		
		primaryStage.setTitle("Q1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
}
