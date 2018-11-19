
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Array;
import java.util.*;
import java.util.List;

public class Board extends JFrame implements ActionListener {
    public Container con = getContentPane();
    //public JLabel label = new JLabel();
    public ArrayList<Cards> gameDeck;
    public ArrayList<Cards> playDeck = new ArrayList<>();

    public ArrayList<JLabel> labels = new ArrayList<>();
    private List<JButton> buttons = new ArrayList();
    private List<JLabel> cardLabels = new ArrayList<>();


    public Board() {


        //create frame

        setTitle("Puzzle ");
        setLocation(550, 20); //location on screen
        setSize(1080, 920); // size
        setResizable(false); // stops the ability to resize window
        setLocationRelativeTo(null); // set location to center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the x button to stop the program
        setVisible(true); //Make it visible


    } //end of Board


    public void cardImage(JLabel label, Cards cards) {
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(cards.getPath()).getImage());
        label.setIcon(imageIcon);
    }


    public void gameArea() {


/*
        gameDeck = Cards.getCards(); // test all cards are coming out
        Collections.shuffle(gameDeck); //testing the shuffle -- its works.
         System.out.print(""+gameDeck); // part of the test


        playDeck.add(playCards);

        JLabel cardlabel = new JLabel();
        cardImage(cardlabel,playCards);
*/
        // System.out.print(""+ Cards.getCard(gameDeck));


        //creating a Jpanal with a grid layout


        int counter = 0;
        gameDeck = Cards.getCards(); // test all cards are coming out
        // gameDeck.add(Cards.getCard(playDeck));
        //gameDeck.add(Cards.getCards().get(1));
        //gameDeck.add(Cards.getCards().get(2));
        //gameDeck.add(Cards.getCards().get(3));
        //gameDeck.add(Cards.getCards().get(4));
        //gameDeck.add(Cards.getCards().get(5));
        //gameDeck.add(Cards.getCards().get(6));
        //gameDeck.add(Cards.getCards().get(7));

        System.out.print("test" + gameDeck);

        //System.out.print("gamedeck"+gameDeck);
        // playDeck =Cards.getCards();

        playDeck.add(Cards.getCards().get(0)); //AceHeart
        playDeck.add(Cards.getCards().get(1)); //AceSpades
        playDeck.add(Cards.getCards().get(2)); //kinghearts
        playDeck.add(Cards.getCards().get(3)); //kingspades
        playDeck.add(Cards.getCards().get(4));
        playDeck.add(Cards.getCards().get(5));
        playDeck.add(Cards.getCards().get(6));
        playDeck.add(Cards.getCards().get(7));


        List<Cards> shuffleDeck = new ArrayList<>();
        shuffleDeck.add(gameDeck.get(0));
        shuffleDeck.add(gameDeck.get(1));
        shuffleDeck.add(gameDeck.get(2));
        shuffleDeck.add(gameDeck.get(3));
        shuffleDeck.add(gameDeck.get(4));
        shuffleDeck.add(gameDeck.get(5));
        shuffleDeck.add(gameDeck.get(6));
        shuffleDeck.add(gameDeck.get(7));
        shuffleDeck.add(gameDeck.get(8));
        shuffleDeck.add(gameDeck.get(9));
        shuffleDeck.add(gameDeck.get(10));
        shuffleDeck.add(gameDeck.get(11));
        shuffleDeck.add(gameDeck.get(12));
        shuffleDeck.add(gameDeck.get(13));
        shuffleDeck.add(gameDeck.get(14));
        shuffleDeck.add(gameDeck.get(15));

        System.out.print("test" + shuffleDeck);
        Collections.shuffle(shuffleDeck);

        // System.out.print("playdeck\n\n" + playDeck);


        //creating a Jpanal with a grid layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));


        Cards playCards;//= Cards.getCard(playDeck);
        Cards playCards1;


        int gbCount = 1;
        /*
        for (int i = 0; i < 4; i++) { // create a loop of square buttons

        //playCards =  playDeck.get(i);
        //  playCards.getCard(playDeck);

        // System.out.print("playCard\n\n"+ playCards);

        JLabel cardlabel = new JLabel();
        playCards1 = shuffleDeck.get(i);
        cardImage(cardlabel,playCards1);

        for (int j = 0; j < 8; j++) {

            //Collections.shuffle(playDeck);

            labels.add(cardlabel);
            playCards = shuffleDeck.get(j);


            cardImage(cardlabel,playCards);





            buttonPanel.add(cardlabel,BorderLayout.CENTER);

        }//end of second for
    }//end of first for
        */

int c = 0;

            for (int j = 0; j < 16; j++) {

                JButton gameButton = new JButton();
                gameButton.setText("" + gbCount);
                gbCount++;
                buttonPanel.add(gameButton);
                gameButton.addActionListener(this);
                buttons.add(gameButton);

                JLabel cardlabel = new JLabel();
                playCards = shuffleDeck.get(j);
                c++;
                cardImage(cardlabel, playCards);
                // ImageIcon icon = new ImageIcon(pathList.get(i));
                //cardlabel.setIcon(icon);

                //System.out.print("b"+gameButton.getText());
                Border border = BorderFactory.createLineBorder(Color.BLACK, 2);  //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
                cardlabel.setBorder(border);

                cardlabel.setVisible(false);
                cardLabels.add(cardlabel);
                buttonPanel.add(cardlabel);

            }


/*
            Card c = new Card();
            c.getJlabel(cardlabel);
            c.setId(i);
            cardPanel.add(cardlabel, BorderLayout.CENTER);
            cardLabels.add(cardlabel);
            System.out.print(c);
  */



        //  System.out.print(labels.get(0));
        con.add(buttonPanel, BorderLayout.CENTER); //gotta look at adding all this to myGui

    } // end of gameArea();


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 16; i++) {

            if (e.getSource() == buttons.get(i)) {

                cardLabels.get(i).setVisible(true);
                //  selectedCard = cardLabels.get(i);
                //  doTurn();
                //  JOptionPane.showMessageDialog(null,c1);
            }

        }
    }

}

