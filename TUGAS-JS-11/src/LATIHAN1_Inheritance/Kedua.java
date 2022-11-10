package LATIHAN1_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class Kedua extends Pertama {
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
