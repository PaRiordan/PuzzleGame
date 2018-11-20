import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;


public class myGui extends JFrame implements ActionListener {


    private JMenu playerMenu;
    private JMenu scoreMenu;
    private JMenu exitMenu;
    private JMenu fileMenu;
   public Container container = getContentPane();
   public JPanel imagePanel;



    public myGui() {




        //Creating JFrame

        //Creating JFrame

        setTitle("Puzzle ");
        setLocation(550, 20); //location on screen
        setSize(1080, 920); // size
        setResizable(false); // stops the ability to resize window
        setLocationRelativeTo(null); // set location to center of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the x button to stop the program
        setVisible(true); //Make it visible


        container.setLayout(new BorderLayout());


        //layout are for title panel

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Memory Muscle");

        // editing Panel
        titlePanel.setBackground(Color.cyan);
        titlePanel.setPreferredSize(new Dimension(200, 100));


        createPlayerMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setVisible(true);
        menuBar.add(playerMenu);

        createScoreMenu();
        menuBar.add(scoreMenu);

        createExitMenu();
        menuBar.add(exitMenu);

        createFileMenu();
        menuBar.add(fileMenu);

        //editing label
        //titleLabel.setBackground(Color.BLACK);

        //editing label
        //titleLabel.setBackground(Color.BLACK);

        titleLabel.setPreferredSize(new Dimension(100, 100));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(titleLabel);
        container.add(titlePanel, BorderLayout.PAGE_START);


        //layout for menu area

        JPanel menuPanel = new JPanel();
        JLabel startLabel = new JLabel(); //start button
        JLabel menuLabel = new JLabel("Welcome");
        JLabel exitLabel = new JLabel(); //exit button

        menuLabel.setPreferredSize(new Dimension(300, 150));
        menuLabel.setText("Are you ready \n to Play Memory Muscle");
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menuLabel.setBackground(Color.GREEN);
        menuPanel.add(menuLabel);

        // menuLabel game text
        menuLabel.setPreferredSize(new Dimension(300, 150));
        //  menuLabel.setText("welcome to the jungle");
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menuLabel.setBackground(Color.GREEN);//
        // menuPanel.add(menuLabel);


        //set startLabel start button
        startLabel.setPreferredSize(new Dimension(200, 100));
        startLabel.setBackground(Color.BLUE);
        startLabel.setLayout(new GridLayout());

        //set startLabel start button
        startLabel.setPreferredSize(new Dimension(200, 100));
        startLabel.setBackground(Color.BLUE);
        startLabel.setLayout(new GridLayout());


        JButton startButton = new JButton("START");
        startButton.setLayout(new FlowLayout());
        startButton.setAlignmentX(0.5f);
        startButton.setBackground(Color.white);
        setPreferredSize(new Dimension(100, 120));
        startButton.addActionListener(this);
        startLabel.add(startButton);
        menuPanel.add(startLabel);

        //set exitLabel exit button

        exitLabel.setPreferredSize(new Dimension(200, 100));
        exitLabel.setBackground(Color.BLUE);
        exitLabel.setLayout(new GridLayout());

        JButton exitButton = new JButton("Exit");
        exitButton.setAlignmentX(0.5f);
        exitButton.setBackground(Color.white);
        exitButton.addActionListener(this);

        exitLabel.add(exitButton);

        menuPanel.add(exitLabel);
        menuPanel.setPreferredSize(new Dimension(300, 100));
        menuPanel.setBackground(Color.cyan);
        container.add(menuPanel, BorderLayout.LINE_START);

        // layout area for Game area.
        JLabel wallPic = new JLabel();
        ImageIcon icon = createImageIcon("playingCards.jpg");
        wallPic.setIcon(icon);

        container.add(wallPic, BorderLayout.CENTER);

        container.repaint();


    } // end of  myGui method


    @Override
    public void   actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("You Sure?") || e.getActionCommand().equals("Exit")) {

          System.exit(0);

        } else if
            (e.getActionCommand().equals("Select") || e.getActionCommand().equals("START"))  {
            selectButton();


            Board b = new Board();
            b.gameArea();

          //  repaint();
          //  revalidate();            //  Got this working, it reset the area with the new method(gameArea) look into later..   https://stackoverflow.com/questions/36017159/jbutton-setvisiblefalse-setting-back-to-setvisibletrue-not-working


        }
                else if (e.getActionCommand().equals("Display")) {

                    System.exit(0);  // call a file here with scores
           // gameImages();
            //gameArea();
            revalidate();

            JOptionPane.showMessageDialog(null, "test line");
        }
        else
            JOptionPane.showMessageDialog(null, "Please select a player before starting");
    }

    //comment here
    private void createPlayerMenu() {
        // adding the drop-down items for player menu and assigning each an action listener
        playerMenu = new JMenu("Player");
        playerMenu.setMenuLocation(10, 26);

        JMenuItem item;
        item = new JMenuItem("Select");
        item.addActionListener(this);
        playerMenu.add(item);

    }

    //comment here
    private void createScoreMenu() {
        scoreMenu = new JMenu("Score");
        scoreMenu.setMenuLocation(10, 26);

        JMenuItem scoreItem;
        scoreItem = new JMenuItem("Display");
        scoreMenu.add(scoreItem);

    }

    private void createFileMenu() {
        fileMenu = new JMenu("File");
         fileMenu.setMenuLocation(10, 26);

        JMenuItem saveFile;
        saveFile = new JMenuItem("Save");
        scoreMenu.add(saveFile);

        JMenuItem retrieveFile;
        retrieveFile = new JMenuItem("retrieve");
        retrieveFile.add(saveFile);


    }

    //comment here
    private void createExitMenu() {
        exitMenu = new JMenu("exit");
        exitMenu.setMenuLocation(10, 26);

        JMenuItem exitItem;
        exitItem = new JMenuItem("You Sure?");
        exitItem.addActionListener(this);
        exitMenu.add(exitItem);
    }

    protected ImageIcon createImageIcon(String path) {
        URL imgUrl = getClass().getResource("playingCards.jpg");
        if (imgUrl != null){
            return new ImageIcon(imgUrl);
        }else
            return null;
    }



      private void selectButton() {
          // final  JLabel image1 = new JLabel();

          String name = JOptionPane.showInputDialog(null, "Yo what will I call you?");
          if (name == "") {
              JOptionPane.showInputDialog(null, "You gotta have a Name?");
          } else {
              Player player = new Player();
              player.setName(name);

              JOptionPane.showMessageDialog(null, "Alright " + player.getName() + " Lets play Memory muscle");
          }
      }

} // end of myGui class




// private void addPlayer(){
//   String name = JOptionPane.showInputDialog("Hey so what will we call you?");
//}

// look at later
/*
 private static void button(String text,Panel menuPanel){
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(button);
    }
 */