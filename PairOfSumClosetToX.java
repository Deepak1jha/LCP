import java.io.*;
import java.util.*;
import java.lang.Math;
public class PairOfSumClosetToX{

    public static void main(String [] args){
        int arr[] = new int[]{10, 22, 28, 29, 30, 40};
        int x = 54;
        int diff = Integer.MAX_VALUE;
        int start = 0,end = arr.length-1;
        int start_index = 0;
        int end_index = 0;
        while(start<end){
            if(Math.abs(arr[start]+arr[end]-x) < diff){
                start_index = start;
                end_index = end;
                diff = Math.abs(arr[start]+arr[end]-x);
            }
            if(arr[end]+arr[start]>x){
                start--;
            }else{
                end--;
            }
        }
        System.out.println(" The closest pair is "+arr[start_index]+" and "+ arr[end_index]);
    }
}
