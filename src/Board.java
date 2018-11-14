
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board extends JFrame {
    public  Container  con = getContentPane();

    public Board() {


        setTitle("Puzzle ");
        setLocation(550, 20); //location on screen
        setSize(1080, 920); // size
        setResizable(false); // stops the ability to resize window
        setLocationRelativeTo(null); // set location to center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the x button to stop the program
        setVisible(true); //Make it visible


        //creating the ace of diamonds object

        Cards ad = new Cards();
        ad.setId(1);
        String aceDiamond = "\"H:\\Playing Cards\\PNG-cards-1.3\\ace_of_diamonds.png\"";
        ad.setIconImage(getClass().getResource(aceDiamond));



        JOptionPane.showMessageDialog(null,ad); // test to check if the object was created

    } //end of Board


    public void gameArea() {

      //  JOptionPane.showMessageDialog(null,"test");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        JLabel[][] squares = new JLabel[4][4]; // an array of squares
        int counter = 1;
        for (int i = 0; i < 4; i++) { // create a loop of square buttons
            for (int j = 0; j < 4; j++) {
                JLabel num = new JLabel();

                Border border = BorderFactory.createLineBorder(Color.BLACK, 2);  //https://examples.javacodegeeks.com/desktop-java/swing/jlabel/create-jlabel-with-border/
                num.setBorder(border);
                squares[i][j] = num;
                //JLabel[] imageLabel = new JLabel[1];

                counter++;
                buttonPanel.add(num,BorderLayout.CENTER);


                //  num.addActionListener(this);


            }//end of second for
        }//end of first for

        //inputting images into an array manually

        ImageIcon[] images = new ImageIcon[16];
        images[0] = new ImageIcon("AceDiamonds");
        images[0] = createImageIcon("AceDiamonds"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[0][0].setIcon(images[0]);

        images[1] = new ImageIcon("AceClubs");
        images[1] = createImageIcon1("AceClubs"); //https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        squares[0][1].setIcon(images[1]);


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