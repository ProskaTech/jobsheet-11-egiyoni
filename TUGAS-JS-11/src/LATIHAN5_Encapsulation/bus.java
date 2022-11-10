package latihan5_encapsulation;

/*
 * @author HP 21343005_EGI YONI SANDRA
 */

public class bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
