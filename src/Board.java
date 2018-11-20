
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

    public ArrayList<JLabel> matchedLabels = new ArrayList<>(); // Thought about putting each choice and then comapring
    // them
    private List<JButton> buttons = new ArrayList();
    private List<JLabel> cardLabels = new ArrayList<>();
    private JLabel selectedCard;
    private JLabel firstPick;
    private JLabel secondPick;

    Player player;
    ArrayList<Player> players = new ArrayList<>();


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


        // credit to James O Mahoney for sending me on the right path
        // regarding adding images to an object.
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

        //    System.out.print("test" + gameDeck);

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

        //   System.out.print("test" + shuffleDeck);
        // Collections.shuffle(shuffleDeck);

        // System.out.print("playdeck\n\n" + playDeck);


        //creating a Jpanal with a grid layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));


        Cards playCards;//= Cards.getCard(playDeck);
        Cards playCards1;


        int gbCount = 1;

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
            cardlabel.setText("" + c);
            c++;

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


            if (e.getSource() == buttons.get(i)) {          //https://stackoverflow.com/questions/21228284/exception-in-thread-awt-eventqueue-0-java-lang-nullpointerexception-error

                cardLabels.get(i).setVisible(true);
                //cardLabels.get(i).setText("  ");                            // gotta get help here, cant work it out

                selectedCard = cardLabels.get(i);
                doTurn();
              //  System.out.print(selectedCard);

              //  System.out.print("dsfdfs" + firstPick);
                //first time  selected card becomes first card
                //checkCards();

                //    cardLabels.get(i).setText("firstPick");
                //  matchedLabels.add(cardLabels.get(i));

                //JOptionPane.showMessageDialog(null,matchedLabels);
                // selectedCard = cardLabels.get(i);
                //doTurn();
            }
            //   System.out.print("matched" + matchedLabels);







            //doTurn();


            //System.out.print("dsfdfs" + firstPick);
            //first time  selected card becomes first card
            //checkCards();

            //    cardLabels.get(i).setText("firstPick");
            //  matchedLabels.add(cardLabels.get(i));

            //JOptionPane.showMessageDialog(null,matchedLabels);
            // selectedCard = cardLabels.get(i);
            //doTurn();
        }
        JOptionPane.showMessageDialog(null, firstPick, "first pick", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, secondPick, "second pic", JOptionPane.INFORMATION_MESSAGE);


        System.out.print("secondcard" + secondPick);


    }

    public void doTurn() {

//https://stackoverflow.com/questions/21228284/exception-in-thread-awt-eventqueue-0-java-lang-nullpointerexception-error

        //

        if (firstPick.getText().isEmpty() && secondPick.getText().isEmpty()) {
            firstPick = selectedCard;

            //if the first pick is empty

        }
        if (!firstPick.getText().isEmpty() && secondPick != selectedCard && secondPick.getText().isEmpty()) {
            secondPick = selectedCard;

        }
    }

    public void checkCards() {
        if (firstPick == secondPick) {

            System.out.print("checking cards");//match condition
            //c1.setEnabled(false); //disables the button
            //c2.setEnabled(false);
            //c1.setMatched(true); //flags the button as having been matched
            //c2.setMatched(true);
            //if (this.isGameWon()){
            //  JOptionPane.showMessageDialog(this, "You win!");
            //System.exit(0);
        }
    }

    public void gameOver() {

        JTextArea jta = new JTextArea("player");
        for (Player player : players) ;
        {
            jta.append(player.toString());
            JOptionPane.showMessageDialog(null, jta);

            JOptionPane.showMessageDialog(null, jta);


        }


        //

        // Display text area here with name and scores
        //add save file here
    }
}
