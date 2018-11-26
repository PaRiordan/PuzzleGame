import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Patrick Riordan
 */

//https://books.trinket.io/thinkjava/chapter12.html
public  class Cards extends JButton {
/**
 * Global variables
 */
    private int id;
    private String ranks;
    public String value;
    private String path;
    public JLabel label;
    private boolean matched;


    public Cards(String ranks, String value, int id, String path,JLabel label){
        setRanks(ranks);
        setValue(value);
        setPath(path);
        setId(id);
        setLabel(label);
    }

    public Cards()
    {
        this("no Rank","no Value",0,"no path",null);
    }

    /**
     * Mutator Methods
     */


   private void setPath(String path)
    {
        this.path = path;
    }

    private void setValue(String value)
    {
        this.value = value;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    public void setRanks(String ranks){
        this.ranks = ranks;
    }

    //JB modified this method to fix a crucial logical error it contained
    public void setLabel(JLabel cardlabel)
    {
        this.label = cardlabel;
    }



    //

    //JB modified code here to fix accessors

     /* int getId(int id)
    {
       return id;
    }

        String getRanks(String ranks) { return ranks;}

        String getValue(String value)
    {
        return value;
    }

        String getPath()
    {
        return path;
    }

        public JLabel getLabel(JLabel label) {
        return label;
    }*/

    //JB modified existing code here to fix accessors

    /**
     *   Accessors methods
     * @return
     */


    public int getId()
    {
        return id;
    }

    public String getRanks()
    {
        return ranks;
    }

    public String getValue()
    {
        return value;
    }

    public String getPath()
    {
        return path;
    }

    public JLabel getCardLabel()
    {
        return label;
    }

    //JB modified existing toString() to fix associated accessor issue

    public String toString()
    {
        return "\nid: "+ getId()+ "\nrank: "+ getRanks() +"\nvalue: " + getValue() + "\npath: " + getPath() + "\nlabel: " + getCardLabel();
    }
    //public String toString() {return "\nid: "+ getId(id)+ "\n rank"+getRanks(Ranks) +"\nvalue" + getValue(value)+"\n getpath" + getPath();}






    public static ArrayList<Cards> getCards() {


        ArrayList<Cards> deck = new ArrayList<>();
        Cards  ahCard = new Cards();
        ahCard.setId(0);
        ahCard.setRanks("heart");
        ahCard.setValue("Ace");
        ahCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\AceHearts.png");
        deck.add(ahCard);


        Cards  asCard = new Cards();
        asCard.setId(1);
        asCard.setRanks("Spades");
        asCard.setValue("Ace");
        asCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\AceSpades.png");
        deck.add(asCard);

        Cards  khCard = new Cards();
        khCard.setId(2);
        khCard.setRanks("Hearts");
        khCard.setValue("King");
        khCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\KingHearts.png");
        deck.add(khCard);

        Cards  ksCard = new Cards();
        ksCard.setId(3);
        ksCard.setRanks("Spades");
        ksCard.setValue("King");
        ksCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\KingSpades.png");
        deck.add(ksCard);


        Cards  qhCard = new Cards();
        qhCard.setId(4);
        qhCard.setRanks("Hearts");
        qhCard.setValue("Queen");
        qhCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\QueenHearts.png");
        deck.add(qhCard);


        Cards  qsCard = new Cards();
        qsCard.setId(5);
        qsCard.setRanks("Spades");
        qsCard.setValue("Queen");
        qsCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\QueenSpades.png");
        deck.add(qsCard);

        Cards  jhCard = new Cards();
        jhCard.setId(6);
        jhCard.setRanks("Hearts");
        jhCard.setValue("Jack");
        jhCard.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\QueenSpades.png");
        deck.add(jhCard);

        Cards  jsCard = new Cards();
        jsCard.setId(7);
        jsCard.setRanks("Spades");
        jsCard.setValue("Jack");
        jsCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\JackSpades.png");
        deck.add(jsCard);

        Cards  ah2Card = new Cards();
        ah2Card.setId(0);
        ah2Card.setRanks("heart");
        ah2Card.setValue("Ace");
        ah2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\JackSpades.png");
        deck.add(ah2Card);

        Cards  as2Card = new Cards();
        as2Card.setId(1);
        as2Card.setRanks("Spades");
        as2Card.setValue("Ace");
        as2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\AceSpades.png");
        deck.add(as2Card);

        Cards  kh2Card = new Cards();
        kh2Card.setId(2);
        kh2Card.setRanks("Hearts");
        kh2Card.setValue("King");
        kh2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\KingHearts.png");
        deck.add(khCard);

        Cards  ks2Card = new Cards();
        ks2Card.setId(3);
        ks2Card.setRanks("Spades");
        ks2Card.setValue("King");
        ks2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\KingSpades.png");
        deck.add(ks2Card);


        Cards  qh2Card = new Cards();
        qh2Card.setId(4);
        qh2Card.setRanks("Hearts");
        qh2Card.setValue("Queen");
        qh2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\QueenHearts.png");
        deck.add(qh2Card);

        Cards  qs2Card = new Cards();
        qs2Card.setId(5);
        qs2Card.setRanks("Spades");
        qs2Card.setValue("Queen");
        qs2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\QueenSpades.png");
        deck.add(qs2Card);

        Cards  jh2Card = new Cards();
        jh2Card.setId(6);
        jh2Card.setRanks("Hearts");
        jh2Card.setValue("Jack");
        jh2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\JackHearts.png");
        deck.add(jh2Card);

        Cards  js2Card = new Cards();
        js2Card.setId(7);
        js2Card.setRanks("Spades");
        js2Card.setValue("Jack");
        js2Card.setPath("H:\\Semester 3\\OO_Programming\\PuzzleG\\out\\Images\\JackSpades.png");
        deck.add(js2Card);



        //System.out.print("test\n"+deck +"\n\nend");
        return deck;

    }

    public static Cards getCard(Cards deck){
        Cards card;
        card = null;
        for (int i = 0; i< 8;i++){
            card = getCards().get(i);
        }


        return card;
    }


    public void setMatched(boolean matched) {
        this.matched = matched;
    }
    public boolean getMatched(){
        return this.matched;
    }
}
















