package arts;

public class Sculptor extends Artist {
    String name;

    public Sculptor(String name) {
        this.name = name;
    }

    public void createArt() {
        System.out.println(name + " Is scribbling a masterpiece");
    }
}