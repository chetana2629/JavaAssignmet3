package javaAssignment3;

/*2.Print the sum, difference and product of two complex numbers by creating a
class, named &#39;Complex&#39; with separate methods for each operation whose real and
imaginary parts are entered by user. Use Constructors to initialize the data
members*/
class Complex{
	int real,imaginary;

	public Complex() {
		
	}
	public Complex(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	 Complex  sum(Complex c1 , Complex c2) {
		Complex temp=new Complex();
		temp.real=c1.real +c2.real;
		
		temp.imaginary=c1.imaginary +c2.imaginary;
		return temp;
		
	}
	 Complex  sub(Complex c1 , Complex c2) {
			Complex temp=new Complex();
			temp.real=c1.real -c2.real;
			
			temp.imaginary=c1.imaginary -c2.imaginary;
			return temp;
			
		}

	 Complex  product(Complex c1 , Complex c2) {
			Complex temp=new Complex();
			temp.real=c1.real *c2.real;
			
			temp.imaginary=c1.imaginary*c2.imaginary;
			return temp;
			
		}
public void display() {
	 System.out.println("Complex number: "
             + real + " , "
             + imaginary + "i");
}
}

public class Program2 {

	public static void main(String[] args) {
	Complex c1=new Complex(3,4);
	System.out.println("Complex Numbers :");
	c1.display();
	Complex c2=new Complex(8,10);
	c2.display();
	System.out.println("==============================");
	System.out.println("Additon of two complex number ");
	Complex c3=new Complex();
	c3=c3.sum(c1, c2);
	c3.display();
	System.out.println("==============================");
	System.out.println("Substraction of two complex number ");
	c3=c3.sub(c1, c2);
	c3.display();
	System.out.println("==============================");
	System.out.println("Multiplication of two complex number ");
	c3=c3.product(c1, c2);
	c3.display();
	
	
	
	}

}
