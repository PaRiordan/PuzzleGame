import javax.swing.*;

public class Player {

    private String name;
    private String score;


    //no argument constructor for person

    Player() {this("Unknown","0"); }

    //multi-argument constructor for person

    Player(String name,String score){setName(name); setScore(score);}

    //Accessor method for name

    public void setName(String name){this.name = name;}
    public void setScore(String score){ this.score = score;}

    //mutator method for the name

    String getName(){return name;}
    String getScore(){return score;}

    public String toString() {return "name: "+ getName()+ "\nScore" +getScore();}

}



