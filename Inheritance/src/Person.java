public class Person {

    private int age;
    private String name;
    private String gender;

    public Person(){
        System.out.println("Default constructor");
    }

    public Person(String name){
        System.out.println("A special constructors in the super class");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
