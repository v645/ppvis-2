package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        boolean run = ContextLoader.loadContext();
        Button publicCollection = new Button("Public collection");
        Button privateCollection = new Button("Private collection");
        Button compilations = new Button("Compilations");
        Button addBook = new Button("Add book");
        primaryStage.setTitle("Menu");
        VBox root =  new VBox(privateCollection, publicCollection, compilations, addBook);
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
