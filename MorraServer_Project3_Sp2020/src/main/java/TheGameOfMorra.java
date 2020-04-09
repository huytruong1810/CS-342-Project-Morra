import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public class TheGameOfMorra extends Application {


	ListView<String> listItems;
	Server serverConnection;
	int p1Points, p2Points;
	String p1Plays, p2Plays;
	String p1Guess, p2Guess;
	int numPlayers;

	public static void main(String[] args) {

		launch(args);

	}


	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("(Server) Let's Play Morra!!!");

		ImageView bigLogo1 = new ImageView(new Image("logo.png", 100, 100, true, true));
		bigLogo1.setRotate(45);

		ImageView bigLogo2 = new ImageView(new Image("logo.png", 66, 66, true, true));
		bigLogo2.setRotate(90);

		ImageView bigLogo3 = new ImageView(new Image("logo.png", 33, 33, true, true));
		bigLogo3.setRotate(135);

		ImageView bigLogo4 = new ImageView(new Image("logo.png", 66, 66, true, true));
		bigLogo2.setRotate(225);

		HBox logo = new HBox(7, bigLogo3, bigLogo2, bigLogo1, bigLogo4);

		ImageView connect = new ImageView(new Image("connect.png", 25, 25, true, true));
		connect.setFitWidth(25);
		connect.setFitHeight(25);

		Button launch = new Button("Launch");
		launch.setGraphic(connect);
		launch.setStyle(
				"-fx-background-radius: 100em;" +
						"-fx-min-height: 35px; " +
						"-fx-max-height: 35px;"
		);

		TextField portField = new TextField();
		portField.setMaxWidth(100);

		launch.setOnAction(e -> {

			ImageView smallLogo1 = new ImageView(new Image("logo.png", 45, 45, true, true));
			ImageView smallLogo2 = new ImageView(new Image("logo.png", 35, 35, true, true));
			ImageView smallLogo3 = new ImageView(new Image("logo.png", 25, 25, true, true));
			ImageView smallLogo4 = new ImageView(new Image("logo.png", 15, 15, true, true));

			smallLogo1.setRotate(45);
			smallLogo2.setRotate(90);
			smallLogo3.setRotate(135);
			smallLogo4.setRotate(225);

			VBox smallLogo = new VBox(10, smallLogo1, smallLogo2, smallLogo3, smallLogo4);

			listItems = new ListView<String>();

			TextField p1PointField = new TextField();
			TextField p2PointField = new TextField();

			p1PointField.setDisable(true);
			p2PointField.setDisable(true);

			HBox p1ScoreBox = new HBox(20, new Text("Points :"), p1PointField);
			VBox p1Area = new VBox(10, new Text("PLAYER 1"), p1ScoreBox);

			HBox p2ScoreBox = new HBox(20, new Text("Points :"), p2PointField);
			VBox p2Area = new VBox(10, new Text("PLAYER 2"), p2ScoreBox);


			int portNum = Integer.parseInt(portField.getText());

			listItems.getItems().add("Server listens on port " + portNum + "!\nWaiting for 2 players...");

			serverConnection = new Server(data -> {
				Platform.runLater (() -> listItems.getItems().add(data.toString())
				); }, portNum);

			HBox layoutBox = new HBox(20, smallLogo, listItems, new VBox(50, p1Area, p2Area));
			layoutBox.setPadding(new Insets(10));

			primaryStage.setScene(new Scene(layoutBox,600,400));

		});

		VBox portBox = new VBox(10, logo, new Text("Choose a port to listen on"),
								new HBox(40, new Text("Port number :"), portField), launch);
		portBox.setPadding(new Insets(10));

		// START SCENE
		primaryStage.setScene(new Scene(portBox, 300, 275));
		primaryStage.show();

	}


}
