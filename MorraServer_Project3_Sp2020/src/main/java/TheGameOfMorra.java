import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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

		listItems = new ListView<String>();
		listItems.getItems().add("Please choose and submit a port\n(default is 5555)");

		TextField portField = new TextField("5555");
		portField.setMaxWidth(50);
		Button portSubmit = new Button("Submit");
		VBox portBox = new VBox(10, new Text("Port"), portField, portSubmit);

		portSubmit.setOnAction(e -> {
			int port = Integer.parseInt(portField.getText());
			portField.setDisable(true);
			portSubmit.setDisable(true);
			listItems.getItems().add("Server listens on port " + port + "!\nWaiting for 2 players...");
			serverConnection = new Server(data -> {
				Platform.runLater (() -> {
					listItems.getItems().add(data.toString());
				}); }, port);
		});

		Text p1ScoreBox = new Text("Points: null");
		Text p1PlaysBox = new Text("Plays: null");
		Text p1GuessBox = new Text("Guess: null");
		VBox p1Area = new VBox(10, new Text("PLAYER 1"), p1ScoreBox, p1PlaysBox, p1GuessBox);

		Text p2ScoreBox = new Text("Points: null");
		Text p2PlaysBox = new Text("Plays: null");
		Text p2GuessBox = new Text("Guess: null");
		VBox p2Area = new VBox(10, new Text("PLAYER 2"), p2ScoreBox, p2PlaysBox, p2GuessBox);

		Scene scene = new Scene(new HBox(20, listItems, portBox, new VBox(50, p1Area, p2Area)),600,400);

		primaryStage.setScene(scene);
		primaryStage.show();

	}


}
