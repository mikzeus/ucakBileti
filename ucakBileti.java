import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int km=0;
        int yas;
        int yolculukTipi ;
        double yirmiYasIndirim=0.5;
        double gencIndirim=0.1;
        double yaslindirim=0.3;
        double gidisDonusIndirim=0.2;
        double indirmTutari=0;
        double toplamFiyat;
        double netOdenen;

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mesafeyi km cinsinden giriniz:");
        km=scan.nextInt();

        System.out.println("Lütfen yasinizi giriniz: ");
        yas=scan.nextInt();

        System.out.println("lutfen yolculuk tipini seciniz: \n TEK YON icin ==> 1\n " +
                "GIDIS-DONUS icin ==> 2");
        yolculukTipi=scan.nextInt();

        if (yolculukTipi !=1){
            toplamFiyat=km*0.1;
            indirmTutari=toplamFiyat*gidisDonusIndirim;
            netOdenen=toplamFiyat-indirmTutari;
            System.out.println("toplam odemeniz gereken tutar: " + netOdenen);

        } else if (yolculukTipi !=2) {
            toplamFiyat = km * 0.1;
            System.out.println("toplam odemeniz gereken tutar: " + toplamFiyat);

        }else if (yas<12){
            toplamFiyat=km*0.1;
            indirmTutari=toplamFiyat*yirmiYasIndirim;
            netOdenen=toplamFiyat-indirmTutari;
            System.out.println("toplam odemeniz gereken tutar: " + netOdenen);

        }else if (yas<24 && yas>12){
            toplamFiyat=km*0.1;
            indirmTutari=toplamFiyat*gencIndirim;
            netOdenen=toplamFiyat-indirmTutari;
            System.out.println("toplam odemeniz gereken tutar: " + netOdenen);

        } else if (yas>65){
            toplamFiyat=km*0.1;
            indirmTutari=toplamFiyat*yaslindirim;
            netOdenen=toplamFiyat-indirmTutari;
            System.out.println("toplam odemeniz gereken tutar: " + netOdenen);
        }
        else {
            System.out.println("Hatalı giris yaptınız. lutfen kontrol ediniz");
        }


    }

}
