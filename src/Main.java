import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner (System.in);

        //Program asks for amount of numbers in array:
        System.out.println("Hello! How many numbers would you like to store in this array? ");
        int count = scanner1.nextInt();

        //Program asks for numbers, by calling a method "readIntegers" and passing amount of numbers entered by user:
        System.out.println("Please enter " + count + " numbers:");
        int[] array = readIntegers(count);

        //Program finds minimum value in array:
        System.out.println("Minimum value in this array is: " + findMin(array));
        
    }


    //METHOD READS NUMBERS FROM CONSOLE AND RETURNS ARRAY
    public static int[] readIntegers (int count){
        Scanner scanner2 = new Scanner (System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = scanner2.nextInt();
        }
        return array;
    }


    //METHOD FINDS AND PRINTS MINIMUM NUMBER IN ARRAY
    public static int findMin(int[] array){
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++){
            if (minNumber > array [i])
                minNumber = array [i];
        }
        return minNumber;
    }
}
