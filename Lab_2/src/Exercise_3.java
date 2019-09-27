import java.util.Scanner;
public class Exercise_3 {
    public static void main(String args[]){
        /**
         * Here is a sample run:
         * Enter an integer, the input ends if it is 0: 1 2 -1 3 0
         * The number of positives is 3
         * The number of negatives is 1
         * The total is 5.0
         * The average is 1.25 End of Questions
         */
        /***
         * @ author: Abubakar Abubakar Yusif
         * Matric: 1821881
         * Lab2 section 4
         */
        Scanner Input = new Scanner(System.in);
        int i=0,negative=0,positive=0,total=0;
        double average;
        System.out.println("Enter an integer, the input ends if its 0: ");
        int[] arr = new int[5];
        while(i < arr.length){
            System.out.println("if statemsd");
            arr[i] = Input.nextInt();
            total += arr[i];
            if (arr[i] == 0) {
                System.out.println("if statements");
                break;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
            i++;
        }
        System.out.println("negatives: "+ negative);
        System.out.println("positives: "+ positive);
        System.out.println("total: "+ total);
        average = total / i;
        System.out.println("average: "+ average);
    }
}