import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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

		ImageView bigLogo2 = new ImageView(new Image("logo.png", 50, 50, true, true));
		bigLogo2.setRotate(135);

		StackPane logo = new StackPane(bigLogo1, bigLogo2);

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

			listItems = new ListView<String>();

			Text p1ScoreBox = new Text("Points: null");
			Text p1PlaysBox = new Text("Plays: null");
			Text p1GuessBox = new Text("Guess: null");
			VBox p1Area = new VBox(10, new Text("PLAYER 1"), p1ScoreBox, p1PlaysBox, p1GuessBox);

			Text p2ScoreBox = new Text("Points: null");
			Text p2PlaysBox = new Text("Plays: null");
			Text p2GuessBox = new Text("Guess: null");
			VBox p2Area = new VBox(10, new Text("PLAYER 2"), p2ScoreBox, p2PlaysBox, p2GuessBox);

			int port = Integer.parseInt(portField.getText());
			portField.setDisable(true);

			listItems.getItems().add("Server listens on port " + port + "!\nWaiting for 2 players...");
			serverConnection = new Server(data -> {
				Platform.runLater (() -> {
					listItems.getItems().add(data.toString());
				}); }, port);

			primaryStage.setScene(new Scene(new HBox(20, listItems, new VBox(50, p1Area, p2Area)),600,400));

		});

		VBox portBox = new VBox(10, logo, new Text("Choose a port to listen on"),
								new HBox(40, new Text("Port number :"), portField), launch);
		portBox.setPadding(new Insets(10));

		// START SCENE
		primaryStage.setScene(new Scene(portBox, 300, 275));
		primaryStage.show();

	}


}
