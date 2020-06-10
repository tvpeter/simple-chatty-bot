public class Rectangle {

   private double length;
   private double width;

   public Rectangle(){
       length = 0;
       width = 0;
   }

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

   public void setLength(double length){
       this.length = length;
   }

   public void setWidth(double width){
       this.width = width;
   }

   public double getLength(){
       return length;
   }

   public double getWidth(){
       return width;
   }

   public double area(){
       return length * width;
   }

   public double perimeter(){
       return (2*length) + (2* width);
   }


}
