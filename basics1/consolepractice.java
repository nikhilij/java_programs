import java.io.*;

public class consolepractice {
    public static void main(String[] args) {
        String str;
        char ch[];
        Console obj=System.console();
        System.out.println("Enter username: ");
        str=obj.readLine();
        System.out.println("Enter Password: ");
        // this will bascically take your password and save it some location and print the reference or say store the refrence to ch

        ch=obj.readPassword();


        // the code below will conserver you original password and helps to display it
        String a=String.valueOf(ch);
        
        System.out.println("Username : "+str);
        System.out.println("Password: "+a);

    }
}
