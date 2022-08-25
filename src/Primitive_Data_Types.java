public class Primitive_Data_Types {
    static int in;
    static boolean bool; // variable or data members or functions can not be modified again by using
    static char ch; // static function Static variables are initialized only once So it is taking
    static float flo; // default values
    static double doub;
    static long l;
    static short s;
    static byte by;

    static void display() {
        System.out.println("int = " + in);
        System.out.println("boolean = " + bool);
        System.out.println("char = " + ch );
        System.out.println("float = " + flo);
        System.out.println("double = " + doub);
        System.out.println("long = " + l);
        System.out.println("short = " + s);
        System.out.println("byte = " + by);
    }

    public static void main(String[] args) {
        display(); // static method can be called directly without objects


    }
}