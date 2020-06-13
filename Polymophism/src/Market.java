public class Market {

    public static void main(String[] args) {
        Fruit apple = new Apple();

        apple.makeJuice();
        System.out.println("Apple juice has "+ apple.getCalories() + " calories");

        Fruit banana = new Banana();
        banana.makeJuice();

        banana.getCalories();
    }
}
