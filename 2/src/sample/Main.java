package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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

        Stage compList = new Stage();
        ObservableList<String> userCompilations = FXCollections.observableArrayList("compilation1", "compilation2", "compilation3");
        ListView<String> compilationsList = new ListView<String>(userCompilations);
        Button open = new Button("Open");
        Button edit = new Button("Edit");
        Button create = new Button("Create");
        Button delete = new Button("Delete");
        compList.setTitle("My compilations");
        HBox hbox1 = new HBox(open, edit);
        HBox hbox2 = new HBox(create, delete);
        VBox root1 =  new VBox(compilationsList, hbox1, hbox2);
        compList.setScene(new Scene(root1, 300, 275));

        compList.show();

        Stage reader = new Stage();
        Label bookName = new Label("Book name");
        Label read = new Label();
        read.setMinHeight(200);
        read.setMinWidth(200);
        Button forward = new Button("-->");
        Button back = new Button("<--");
        Button goBack = new Button("<==");
        Button content = new Button("Contene");
        reader.setTitle("Reader");
        HBox rhbox1 = new HBox(back, bookName, forward);
        HBox rhbox2 = new HBox(goBack, content);
        VBox rroot1 =  new VBox(rhbox1, read, rhbox2);
        reader.setScene(new Scene(rroot1, 300, 275));

        reader.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
