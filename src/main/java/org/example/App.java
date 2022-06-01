package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = primeFactors(18);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static List<Integer> primeFactors(int num){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=2; i<num; i++){
            while(num%i==0){
                list.add(i);
                num = num/i;
            }
        }

        if(num>2){
            list.add(num);
        }

        return list;
    }
}
