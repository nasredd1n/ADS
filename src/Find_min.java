public class Find_min {
    private static int min(int i,int[] arr){
        if(arr.length-1==i) return arr[i];
        int min = min(i+1,arr);
        return Math.min(arr[i], min(i + 1, arr));
    }
    public static void print(int[] arr){
        System.out.println(min(0,arr));
    }
}
