public class oddNum {
    public static void printOdd(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printOdd(100);
    }

}
