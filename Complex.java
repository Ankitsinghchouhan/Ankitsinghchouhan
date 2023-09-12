/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Complex{
    int real;
    int imag;
    Complex(int real,int imag)
    {
        this.real=real;
        this.imag=imag;
    }
    {
        public static Complex add(Complex x,Complex y);
        {
            return new Complex(x.real+y.real,x.imag+y.imag);
        }
    }
    class eg{
        public static void main(String args[])
        {
            Complex x=new Complex(3,4);
            Complex y=new Complex(2,3);
            Complex z=Complex.add(x,y);
            System.out.println(z.real+"+"+z.imag+"i");
        }
    }