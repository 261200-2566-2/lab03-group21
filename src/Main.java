
public class Main {
    public static void main(String[] args) {
            Hero h1 = new Hero("woon");
            Hero h2 = new Hero("poon");


            h1.showcase();
            h1.equipSword(5);
            h1.showcase();
            h1.equipShield(2);
            h1.showcase();

            h1.levelUp();
            h1.levelUp();
            h1.showcase();

            h2.showcase();
            h2.equipSword(8);
            h2.showcase();
            h2.levelUp();
            h2.showcase();
            h2.levelUp();
            h2.levelUp();
            h2.showcase();
        }
}