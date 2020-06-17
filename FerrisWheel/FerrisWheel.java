/* Author:     dmondal5302@gmail.com
Created on: 15-June-2020 */

import java.util.Scanner;

public class FerrisWheel {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String[] first = scn.nextLine().split("\\s+");
        String[] second = scn.nextLine().split("\\s+");

        System.out.println(noOfGondolas(first[1],second));
    }

    private static int noOfGondolas(String n, String[] second) {
        int sum = 0;
        for(String x: second){
            sum += Integer.parseInt(x);
        }
        
        int result = sum%Integer.parseInt(n);
        if(result==0)
            return sum/Integer.parseInt(n);
        return sum/Integer.parseInt(n)+1;
    }
}