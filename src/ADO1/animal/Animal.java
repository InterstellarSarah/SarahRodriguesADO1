package ADO1.animal;
import java.util.Scanner;

public class Animal {
    //animal escolhido: Suricata

    Scanner input = new Scanner(System.in);

    private static String nomeAnimal = "Suricate";
    private int alturaMedia;
    private String pelagemCor;

    public static void setNomeAnimal(String nomeAnimal) {
        Animal.nomeAnimal = nomeAnimal;
    }

    public int getAlturaMedia() {
        return alturaMedia;
    }

    public void setAlturaMedia(int alturaMedia) {
        this.alturaMedia = alturaMedia;
    }

    public String getPelagemCor() {
        return pelagemCor;
    }

    public void setPelagemCor(String pelagemCor) {
        this.pelagemCor = pelagemCor;
    }

    public Animal() {

    }

    public Animal(String pelagemCor, String nomeAnimal, int alturaMedia) {


    }
}


