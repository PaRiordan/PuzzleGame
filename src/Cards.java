import javax.swing.*;
import java.awt.*;
import java.net.URL;

public  class Cards {

    private int id;
    private URL img;
    private URL imgUrl;

    public void setId(int id){
        this.id = id;
    }

    public int getId(int id){
        return this.id;
    }

    public void setIconImage(URL img){
        this.img = img;
    }

    private URL getIconImages(URL img) {
        return this.img;
    }

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
