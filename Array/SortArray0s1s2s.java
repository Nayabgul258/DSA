package Array;

public class SortArray0s1s2s {

    static int[] SortArray0s1s2sElement(int arr []){
     int n = arr.length;
     int i = 0;
     int j = n-1;
     while(i <j){
        if(arr[i] == 1 && arr[j] ==0 || arr[i] == 2 && arr[j]== 1){
            arr[i] = 0;
            arr[j]=1;

        } if(arr[i] == 1){
            i++;
        }if(arr[i]==2){
            i++;
        }
        if(arr[j]==0){
            j--;
        
        }if(arr[j]==1){
            j--;
        }
     }
     return arr;
    }
    public static void main(String[] args) {
        int arr[] ={1,0,1,2,0,2,1,0};
        int ans[] = SortArray0s1s2sElement(arr);

        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}