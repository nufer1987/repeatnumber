package odev2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class odev2c {
    public static void main(String[] args) {


            int []arr={1,2,3,1,2,7,7,7,7,8,8,9,9,9,9,3,4,5,4,6,6,9,8};
            for (int i=0;i<=arr.length-1;i++){
                int a=0;
                for (int j=i+1;j<=arr.length-1;j++){
                    if(arr[i]==arr[j]){
                        a++;

                    }
                }if(a==0){
                    System.out.print(arr[i]);
                }
            }
        }


    }
