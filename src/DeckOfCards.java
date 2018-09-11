import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards()
    {
        deck = new ArrayList<>();

        for (String suit : Card.getValidSuits())
        {
            for (String face : Card.getValidFaces())
            {
                String imageFileName = String.format("Images/%s_of_%s.png", face, suit);
                deck.add(new Card(face, suit, new Image(imageFileName)));
            }
        }
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public Card dealTopCard()
    {
        return deck.remove(0);
    }
}
