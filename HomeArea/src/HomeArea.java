public class HomeArea {

    public static void main(String[] args) {
        /***************************
         * Instantiating using the default constructor
         */
        Rectangle bedroom = new Rectangle();
        bedroom.setLength(45);
        bedroom.setWidth(40);

        double bedroomArea = bedroom.area();
        double bedroomPerimeter = bedroom.perimeter();


        /***********************************
         * Instantiating with another constructor
         */
        Rectangle parlor = new Rectangle(60, 50);
        double parlorLength = parlor.getLength();
        double parlorWidth = parlor.getWidth();

        double parlorArea = parlor.area();
        double parlorPerimeter = parlor.perimeter();

        System.out.println("The parlor with lenght "+ parlorLength + " and width of "+ parlorWidth + " has an " +
                "area of "+parlorArea + " and a perimeter of "+parlorPerimeter);

        System.out.println("The bedroom has an area of "+ bedroomArea + " with a perimeter of " + bedroomPerimeter);

    }
}
