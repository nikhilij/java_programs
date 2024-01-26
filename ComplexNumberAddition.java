class ComplexNumber {
    double real, imaginary;
    // ye constructor hai initiallize karne mein kaam aayega
    public ComplexNumber(double real, double imaginary) {

        // dekho yaha pe this ka kaam hota hai khud ko reference karane ke liye to jo real hai wo real khud ko hi reference karega
        // and same kaam this.imaginary kar rha hai
        this.real = real;
        this.imaginary = imaginary;
    }
    //method hai add karne ke liye 
    // 'other' act as an parameter 
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }
    // method hai result string mein dikhane ke liye ye string mein convert kar ke return kar dega
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}


public class ComplexNumberAddition {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.5, 3.7);
        ComplexNumber num2 = new ComplexNumber(1.8, 2.3);


        // dekho smjho yaha dhyan se jo num1 aur num2 ek object or say instance banaye ho thik hai 
        // jab tum isse banaye to constructor isko initalize kar diya after that humne add method ko call v kar diya with parameter num2 to ye tumhara num1 mein jo values gye hai and num2 mein values gye hai usse add kara kar return karega jo ki phir sum mein store ho jaaega

        ComplexNumber sum = num1.add(num2);

        System.out.println("Sum: " + sum);
    }
}
