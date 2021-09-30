public class Main {

    public static void main(String[] args) {
	// write your code here
    Terningspil terningspil = new Terningspil();

    try {
    terningspil.terningProdukt();
    } catch (Exception e) {
        System.out.println("Skriv venligst et andet produkt.");
    }
    }
}
