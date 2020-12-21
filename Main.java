package flipper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("screens/StartingScreen.fxml"));
        primaryStage.setTitle("House Flipper");
        primaryStage.setScene(new Scene(root, 1080, 720));
        primaryStage.show();


    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}

