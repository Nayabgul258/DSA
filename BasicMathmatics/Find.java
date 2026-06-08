package BasicMathmatics;

public class Find {
    public static void main(String[] args) {
        int max = 0;
        int arr [] ={2,5,7,8,4};
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } 
            System.out.println(max);
        }
    }
}

