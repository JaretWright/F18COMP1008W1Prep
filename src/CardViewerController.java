import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CardViewerController implements Initializable {

    @FXML private ImageView cardImage;
    @FXML private Label suitLabel;
    @FXML private Label faceLabel;
    @FXML private Label faceValueLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card tempCard = deck.dealTopCard();
        System.out.printf("The card is %s and has a value of %d%n", tempCard.toString(), tempCard.getFaceValue());
        cardImage.setImage(tempCard.getCardImage());

        suitLabel.setText(tempCard.getSuit());
        faceLabel.setText(tempCard.getFaceName());
        faceValueLabel.setText(String.format("%d",tempCard.getFaceValue()));
    }
}
