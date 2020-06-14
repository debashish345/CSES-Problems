import java.util.Scanner;

/* Author:     dmondal5302@gmail.com
Created on: 14-June-2020 */

public class Apartments {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String[] first = scn.nextLine().split("\\s+");
        int n = Integer.parseInt(first[0]), 
            m = Integer.parseInt(first[1]), 
            k = Integer.parseInt(first[2]);

        String[] second = scn.nextLine().split("\\s+");
        int[] a = new int[n];
        int i=0;
        for(String x: second){
            a[i++] = Integer.parseInt(x);
        }

        String[] third = scn.nextLine().split("\\s+");
        int[] b = new int[m];
        i=0;
        for(String x: third){
            b[i++] = Integer.parseInt(x);
        }

        System.out.println(+ numberOfApplicants(k,a,b));
    }

    private static int numberOfApplicants(int k, int[] a, int[] b) {

        int reg_applicant = 0;
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if((b[i]<a[j]+k) && (b[i]>=a[j]-5)){
                    reg_applicant++;
                    b[i] = -1;
                }
            }
        }
        return reg_applicant;
    }
}