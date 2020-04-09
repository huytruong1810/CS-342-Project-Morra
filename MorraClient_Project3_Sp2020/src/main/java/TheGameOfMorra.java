import javafx.scene.control.Label;
import javafx.scene.text.Text; 
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TheGameOfMorra extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("(Client) Let's Play Morra!!!");
		
		/* Images */ 
		Image bigLogo = new Image("logo.png", 100, 100, true, true); 
		Image smallLogo = new Image("logo.png", 35, 35, true, true); 
		Image connect = new Image("connect.png", 25, 25, true, true); 
		Image zeroFingers = new Image("zero-fingers.png", 50, 50, true, true); 
		Image oneFinger = new Image("one-finger.png", 50, 50, true, true); 
		Image twoFingers = new Image("two-fingers.png", 50, 50, true, true); 
		Image threeFingers = new Image("three-fingers.png", 50, 50, true, true); 
		Image fourFingers = new Image("four-fingers.png", 50, 50, true, true); 
		Image fiveFingers = new Image("five-fingers.png", 50, 50, true, true); 
		Image exit = new Image("exit.png", 25, 25, true, true); 
		Image plus = new Image("plus.png", 25, 25, true, true); 
		Image settings = new Image("settings.png", 25, 25, true, true); 
		Image end = new Image("end.png", 25, 25, true, true); 
		Image replay = new Image("replay.png", 25, 25, true, true); 
		
		/* Buttons */ 
		Button Connect = new Button("Connect");
		Connect.setGraphic(new ImageView(connect));
		Connect.setStyle(
				"-fx-background-radius: 100em;" +
                "-fx-min-height: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button ZeroFingers = new Button("");
		ZeroFingers.setGraphic(new ImageView(zeroFingers));
		ZeroFingers.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button OneFinger = new Button("");
		OneFinger.setGraphic(new ImageView(oneFinger));
		OneFinger.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button TwoFingers = new Button("");
		TwoFingers.setGraphic(new ImageView(twoFingers));
		TwoFingers.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button ThreeFingers = new Button("");
		ThreeFingers.setGraphic(new ImageView(threeFingers));
		ThreeFingers.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button FourFingers = new Button("");
		FourFingers.setGraphic(new ImageView(fourFingers));
		FourFingers.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button FiveFingers = new Button("");
		FiveFingers.setGraphic(new ImageView(fiveFingers));
		FiveFingers.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button ZeroFingersGuess = new Button("");
		ZeroFingersGuess.setGraphic(new ImageView(zeroFingers));
		ZeroFingersGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button OneFingerGuess = new Button("");
		OneFingerGuess.setGraphic(new ImageView(oneFinger));
		OneFingerGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button TwoFingersGuess = new Button("");
		TwoFingersGuess.setGraphic(new ImageView(twoFingers));
		TwoFingersGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button ThreeFingersGuess = new Button("");
		ThreeFingersGuess.setGraphic(new ImageView(threeFingers));
		ThreeFingersGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button FourFingersGuess = new Button("");
		FourFingersGuess.setGraphic(new ImageView(fourFingers));
		FourFingersGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button FiveFingersGuess = new Button("");
		FiveFingersGuess.setGraphic(new ImageView(fiveFingers));
		FiveFingersGuess.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 60px; " +
                "-fx-min-height: 60px; " +
                "-fx-max-width: 60px; " +
                "-fx-max-height: 60px;" +
                "-fx-base: #e1ef7e;"
        );
		
		Button Exit = new Button("");
		Exit.setGraphic(new ImageView(exit));
		Exit.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 35px; " +
                "-fx-min-height: 35px; " +
                "-fx-max-width: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button Plus = new Button("");
		Plus.setGraphic(new ImageView(plus));
		Plus.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 35px; " +
                "-fx-min-height: 35px; " +
                "-fx-max-width: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button Settings = new Button("");
		Settings.setGraphic(new ImageView(settings));
		Settings.setStyle(
				"-fx-background-radius: 100em;" +
				"-fx-min-width: 35px; " +
                "-fx-min-height: 35px; " +
                "-fx-max-width: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button End = new Button("End Game");
		End.setGraphic(new ImageView(end));
		End.setStyle(
				"-fx-background-radius: 100em;" +
                "-fx-min-height: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button ExitGame = new Button("Exit Game");
		ExitGame.setGraphic(new ImageView(exit));
		ExitGame.setStyle(
				"-fx-background-radius: 100em;" +
                "-fx-min-height: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		Button Replay = new Button("Restart Game");
		Replay.setGraphic(new ImageView(replay));
		Replay.setStyle(
				"-fx-background-radius: 100em;" +
                "-fx-min-height: 35px; " +
                "-fx-max-height: 35px;"
        );
		
		/* Text */ 
		Text ConnectionTitle = new Text("Establish Connection");
		Text ServerMessagesTitle = new Text("Server Messages:");
		Text OpponentGuessTitle = new Text("Opponent's Guess:");
		Text OpponentChoiceTitle = new Text("Opponent's Choice:");
		Text YourChoiceTitle = new Text("Your Choice:");
		Text YourGuessTitle = new Text("Your Guess:");
		Text ScoreBoardTitle = new Text("Score Board:");
		Text GameOverTitle = new Text("Game Over"); 
		
		/* Scene 1: User enter Port Number and IP Address */
		/* Connection Grid */ 
		GridPane ConnectionInfo = new GridPane(); 
		ConnectionInfo.setAlignment(Pos.BOTTOM_CENTER); 
		ConnectionInfo.setHgap(10); 
		ConnectionInfo.setVgap(10); 
		ConnectionInfo.setPadding(new Insets(25, 25, 25, 25)); 
		
		/* Connection Text */ 
		ConnectionInfo.setPadding(new Insets(0, 0, 0, 0)); 
        ConnectionInfo.add(ConnectionTitle, 0, 0, 2, 1); 
        
		Label IPAddress = new Label("IP Address :"); 
		ConnectionInfo.add(IPAddress, 0, 1); 
		
		TextField IP = new TextField(); 
		ConnectionInfo.add(IP, 1, 1);
		
		Label PortNumber = new Label("Port Number :");
		ConnectionInfo.add(PortNumber, 0, 2);
		
		TextField Port = new TextField(); 
		ConnectionInfo.add(Port, 1, 2);
		
		/* Connection Button */
		HBox Connection = new HBox(10);
		Connection.setAlignment(Pos.BOTTOM_RIGHT); 
		Connection.getChildren().add(Connect); 
		ConnectionInfo.add(Connection, 1, 4);
		
		HBox Logo = new HBox(10);
		Logo.setAlignment(Pos.BASELINE_CENTER);
		Logo.setPadding(new Insets(5, 0, 0, 0));
		Logo.getChildren().add(new ImageView(bigLogo));
		
		
		
		/* Scene 2: Game Scene */ 
		BorderPane GameLayout = new BorderPane();
		
		/* Game Header */
		HBox Header = new HBox(); 
		Header.setPadding(new Insets(5, 12, 5, 12));
		Header.setSpacing(10);
		Header.setStyle("-fx-background-color: #00bdaa");
		Header.setAlignment(Pos.BOTTOM_RIGHT);
		Header.getChildren().addAll(End, Plus, Settings, Exit, new ImageView(smallLogo));
		
		
		
		/* Server Messages */ 
		VBox ServerMessages = new VBox(); 
		ServerMessages.setPadding(new Insets(10));
		ServerMessages.setSpacing(8); 
		ServerMessages.setStyle("-fx-background-color: #d1cebd"); 
		
		ListView MessageBoard = new ListView();
		MessageBoard.setPrefWidth(150);
		MessageBoard.setPrefHeight(200);
		MessageBoard.setStyle("-fx-base: #ffffff"); 
		
		ServerMessages.getChildren().add(ServerMessagesTitle);

		
		/* Display Opponent Guess */
		Circle OpponentGuess = new Circle(); 
		OpponentGuess.setRadius(50);
		OpponentGuess.setFill(Color.web("#e1ef7e"));
		StackPane OpponentGuessStack = new StackPane(); 
		OpponentGuessStack.getChildren().addAll(OpponentGuess, new ImageView(zeroFingers)); 
		
		/* Display Opponent Choice */
		Circle OpponentChoice = new Circle(); 
		OpponentChoice.setRadius(50);
		OpponentChoice.setFill(Color.web("#e1ef7e"));
		StackPane OpponentChoiceStack = new StackPane(); 
		OpponentChoiceStack.getChildren().addAll(OpponentChoice, new ImageView(fiveFingers)); 
		
		ServerMessages.getChildren().addAll(MessageBoard, OpponentChoiceTitle, OpponentChoiceStack, OpponentGuessTitle, OpponentGuessStack); 
		
		
		/* Game Player Choice */ 
		VBox GameChoices = new VBox(); 
		GameChoices.setPadding(new Insets(10));
		GameChoices.setSpacing(25); 
		GameChoices.setStyle("-fx-background-color: #f6eedf"); 
		
		HBox ChoiceSelection = new HBox(); 
		ChoiceSelection.setPadding(new Insets(15, 12, 15, 12));
		ChoiceSelection.setSpacing(10);
		ChoiceSelection.getChildren().addAll(ZeroFingers, OneFinger, TwoFingers, ThreeFingers, FourFingers, FiveFingers); 
		
		HBox GuessSelection = new HBox(); 
		GuessSelection.setPadding(new Insets(15, 12, 15, 12));
		GuessSelection.setSpacing(10);
		GuessSelection.getChildren().addAll(ZeroFingersGuess, OneFingerGuess, TwoFingersGuess, ThreeFingersGuess, FourFingersGuess, FiveFingersGuess); 
		
		Circle YourChoice = new Circle(); 
		YourChoice.setRadius(50);
		YourChoice.setFill(Color.web("#e1ef7e"));
		StackPane YourChoiceStack = new StackPane(); 
		YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(zeroFingers)); 
		
		Circle YourGuess = new Circle(); 
		YourGuess.setRadius(50);
		YourGuess.setFill(Color.web("#e1ef7e"));
		StackPane YourGuessStack = new StackPane(); 
		YourGuessStack.getChildren().addAll(YourGuess, new ImageView(zeroFingers)); 
		
		/* Your Choice Button Selection */ 
		ZeroFingers.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(zeroFingers)); 
			}
		});
		
		OneFinger.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(oneFinger)); 
			}
		});
		
		TwoFingers.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(twoFingers)); 
			}
		});
		
		ThreeFingers.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(threeFingers)); 
			}
		});
		
		FourFingers.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(fourFingers)); 
			}
		});
		
		FiveFingers.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourChoiceStack.getChildren().clear();
				YourChoiceStack.getChildren().addAll(YourChoice, new ImageView(fiveFingers)); 
			}
		});
		
		/* Your Guess Button Selection */ 
		ZeroFingersGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(zeroFingers)); 
			}
		});
		
		OneFingerGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(oneFinger)); 
			}
		});
		
		TwoFingersGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(twoFingers)); 
			}
		});
		
		ThreeFingersGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(threeFingers)); 
			}
		});
		
		FourFingersGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(fourFingers)); 
			}
		});
		
		FiveFingersGuess.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				YourGuessStack.getChildren().clear();
				YourGuessStack.getChildren().addAll(YourGuess, new ImageView(fiveFingers)); 
			}
		});
		
		/* Other Buttons */
		
		Exit.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit(); 
			}
		});
		
		ExitGame.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit(); 
			}
		});
		
		GameChoices.getChildren().addAll(YourChoiceTitle, YourChoiceStack, ChoiceSelection, YourGuessTitle, YourGuessStack, GuessSelection); 
		
		/* Game Scores */ 
		VBox ScoreBoard = new VBox(); 
		ScoreBoard.setPadding(new Insets(10));
		ScoreBoard.setSpacing(8); 
		ScoreBoard.setPrefWidth(160); 
		ScoreBoard.setStyle("-fx-background-color: #f6eedf"); 
		
		ListView GameScore = new ListView();
		GameScore.setPrefWidth(50);
		GameScore.setPrefHeight(80);
		GameScore.setStyle("-fx-base: #fe346e"); 
		
		ScoreBoard.getChildren().addAll(ScoreBoardTitle, GameScore); 
		
		HBox GameChoicesScoreBoard = new HBox(GameChoices, ScoreBoard); 
		GameChoicesScoreBoard.setSpacing(0);
		GameLayout.setTop(Header);
		GameLayout.setLeft(ServerMessages);
		GameLayout.setCenter(GameChoicesScoreBoard);
		

		ScrollPane GameScrollPane = new ScrollPane();
		GameScrollPane.setContent(GameLayout); 
		GameScrollPane.setHbarPolicy(ScrollBarPolicy.ALWAYS);
		GameScrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
		/* Scene 3: Game Ends */
		
		/* End Grid */ 
		GridPane GameOver = new GridPane(); 
		GameOver.setAlignment(Pos.BOTTOM_CENTER); 
		GameOver.setHgap(10); 
		GameOver.setVgap(10); 
		GameOver.setPadding(new Insets(25, 25, 25, 25)); 
		
		/* End Game Text */ 
		GameOver.setPadding(new Insets(0, 0, 0, 0)); 
        GameOver.add(GameOverTitle, 0, 0, 2, 1); 
        
		Label GameWinner = new Label("Game Winner :"); 
		GameOver.add(GameWinner, 0, 1); 
		
		TextField GameWinnerName  = new TextField(); 
		GameOver.add(GameWinnerName, 1, 1);
		
		Label PlayerOnePoints = new Label("Player 1 Points :");
		GameOver.add(PlayerOnePoints, 0, 2);
		
		TextField  PlayerOnePointsNumber = new TextField(); 
		GameOver.add(PlayerOnePointsNumber, 1, 2);
		
		Label PlayerTwoPoints = new Label("Your Points :");
		GameOver.add(PlayerTwoPoints, 0, 3);
		
		TextField PlayerTwoPointsNumber = new TextField(); 
		GameOver.add(PlayerTwoPointsNumber, 1, 3);
		
		/* End Game Buttons */
		HBox GameOverOptions = new HBox(10);
		GameOverOptions.setAlignment(Pos.BOTTOM_CENTER); 
		GameOverOptions.getChildren().addAll(Replay, ExitGame); 
		GameOver.add(GameOverOptions, 1, 4);
		
		HBox EndLogo = new HBox(10);
		EndLogo.setAlignment(Pos.BASELINE_CENTER);
		EndLogo.setPadding(new Insets(5, 0, 0, 0));
		EndLogo.getChildren().add(new ImageView(bigLogo));
		
		Scene startScene = new Scene(new VBox(Logo, ConnectionInfo), 300, 275);
		Scene gameScene = new Scene(new VBox(GameLayout, GameScrollPane), 800, 600);
		Scene endScene = new Scene(new VBox(EndLogo, GameOver), 400, 300);
		Connect.setOnAction(e -> primaryStage.setScene(gameScene));
		End.setOnAction(e-> primaryStage.setScene(endScene));
		primaryStage.setScene(startScene);
		primaryStage.show();
	}

}
