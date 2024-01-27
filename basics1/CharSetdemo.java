// Write a Java program to list the available character sets in charset objects.
import java.nio.charset.Charset;
public class CharSetdemo {
    public static void main(String[] args) {
        System.out.println("List of available charset sets: ");
        for(String st : Charset.availableCharsets().keySet()){
        System.out.println(st);
        }
    }    
}
