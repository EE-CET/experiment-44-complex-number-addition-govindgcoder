import java.util.Scanner;

class Complex {
    
    int real;
    int imag;
    //parameterized constructor Complex(int real, int imag)
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers: add(Complex other) returning new Complex
    public Complex add(Complex other){
        return new Complex(this.real+other.real, this.imag+other.imag);
    }
}

public class ComplexAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Read real1, imag1
        int real1 = sc.nextInt();
        int imag1 = sc.nextInt();
        sc.nextLine();
        // Read real2, imag2
        int real2 = sc.nextInt();
        int imag2 = sc.nextInt();
        // Create two Complex objects
        Complex cmp1 = new Complex(real1, imag1);
        Complex cmp2 = new Complex(real2, imag2);
        // Add them
        Complex res = cmp1.add(cmp2);
        System.out.print(res.real+" + "+res.imag+"i");
    }
}
