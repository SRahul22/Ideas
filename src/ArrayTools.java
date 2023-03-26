public class ArrayTools {
    public int maxindex(int[] arr){
        int maxindex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[0]){
                maxindex=i;
            }
        }
        return maxindex;
    }
    public int max(int[] arr){
        return arr[maxindex(arr)];
    }
    public void print2D(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
            System.out.println();
        }
    }
    public void print(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public char[][] initializeBlank2DCharArray(int a, int b){
        char [][] ans=new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ans[i][j]=' ';
            }
        }
        return ans;
    }


}
