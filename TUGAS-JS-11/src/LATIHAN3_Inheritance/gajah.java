package LATIHAN3_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class gajah extends hewan {
    public static void testClassMethod(){
        System.out.println("The Ckass Method in Hewan");
    }
    
    public static void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah");
    }
    
    public static void main(String args[]){
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
