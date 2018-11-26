
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Board extends JFrame {
    public Container con = getContentPane();
    public ArrayList<Cards> playDeck = new ArrayList<>();
    private List<JLabel> cardLabels = new ArrayList<>();
    private Cards selectedCard;
    private Cards firstPick;
    private Cards secondPick;
   public Cards playCards;// list of playcards

  public   ArrayList<Cards> allPlayCards = new ArrayList<>();

   public Player player;

   public ArrayList<Player> players = new ArrayList<>();

    int count = 0;


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

        playDeck.addAll(Cards.getCards());


        //  System.out.print(playDeck);

        List<Cards> shuffleDeck = new ArrayList<>();
        shuffleDeck.add(playDeck.get(0));
        shuffleDeck.add(playDeck.get(1));
        shuffleDeck.add(playDeck.get(2));
        shuffleDeck.add(playDeck.get(3));
        shuffleDeck.add(playDeck.get(4));
        shuffleDeck.add(playDeck.get(5));
        shuffleDeck.add(playDeck.get(6));
        shuffleDeck.add(playDeck.get(7));
        shuffleDeck.add(playDeck.get(8));
        shuffleDeck.add(playDeck.get(9));
        shuffleDeck.add(playDeck.get(10));
        shuffleDeck.add(playDeck.get(11));
        shuffleDeck.add(playDeck.get(12));
        shuffleDeck.add(playDeck.get(13));
        shuffleDeck.add(playDeck.get(14));
        shuffleDeck.add(playDeck.get(15));

        //  System.out.print("test" + shuffleDeck);
        Collections.shuffle(shuffleDeck);
        //creating a Jpanal with a grid layout




        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        int gbCount = 1;
        int c = 0;


        // creating the labels
        for (int j = 0; j < 16; j++) {


            JLabel cardlabel = new JLabel();
            playCards = shuffleDeck.get(j);
            // Cards n = new Cards();
            cardImage(cardlabel, playCards);
            cardlabel.setText("" + c);
            c++;
            playCards.setLabel(cardlabel);

            System.out.println(playCards.getCardLabel());
            playCards.add(cardlabel);

            Border border = BorderFactory.createLineBorder(Color.BLACK, 2);  //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
            cardlabel.setBorder(border);
            cardlabel.setVisible(false);
            cardLabels.add(cardlabel);

            buttonPanel.add(cardlabel);
            //buttonPanel.add(playCards);
            allPlayCards.add(playCards);
        }

        //for(Cards cd : allPlayCards)
        //      System.out.println("\n\n" + cd);


        //Creating card object
        for (int i = 0; i <16; i++){


            //constructor call adde by JB to populate the cards with the corresponding cards from the
            //allPlayCards array list - these have labels attached to them also at this point

            Cards n = new Cards(allPlayCards.get(i).getRanks(),allPlayCards.get(i).getValue(),allPlayCards.get(i).getId(),
                    allPlayCards.get(i).getPath(),allPlayCards.get(i).getCardLabel());
            //n.setId()
            //n.setLabel(cardLabels.get(i));
            //n.add(cardLabels.get(i));
            //n.getCard(playDeck.get(i));
            // n.setRanks(playDeck.get(i).getRanks());

                                                                            /*
                                                                            Stuck here

                                                                            Cant figure out how to add the Jlabel to the
                                                                            corrosponding object
                                                                            */

            int finalI = i;

            n.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    //cardLabels.get(finalI).setVisible(true);
                    //allPlayCards.get(Integer.parseInt(((Cards)(e.getSource())).getCardLabel().getText())).setVisible(true);
                    ((Cards)(e.getSource())).getCardLabel().setVisible(true);


                    //System.out.print("n card\n"+e.getSource());
                    selectedCard =(Cards)e.getSource();




                    doTurn();

                    System.out.print("\n\n\nFirst picked Card:\n\n  " + firstPick);
                    System.out.print("\n\n\nSecond picked Card:\n\n  " +secondPick);

                    checkCards();

                }
            });




            buttonPanel.add(n);
        }
        //System.out.print("palydec\n\n"+ playDeck);

        //for(Cards cd : allPlayCards)
        //	System.out.println("\n\n" + cd);

        con.add(buttonPanel, BorderLayout.CENTER); //gotta look at adding all this to myGui

    } // end of gameArea();

    public void doTurn() {

        //https://stackoverflow.com/questions/21228284/exception-in-thread-awt-eventqueue-0-java-lang-nullpointerexception-error

        //

        if (firstPick == null && secondPick == null) {
            firstPick = selectedCard;

            //if the first pick is empty

        }
        else if (firstPick != null && secondPick == null) {
            secondPick = selectedCard;

        }

    }
    public void checkCards() {

        if(secondPick==null||firstPick==null) //added by JB to ensure that no attempt will be made to check the cards
            return;                            //unless both picks have been made



            //if(firstPick!=null && secondPick!=null)
        else if (firstPick.getId()== secondPick.getId()) {

            System.out.print("checking cards");//match condition
            firstPick.setEnabled(false); //disables the button              Got methods
            // from https://codereview.stackexchange.com/questions/85833/basic-memory-match-game-in-java
            secondPick.setEnabled(false);
            firstPick.setMatched(true); //flags the button as having been matched
            secondPick.setMatched(true);
            System.out.println("\n\nA match!!!"); //Code added by JB for testing purposes

        }
        else{
            System.out.print("checking cards");//match condition

            System.out.println("\n\nNo match!!!"); //Code added by JB for testing purposes
        }

        firstPick = null; //added by JB to ensure the picked cards get reset after the checking is done
        secondPick = null;

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
/*
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 16; i++) {


            if (e.getSource() == buttons.get(i)) {//https://stackoverflow.com/questions/21228284/exception-in-thread-awt-eventqueue-0-java-lang-nullpointerexception-error


                Cards n = new Cards(); //create a new card object
                cardLabels.get(i).setVisible(true);



                //n.getLabel());
                n.setLabel(cardLabels.get(i));
                n.setId(playDeck.indexOf(i));
                n = playDeck.get(i);
                Collections.shuffle(playDeck);

              //  gameDeck.get(2);//set the selected label viiable
                System.out.print("secondcard" +n);
                ;// add the label to the card
                selectedCard = n; //puts the card into the selected card variable
                selectedCard.setId(0);
                doTurn(); // runs the algoram
                checkCards();
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


    //    JOptionPane.showMessageDialog(null, firstPick, "first pick", JOptionPane.ERROR_MESSAGE);
      //  JOptionPane.showMessageDialog(null, secondPick, "second pic", JOptionPane.INFORMATION_MESSAGE);





    }
         */




}


