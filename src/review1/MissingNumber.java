package review1;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){

        int a[] = {1,3,6,7,4,5,9,8};
        int l = a.length+1;
        int add = (l*(l+1))/2;

        for(int i=1;i<a.length;i++){
            add = add - a[i];
        }
        System.out.print(" Missing Number is:" +add);
    }
}
