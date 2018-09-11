
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchVisualCards extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CardViewer.fxml"));
        stage.getIcons().add(new Image("Images/2_of_spades.png"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        stage.setTitle("Super awesome card viewer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}