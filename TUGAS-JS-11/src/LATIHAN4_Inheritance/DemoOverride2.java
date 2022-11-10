package LATIHAN4_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class DemoOverride2 {
    public static void main(String args[]){
        b obj = new b();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
