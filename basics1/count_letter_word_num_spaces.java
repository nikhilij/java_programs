import java.util.Scanner;

public class count_letter_word_num_spaces {
    static Scanner scan=new Scanner(System.in);
    void countletter(String string){
        // converting the stirng to lowercase to ignore any disperancies
        string=string.toLowerCase();

        int lettercount=0;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch>='a'&&ch<='z'){
                lettercount++;
            }
        }
        System.out.println("Lettercount : "+lettercount);
    }   


    void countSpace(String string){
        int spacecount=0;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch==' '){
                spacecount++;
            }
        }
        System.out.println("Space count : "+spacecount);
    }

    void countnumber(String string){
        int numbercount=0;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch>='0'&&ch<='9'){
                numbercount++;
            }
        }
        System.out.println("Number count : "+numbercount);
    }

    void countOtherChars(String string) {
        int otherCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9') && ch != ' ') {
                otherCount++;
            }
        }
        System.out.println("Other count: " + otherCount);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        String testString=scan.nextLine();

        count_letter_word_num_spaces count=new count_letter_word_num_spaces();

        count.countletter(testString);
        count.countSpace(testString);
        count.countnumber(testString);
        count.countOtherChars(testString);
        
    }
}
