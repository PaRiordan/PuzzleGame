import javax.swing.*;
import java.awt.*;
import java.net.URL;


//https://books.trinket.io/thinkjava/chapter12.html
public  class Cards {

    private int id;
   /* public static String[] Ranks = {null,"Ace", "king","Queen","Jack"};

    public static  String[]Suits = {"Clubs","Diamonds","Hearts","Spades"};
*/
    public void setId(int id){
      this.id = id;
    }

    private int getId(int id){
       return this.id;
    }
/*
    public void setRanks(String[] ranks){
        this.Ranks = ranks;
    }

    private String[] getRanks(String[] ranks){
        return this.Ranks;
    }




    //public void  setName(String name){this.name = name;}

    //private String getName(String name){return this.name;}

    //public void setImageIcon(ImageIcon imgIcon){this.imgIcon = imgIcon;}
    //public ImageIcon getImageIcon(ImageIcon imgIcon){return this.imgIcon;}

    //public void setImageUrl(URL imgUrl){
     //   this.img = imgUrl;
    //}

    //private URL getImagesUrl(URL imgUrl) {
      //  return this.imgUrl;
    //}

   // public String toString() {return "id: "+ getId(id)+ "name:"+getName(name)+ "IconImage"+ getImageIcon(imgIcon);}

/*
    //LOOK AT LATER
    public void setUrl(UR imgUrl) {
      //  URL imgUrl = getClass().getResource("AceClubs.png");
        //imgUrl = AceClubs;
         this.imgUrl =imgUrl;

    }

    private URL getUrl(URL imgUrl ){
        return this.imgUrl;

    }

*/

}
