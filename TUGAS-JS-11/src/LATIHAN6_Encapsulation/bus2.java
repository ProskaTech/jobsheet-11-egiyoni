package latihan6_encapsulation;

/*
 * @author HP 21343005_EGI YONI SANDRA
 */

public class bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor
    public bus2(int maxPenumang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Penumpang maks sebenarnya : " + maxPenumpang);
    }
}