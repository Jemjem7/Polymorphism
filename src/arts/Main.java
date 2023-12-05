package arts;



public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist();
        Painter painter = new Painter("Ram");
            
        
        Sculptor sculptor = new Sculptor("Arjie");

        artist.createArt();
        painter.createArt();
        sculptor.createArt();
    }
}
