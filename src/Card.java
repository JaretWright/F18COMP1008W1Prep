import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;


public class Card {
    private static List<String> validFaces = Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    private static List<String> validSuits = Arrays.asList("spades","clubs","hearts","diamonds");

    private String faceName, suit;
    private int faceValue;
    private Image cardImage;

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue();
    }

    public Card(String faceName, String suit, Image cardImage) {
        this(faceName, suit);
        setCardImage(cardImage);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        if (validFaces.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Invalid facename provided");
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {


        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Suit cannot be empty");

    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue() {
        faceValue = validFaces.indexOf(faceName)+2;
    }

    public Image getCardImage() {
        return cardImage;
    }

    public void setCardImage(Image cardImage) {
        this.cardImage = cardImage;
    }

    public String toString()
    {
        return String.format("%s of %s", getFaceName(), getSuit());
    }

    public static List<String> getValidFaces() {
        return validFaces;
    }

    public static List<String> getValidSuits() {
        return validSuits;
    }
}
