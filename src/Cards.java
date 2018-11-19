import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


//https://books.trinket.io/thinkjava/chapter12.html
public  class Cards {

    private int id;
    private String Ranks;
    private String value;
    private String path;



    public Cards(String ranks, String value, int id, String path){
        setRanks(ranks);
        setValue(value);
        setPath(path);
        setId(id);
    }

    public Cards()
    {
        this("no Rank","no Value",0,"no path");
    }

    //Mutator Methods

    void setPath(String path)
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
        this.Ranks = ranks;
    }


    //Accessors method

    int getId(int id)
    {
       return id;
    }

        String getRanks(String ranks)
    {
        return ranks;
    }

     String getValue(String value)
    {
        return value;
    }

  String getPath()
    {
        return path;
    }


   public String toString() {return "\nid: "+ getId(id)+ "\n rank"+getRanks(Ranks) +"\nvalue" + getValue(value)+"\n getpath" + getPath();}


   public static JTextArea cardArea(ArrayList<Cards> deck){
        JTextArea canvas = new JTextArea("deck");
        for (int i=0; i < deck.size();i++){
            canvas.append(deck.get(i).toString());
        }



        return canvas;
   }





   public static ArrayList<Cards> getCards() {


       ArrayList<Cards> deck = new ArrayList<>();
       Cards  ahCard = new Cards();
       ahCard.setId(0);
       ahCard.setRanks("heart");
       ahCard.setValue("Ace");
       ahCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\AceHearts.png");
       deck.add(ahCard);

       Cards  asCard = new Cards();
       asCard.setId(1);
       asCard.setRanks("Spades");
       asCard.setValue("Ace");
       asCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\AceSpades.png");
       deck.add(asCard);

       Cards  khCard = new Cards();
       khCard.setId(2);
       khCard.setRanks("Hearts");
       khCard.setValue("King");
       khCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\KingHearts.png");
       deck.add(khCard);

       Cards  ksCard = new Cards();
       ksCard.setId(3);
       ksCard.setRanks("Spades");
       ksCard.setValue("King");
       ksCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\KingSpades.png");
       deck.add(ksCard);


       Cards  qhCard = new Cards();
       qhCard.setId(4);
       qhCard.setRanks("Hearts");
       qhCard.setValue("Queen");
       qhCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\QueenHearts.png");
       deck.add(qhCard);


       Cards  qsCard = new Cards();
       qsCard.setId(5);
       qsCard.setRanks("Spades");
       qsCard.setValue("Queen");
       qsCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\QueenSpades.png");
       deck.add(qsCard);

       Cards  jhCard = new Cards();
       jhCard.setId(6);
       jhCard.setRanks("Hearts");
       jhCard.setValue("Jack");
       jhCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\JackHearts.png");
       deck.add(jhCard);

       Cards  jsCard = new Cards();
       jsCard.setId(7);
       jsCard.setRanks("Spades");
       jsCard.setValue("Jack");
       jsCard.setPath("C:\\Users\\Patrick Riordan\\IdeaProjects\\memory\\out\\Images\\JackSpades.png");
       deck.add(jsCard);


 //System.out.print("test\n"+deck +"\n\nend");
       return deck;

           }

            public static Cards getCard(ArrayList<Cards> cards){



        Cards card;
        card = null;


                card.getCards().get(0);
                card.getCards().get(1);
                card.getCards().get(2);
                card.getCards().get(3);
                card.getCards().get(4);
                card.getCards().get(5);
                card.getCards().get(6);
                card.getCards().get(7);

            cards.remove(card);

//System.out.print("card"+card);
                return card;



            }

    public void addActionListener(ActionListener actionListener) {
    }



    // credit to mahoney for sending me on the right path

    // w
       }
















