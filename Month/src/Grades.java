import java.util.Scanner;

/**
 * Dynamically generate arrays and populate them
 */
public class Grades {
    static Scanner scanner = new Scanner(System.in);
    private static int[] grades;

    public static void main(String[] args) {

        System.out.print("How many number of grades would like to enter: ");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("the sum of the grades is: "+sumGrades());
        System.out.println("Average: "+ String.format("%.2f", getAverage()));
        System.out.println("Lowest: "+getLowest());
        System.out.println("Highest: "+getHighest());

    }

    /**
     * Collect the grades as will be supplied by the user
     * @return void
     */
    public static void getGrades(){

        for(int i=0; i<grades.length; i++){
            System.out.print("Enter value for grade #"+ (i+1) +": ");
            grades[i] = scanner.nextInt();
        }
    }

    /**
     * sum the given grades in the array
     * @return total grades
     */
    public static double sumGrades(){
        double sum = 0;
        for(int grade:grades){
            sum += grade;
        }
        return  sum;
    }

    /**
     * get the average of grades array
     * @return the average
     */
    public static double getAverage(){
        return sumGrades()/grades.length;
    }

    /**
     * get the max in the given array
     * @return the highest value in the array
     */
    public static int getHighest(){
        int highest = grades[0];

        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    /**
     * get the lowest value in the array
     * @return the min
     */
    public static int getLowest(){
        int lowest = grades[0];

        for(int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }

        return lowest;
    }






}
