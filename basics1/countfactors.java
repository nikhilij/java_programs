import java.util.Scanner;

public class countfactors {
    public static void main(String[] args) {
        System.out.println("Enter the number to find its factors: ");
        Scanner scan=new Scanner(System.in);
        // code below is to find the factors of the number: 
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        scan.close();
        System.out.println("total factors : "+count);

    }
}
