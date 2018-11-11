import javax.swing.*;

public class Player {

    private String name;





    //Accessor method for name

  public  static String getName(){
        String name = JOptionPane.showInputDialog("what your name?");
        return name;}
    //mutator method for the name

        public void setName(String name){

            this.name =name;
        }

    // toString method for Player

        @Override
        public String toString() {
            return "Name " + getName();
        }
    }



