public class BoxingGame {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mohammed Ali", 107, 242, 35, 23);
        Fighter f2 = new Fighter("Joe Frazier", 104, 236, 32, 25);

        Ring match = new Ring(f1, f2, 100, 110);
        match.run();
    }
}
