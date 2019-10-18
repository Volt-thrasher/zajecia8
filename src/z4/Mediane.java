package z4;

import java.util.Random;

public class Mediane {
    public static void main(String[] args) {
        Random random = new Random();
        int table[]= new int[10];
        double sum = 0;
        for (int i = 0; i<table.length; i++){
            table[i]=random.nextInt(100);
            sum+=table[i];
        }
        System.out.println(sum);
        double mid = sum/table.length;
        double sum1 =0;
        double sum2=0;
        int j =0;
        while (j<table.length){
            if (table[j]>mid){
                sum1+=table[j];
                j++;
            }else {
                sum2 += table[j];
                j++;
                }
            }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
