public class Apple extends Fruit {

    public Apple(){
        setCalories(8);
    }

    protected void removeSeeds(){
        System.out.println("Removing apple seeds");
    }

    @Override
    public void makeJuice(){
        System.out.println("Making apple juice");
    }
}
