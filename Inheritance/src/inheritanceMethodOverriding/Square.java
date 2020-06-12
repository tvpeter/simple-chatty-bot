package inheritanceMethodOverriding;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public void print(String name){
        System.out.println("I am coming from "+ name);
    }
}
