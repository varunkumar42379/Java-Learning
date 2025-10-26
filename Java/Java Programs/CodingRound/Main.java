package CodingRound;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        



        System.out.println("Enter a number: ");
        int n=sc.nextInt(); sc.close();
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<values.length;i++)
            while(n>=values[i]){roman.append(symbols[i]); n-=values[i];}
        System.out.println(roman.toString());
    }
}
