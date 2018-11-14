import javax.swing.*;
import java.awt.*;
import java.net.URL;

public  class Cards {

    private int id;
    private URL img;
    private URL imgUrl;
    private String name;
    private ImageIcon imgIcon;

    public void setId(int id){
        this.id = id;
    }

    private int getId(int id){
        return this.id;
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
