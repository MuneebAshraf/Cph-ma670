import java.util.Scanner;

public class Terningspil {

    public Terningspil() {

    }

    public void terningProdukt() throws IllegalArgumentException {
        System.out.println("Hvilket produkt vil du have?");
        Scanner scanner = new Scanner(System.in);
        int sumAfOjne = scanner.nextInt();

        if (sumAfOjne <37 && sumAfOjne > 0) {

            Terning ter1 = new Terning();
            Terning ter2 = new Terning();

            while (ter1.getOjne() * ter2.getOjne() != sumAfOjne) {
                System.out.println(ter1.kast() + " og " + ter2.kast() + " gav ikke " + sumAfOjne);
            }

            System.out.println(ter1.getOjne() + " og " + ter2.getOjne() + " gav " + sumAfOjne);
        } else {
            throw new IllegalArgumentException("Du tastede et produkt som ikke kan opnås med 2 terninger");
        }
    }

}
