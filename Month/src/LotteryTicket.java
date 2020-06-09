import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int ARRAY_SIZE = 6;
    private static final int ARRAY_BOUND = 69;
    public static void main(String[] args) {

        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printArray(tickets);
    }

    //generate array of randoms numbers of size 6
    public static int[] generateNumbers(){

        int[] ticket = new int[ARRAY_SIZE];
        Random random = new Random();
        for(int i=0; i<ARRAY_SIZE; i++){
            int randomNumber;
            //generate the random number and search atleast once until it is not found
            do {
                randomNumber = random.nextInt(ARRAY_BOUND)+1;
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static void printArray(int[] ticket){

        for(int i=0; i<ticket.length; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * method to search for given number in the array sequentially
     * @param array Array to search
     * @param numberToSearch number to search for
     * @return true if found else false
     */
    public static boolean search(int[] array, int numberToSearch){

        //using the enhanced for loop
        for(int value : array){
            if(value == numberToSearch)
                return true;
        }
        return false;
    }

    /**
     * perform binary search on the given array
     * @param array array to search
     * @param numberToSearch value to search for
     * @return the given number to search
     */
    public static boolean binarySearch(int[] array, int numberToSearch){

        //sort the given array first
        Arrays.sort(array);

        //perform a binary search
        int result = Arrays.binarySearch(array, numberToSearch);

        return (result >= 0 ) ? true : false;
    }
}
