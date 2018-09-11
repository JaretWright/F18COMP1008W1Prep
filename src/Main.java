import javafx.scene.image.Image;
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {

        Card aceOfSpades = new Card("ace","Spades");
        System.out.printf("The card is: %s%n", aceOfSpades);


    }
}
