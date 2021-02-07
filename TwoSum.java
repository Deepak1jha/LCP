public class TwoSum {

    public static boolean add(){

        int [] array = new int []{1,2,3,4,5,6,8,9};
        int n = 14;
        int sum =0;
        int start = 0;
        int end = array.length-1;
        while(start<end){
            if(array[start]+array[end]==n){
                System.out.println("Matched");
                return true;
            }else if(array[start]+array[end]>n){
                System.out.println("Number is bigger");
                end--;
            }else{
                System.out.println("Number is smaller:");
                start++;
            }
        }
        return false;
    }
    public static void main(String [] args){
         System.out.println(add());
        System.out.println(add());
    }
}
