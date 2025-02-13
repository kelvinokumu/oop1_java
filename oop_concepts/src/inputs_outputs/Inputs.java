package inputs_outputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a value: ");
        int num = keyboard.nextInt();
        System.out.println(num);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void getValues() {
        String emails = keyboard.nextLine();
    }
}
