
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class myGui extends JFrame implements ActionListener {

    public myGui(){


            //Creating JFrame
        setTitle("Puzzle ");
        setLocation(550,20); //location on screen
        setSize(1080 ,920); // size
        setResizable(false); // stops the ability to resize window
        setLocationRelativeTo(null); // set location to center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the x button to stop the program
        setVisible(true); //Make it visible

        Container container = getContentPane();
        container.setLayout(new BorderLayout());


        //layout are for title panel

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Puzzle game");

        // editing Panel
        titlePanel.setBackground(Color.cyan);
        titlePanel.setPreferredSize(new Dimension(200,100));


        //editing label
       //titleLabel.setBackground(Color.BLACK);
        titleLabel.setPreferredSize(new Dimension(100,100));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(titleLabel);
        container.add(titlePanel,BorderLayout.PAGE_START);





        //layout for menu area

        JPanel menuPanel = new JPanel();
        JLabel startLabel = new JLabel(); //start button
        JLabel menuLabel = new JLabel("Welcome");
        JLabel exitLabel = new JLabel(); //exit button

        // menuLabel game text
        menuLabel.setPreferredSize(new Dimension(300,150));
        menuLabel.setText("welcome to the jungle");
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menuLabel.setBackground(Color.GREEN);//
        menuPanel.add(menuLabel);




        //set startLabel start button
        startLabel.setPreferredSize(new Dimension(200,100));
        startLabel.setBackground(Color.BLUE);
        startLabel.setLayout(new GridLayout());


        JButton startButton = new JButton("START");
        startButton.setLayout( new FlowLayout());
        startButton.setAlignmentX(0.5f);
        startButton.setBackground(Color.BLACK);
        setPreferredSize(new Dimension(100,120));
        startLabel.add(startButton);
        menuPanel.add(startLabel);

        //set exitLabel exit button

        exitLabel.setPreferredSize(new Dimension(200,100));
        exitLabel.setBackground(Color.BLUE);
        exitLabel.setLayout(new GridLayout());

        JButton exitButton = new JButton("Exit");
        exitButton.setAlignmentX(0.5f);
        exitButton.setBackground(Color.BLUE);
        exitButton.addActionListener(this);

        exitLabel.add(exitButton);

        menuPanel.add(exitLabel);







        menuPanel.setPreferredSize(new Dimension(300,100));
        menuPanel.setBackground(Color.cyan);


        container.add(menuPanel,BorderLayout.LINE_START);















        // layout area for Game area.

        JPanel buttonPanal = new JPanel();
        buttonPanal.setLayout(new GridLayout(4,4));


        JButton[][] squares = new JButton[4][4]; // an array of squares
        for (int i =0; i<4; i++){ // create a loop of square buttons
            for (int j =0;j<4;j++){
                JButton num = new JButton();
                squares [i] [j] = num;
                num.addActionListener(this);
                buttonPanal.add(num);
            }//end of second for
        }//end of first for

        container.add(buttonPanal,BorderLayout.CENTER);


    } // end of  myGui method


    @Override
    public void actionPerformed(ActionEvent e) {
       System.exit(0);

    }
} // end of myGui class




// look at later
/*
 private static void button(String text,Panel menuPanel){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(button);
    }
 */