package testpack;
public class StaticImport {

    // Static variable
    public static String name = "Selenium";

    // Non static variable
    public int version = 3;

    // Static method
    public static void printName()
    {
        System.out.println("Name is :"+name);
    }

    // Non static method
    public void printVersion()
    {
        System.out.println("Version is : "+version);
    }


    public static void main(String[] args) {

        // Can call static members with class name
        System.out.println(StaticImport.name);
        StaticImport.printName();

        // Can not call non static members with class name
        //System.out.println(StaticMembers.version);
        //StaticMembers.printVersion();

        // Creating an object of class. We can call members using object name
        StaticImport sm = new StaticImport();

        // Calling static member with object is not recommended
        System.out.println(sm.name);
        sm.printName();

        // Object name should be used to call non static members of class
        System.out.println(sm.version);
        sm.printVersion();

    }
}
