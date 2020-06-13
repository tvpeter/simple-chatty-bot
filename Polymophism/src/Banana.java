public class Banana  extends  Fruit {

    public Banana(){
        setCalories(12);
    }

    protected void peelBanana(){
        System.out.println("Peeling the bananas");
    }

    public void makeJuice(){
        System.out.println("Make banana juice");
    }
}
