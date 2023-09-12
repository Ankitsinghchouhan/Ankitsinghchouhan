/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Name{
    String name;
    String surname;
    Name(String name,string surname)
    {
        this.name=name;
        this.surname=surname;
    }
    public static Name function(Name n1,Name n2);
    {
        return new Name(n1.name+n1.surname+n2.surname,n2.nane+n2.surname);
        
    }
}
{
    public class Eg{
        public static void main(String args[])
        {
            name n1=new Name("Aiswarya"."Rai");
            Name("Abhishek","Bachan");
            Name n3=Name.function(n1,n2);
            System.out.println(n3.name+"+n3.surname+"");
        }
    }
}