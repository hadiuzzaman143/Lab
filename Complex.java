public class Complex 
{
    // variables to hold real and imaginary part of complex
    // number
    double inum1;
    double inum2;

    public Complex(double inum1, double inum2) 
    {
        this.inum1 = inum1;
        this.inum2 = inum2;
    }

    public static void main(String[] args) 
    {
        Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                temp;

        temp = add(n1, n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.inum1, temp.inum2);
    }
    // we will implement  this function for addition
    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.inum1 = n1.inum1 + n2.inum1;
        temp.inum2 = n1.inum2 + n2.inum2;

        return(temp);
    }
}
