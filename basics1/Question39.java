// wap to Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there

public class Question39 {

    //
    public static void main(String[] args) {
        int[] arr = {1,2,5,7};
        for(int i=0 ; i<4 ; i++){
            int curr = arr[i];
            int number = curr*100;
            for(int j=0 ; j<4 ; j++){
                int curr1 = arr[j];
                if(curr1!=curr){
                number += curr1*10;
                }
                else{
                    continue;
                }
                for(int q=0 ; q<4 ; q++){
                    int curr2 = arr[q];
                    if(curr2!=curr1 && curr2!=curr){
                        number+=curr2;
                    }
                    else{
                        continue;
                    }
                    System.out.print(number+"\n");
                    number = number - curr2;
                }
                number = number - curr1*10;
            }

        }

    }
}
