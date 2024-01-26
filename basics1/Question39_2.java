public class Question39_2 {
    public static void main(String[] args) {
        int amount=0;
        int[] arr = {1,2,3,4};
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(arr[k]!=arr[i] && arr[i]!=arr[j] && arr[j] != arr[k]){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        amount++;
                    }
                }
            }
        }
        System.out.println(amount);
    }
}
