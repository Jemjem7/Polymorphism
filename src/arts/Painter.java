package arts;

public class Painter extends Artist {
    String name;

    public Painter(String name) {
        this.name = name;
    }

    public void createArt() {
        System.out.println(name + " is painting a masterpiece");
    }
}