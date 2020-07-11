import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        if(k > (n*m) ){
            System.out.println("NO");
        }else if(k % n == 0 || k % m == 0)
        {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}