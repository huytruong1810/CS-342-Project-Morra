import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CoffeeShop extends Application {

	Coffee order = new BasicCoffee();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("The Bean Juice cafe");

		Button startButton = new Button("Build your order!");

		startButton.setOnAction(e -> {

			ListView listView = new ListView();

			Text finalOrder = new Text("Final Order\n\nBlack Coffee: $3.99");
			finalOrder.setVisible(false);
			finalOrder.setFill(Color.CYAN);
			finalOrder.setFont(Font.font ("Comic Sans", 20));

			Button cream = new Button("Add Cream");
			ImageView creamPic = new ImageView(new Image("cream.png"));
			creamPic.setFitHeight(50);
			creamPic.setFitWidth(50);
			cream.setGraphic(creamPic);

			Button extraShot = new Button("Add Extra Shot");
			ImageView extraShotPic = new ImageView(new Image("extraShot.png"));
			extraShotPic.setFitHeight(50);
			extraShotPic.setFitWidth(50);
			extraShot.setGraphic(extraShotPic);

			Button seaSalt = new Button("Add Sea Salt");
			ImageView seaSaltPic = new ImageView(new Image("seaSalt.png"));
			seaSaltPic.setFitHeight(50);
			seaSaltPic.setFitWidth(50);
			seaSalt.setGraphic(seaSaltPic);

			Button sugar = new Button("Add Sugar");
			ImageView sugarPic = new ImageView(new Image("sugar.png"));
			sugarPic.setFitHeight(50);
			sugarPic.setFitWidth(50);
			sugar.setGraphic(sugarPic);

			Button cinnamon = new Button("Add Cinnamon");
			ImageView cinnamonPic = new ImageView(new Image("cinnamon.png"));
			cinnamonPic.setFitHeight(50);
			cinnamonPic.setFitWidth(50);
			cinnamon.setGraphic(cinnamonPic);

			Button complete = new Button("Check Out");
			ImageView completePic = new ImageView(new Image("complete.png"));
			completePic.setFitHeight(20);
			completePic.setFitWidth(20);
			complete.setGraphic(completePic);
			complete.setDisable(false);

			Button add = new Button("New Order");
			ImageView addPic = new ImageView(new Image("new.png"));
			addPic.setFitHeight(20);
			addPic.setFitWidth(20);
			add.setGraphic(addPic);
			add.setDisable(true);

			Button reset = new Button("Reset Order");
			ImageView resetPic = new ImageView(new Image("reset.png"));
			resetPic.setFitHeight(20);
			resetPic.setFitWidth(20);
			reset.setGraphic(resetPic);
			reset.setDisable(false);


			listView.getItems().add("Black Coffee: $3.99");

			cream.setOnAction(event -> {
				order = new Cream(order);
				listView.getItems().add("+ cream: $.50");
				finalOrder.setText(finalOrder.getText() + "\n+ cream: $.50");
			});

			extraShot.setOnAction(event -> {
				order = new ExtraShot(order);
				listView.getItems().add("+ extra shot: $1.20");
				finalOrder.setText(finalOrder.getText() + "\n+ extra shot: $1.20");
			});

			seaSalt.setOnAction(event -> {
				order = new SeaSalt(order);
				listView.getItems().add("+ sea salt: $.70");
				finalOrder.setText(finalOrder.getText() + "\n+ sea salt: $.70");
			});

			sugar.setOnAction(event -> {
				order = new Sugar(order);
				listView.getItems().add("+ sugar: $.50");
				finalOrder.setText(finalOrder.getText() + "\n+ sugar: $.50");
			});

			cinnamon.setOnAction(event -> {
				order = new Cinnamon(order);
				listView.getItems().add("+ cinnamon: $.40");
				finalOrder.setText(finalOrder.getText() + "\n+ cinnamon: $.40");
			});

			complete.setOnAction(event -> {

				complete.setDisable(true);
				add.setDisable(false);
				reset.setDisable(true);

				cream.setDisable(true);
				extraShot.setDisable(true);
				seaSalt.setDisable(true);
				sugar.setDisable(true);
				cinnamon.setDisable(true);

				listView.getItems().clear();
				finalOrder.setVisible(true);
				finalOrder.setText(finalOrder.getText() + "\n\nTotal: $" + order.makeCoffee());

				System.out.println("Total: $" + order.makeCoffee());

			});

			add.setOnAction(event -> {

				complete.setDisable(false);
				add.setDisable(true);
				reset.setDisable(false);

				cream.setDisable(false);
				extraShot.setDisable(false);
				seaSalt.setDisable(false);
				sugar.setDisable(false);
				cinnamon.setDisable(false);

				order = new BasicCoffee();
				listView.getItems().add("Black Coffee: $3.99");
				finalOrder.setText("Final Order\n\nBlack Coffee: $3.99");
				finalOrder.setVisible(false);

			});

			reset.setOnAction(event -> {

				complete.setDisable(false);
				add.setDisable(true);
				reset.setDisable(false);

				order = new BasicCoffee();
				listView.getItems().clear();
				listView.getItems().add("Black Coffee: $3.99");
				finalOrder.setText("Final Order\n\nBlack Coffee: $3.99");
				finalOrder.setVisible(false);

			});

			HBox ingredientsBox = new HBox(20, cream, extraShot, seaSalt, sugar, cinnamon);
			ingredientsBox.setAlignment(Pos.CENTER);

			VBox optionBox = new VBox(20, reset, complete, add);
			optionBox.setAlignment(Pos.CENTER);

			BorderPane pane = new BorderPane();
			pane.setTop(ingredientsBox);
			pane.setLeft(finalOrder);
			pane.setCenter(listView);
			pane.setRight(optionBox);
			pane.setStyle("-fx-background-color: rgba(116, 61, 61, 0.91);");

			primaryStage.setScene(new Scene(pane,950,500));

		});

		ImageView startPic = new ImageView(new Image("coffeebeans.png"));
		startPic.setFitHeight(200);
		startPic.setFitWidth(200);

		VBox startBox = new VBox(20, startPic, startButton);
		startBox.setAlignment(Pos.CENTER);

		Rectangle startBG = new Rectangle();
		startBG.setFill(Color.MEDIUMSEAGREEN);
		startBG.setHeight(350);
		startBG.setWidth(470);
		startBG.setRotate(45);

		StackPane startPane = new StackPane(startBG, startBox);

		primaryStage.setScene(new Scene(startPane,400,400));
		primaryStage.show();
		
		Coffee order = new Sugar(new Cream( new ExtraShot(new BasicCoffee())));
		
		double cost = order.makeCoffee();
		System.out.println("Total: " + cost);

	}

}
