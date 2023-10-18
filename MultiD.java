import java.util.*;

public class MultiD {
    public static void main(String[] args){
        int[][] arr= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[0].length;i++){
            arr[i][j] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
        for(int j=0;j<arr.length-1;j++){
            if(max<arr[i][j])
            max=arr[i][j];

        }
    }
        System.out.println("the maximum is "+ max);
sc.close();
    }

}
