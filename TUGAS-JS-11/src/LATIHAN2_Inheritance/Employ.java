package LATIHAN2_Inheritance;

/*
 * @author 21343005_EGI YONI SANDRA
 */

public class Employ extends Person{
    private String noKaryawan;
    
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
