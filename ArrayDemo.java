//Getting started with array seaching sorting and diplaying content of array
//Step 1: Create a class named ArrayDemo and add the main method to it.
//Step 2: Declare an array of integers and initialize it with some values.
// 
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int arr[] = {5,2,7,1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}