package aprilTwentySixth;

public class Cat implements Animal {
    @Override
    public void dajGlos() {
        System.out.println("Miau miau!");
    }

    @Override
    public void poruszajSie() {
        System.out.println("Biega");
    }
}
