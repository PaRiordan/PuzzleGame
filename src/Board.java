
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Board extends JFrame {
    public  Container  con = getContentPane();
    private static JLabel image;

    public Board() {


        setTitle("Puzzle ");
        setLocation(550, 20); //location on screen
        setSize(1080, 920); // size
        setResizable(false); // stops the ability to resize window
        setLocationRelativeTo(null); // set location to center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the x button to stop the program
        setVisible(true); //Make it visible


        //creating card objects

        //https://stackoverflow.com/questions/24099720/add-images-to-deck-of-cards-java look at.

        Cards ad = new Cards();
       // ad.setRanks();
        //String aceDiamond = "\"H:\\cardImages\\PNG-cards-1.3\\ace_of_diamonds.png\"";
        //ad.setImageUrl(getClass().getResource(aceDiamond));
        //ad.setName("aceDiamonds");

        Cards ac = new Cards();
        ac.setId(2);
        //String aceClubs = "\"H:\\cardImages\\PNG-cards-1.3\\ace_of_clubs.png\"";
        //ac.setImageUrl(getClass().getResource(aceClubs));
        //ac.setName("aceClubs");

        Cards ah = new Cards();
        ah.setId(3);
        //String aceHearts = "\"H:\\cardImages\\PNG-cards-1.3\\ace_of_hearts.png\"";
       // ah.setImageUrl(getClass().getResource(aceHearts));
        //ah.setName("aceHearts");

        Cards as = new Cards();
        as.setId(4);
        //String aceSpades = "\"H:\\cardImages\\PNG-cards-1.3\\ace_of_spades.png\"";
       // as.setImageUrl(getClass().getResource(aceSpades));
        //as.setName("aceSpades");

        Cards kh = new Cards();
        kh.setId(5);
        //String kingHearts = "\"H:\\cardImages\\PNG-cards-1.3\\king_of_hearts.png\"";
        //kh.setImageUrl(getClass().getResource(kingHearts));
        //kh.setName("kingHearts");

        Cards ks = new Cards();
        ks.setId(6);
        //String kingSpades = "\"H:\\cardImages\\PNG-cards-1.3\\king_of_spades.png\"";
        //ks.setImageUrl(getClass().getResource(kingSpades));
        //ks.setName("kingSpades");

        Cards qc = new Cards();
        qc.setId(7);
        //String queenClubs = "\"H:\\cardImages\\PNG-cards-1.3\\queen_of_clubs.png\"";
        //qc.setImageUrl(getClass().getResource(queenClubs));
        //qc.setName("queenClubs");

        Cards qd = new Cards();
        qd.setId(8);
       // String queenDiamonds = "\"H:\\cardImages\\PNG-cards-1.3\\queen_of_diamonds.png\"";
       // ImageIcon queenD = new ImageIcon();
      //  JLabel queenDlabel = new JLabel();
      //  JPanel qdCard = new JPanel();

       //queenDiamonds = new ImageIcon(queenDiamonds + qd);


        //qd.setName("queenDiamonds");
        //String queenDiamonds = "\"H:\\cardImages\\PNG-cards-1.3\\queen_of_diamonds.png\"";
        //qd.setImageUrl(getClass().getResource(queenDiamonds));
        //qd.setImageIcon(createImageIcon("\"H:\\cardImages\\PNG-cards-1.3\\queen_of_diamonds.png\""));
      //  qd.setImageIcon();






      //  JOptionPane.showMessageDialog(null,ad.toString() + qd.toString()); // test to check if the object was created

    } //end of Board


    public void gameArea() {

      //  JOptionPane.showMessageDialog(null,"test");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        JLabel[][] squares = new JLabel[4][4]; // an array of squares
       // int counter = 1;
        for (int i = 0; i < 4; i++) { // create a loop of square buttons
            for (int j = 0; j < 4; j++) {
                JLabel num = new JLabel();

                Border border = BorderFactory.createLineBorder(Color.BLACK, 2);  //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
                num.setBorder(border);
                squares[i][j] = num;
                //JLabel[] imageLabel = new JLabel[1];

              //  counter++;
               buttonPanel.add(num,BorderLayout.CENTER);


                //  num.addActionListener(this);


            }//end of second for
        }//end of first for



        //inputting images into an array manually

        ImageIcon[] images = new ImageIcon[8];
        images[0] = new ImageIcon("AceDiamonds");
        images[0] = createImageIcon("AceDiamonds"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[0][1].setIcon(images[0]);

        images[3] = new ImageIcon("AceDiamonds");
        images[3] = createImageIcon("AceDiamonds"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[0][2].setIcon(images[3]);

        images[1] = new ImageIcon("AceClubs");
        images[1] = createImageIcon1("AceClubs"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[0][3].setIcon(images[1]);

        images[2] = new ImageIcon("AceClubs");
        images[2] = createImageIcon1("AceClubs"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[1][0].setIcon(images[2]);




        List<JLabel> imageArray = new ArrayList<>();

        imageArray.add(squares[0][0]);
        imageArray.add(squares[0][1]);
        imageArray.add(squares[0][2]);
       //Random random = new Random(3);

Collections.shuffle(imageArray);
/*
       for (JLabel image : imageArray){


        }
*/
//System.out.print(random);
        buttonPanel.add(imageArray.get(0),BorderLayout.CENTER);


        //squares[0][0].setIcon(icon);
        //ImageIcon aceClubs = createImageIcon("AceDiamonds");
        //squares[1][2].setIcon(aceClubs);


       //Collections.shuffle(cardsArray); can only be used with a list array


       con.add(buttonPanel,BorderLayout.CENTER); //gotta look at adding all this to myGui

    } // end of gameArea()



    //setting up path ways for images manually
    protected ImageIcon createImageIcon(String path) {
        URL imgUrl = getClass().getResource("AceDiamonds.png");
        if (imgUrl != null) {
            return new ImageIcon(imgUrl);
        } else
            return null;
    } //end of createImageIconDog

    protected ImageIcon createImageIcon1(String path) {
        URL imgUrl = getClass().getResource("AceClubs.png");
        if (imgUrl != null) {
            return new ImageIcon(imgUrl);
        } else
            return null;
    }
}





/*
    public void gameImages() {
        JPanel imagePanel = new JPanel();

        JLabel[][] imageLabel = new JLabel[4][4];
        for (int i = 0; i < 4; i++) { // create a loop of square buttons
            for (int j = 0; j < 4; j++) {
                JLabel image = new JLabel();

                //Border border = BorderFactory.createLineBorder(Color.BLACK, 2);  //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
                //num.setBorder(border);
                //JLabel[] imageLabel = new JLabel[1];

                ImageIcon icon = createImageIcondog("AceDiamonds.png"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
                imageLabel[0][0].setIcon(icon);

                imageLabel[0][0] = image;
                 num.setIcon(icon);

                //num.setText("" + counter);
                //counter++;
                imagePanel.add(image);


                //num.addActionListener(this);

            }//end of second for
        }





*/