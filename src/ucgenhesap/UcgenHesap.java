package ucgenhesap;
import java.util.Scanner;

public class UcgenHesap {


    public static void main(String[] args) {
        
        // Kullanıcadan veri girişi almak için kullanılır.         
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Üçgen Hesaplama Uygulamamıza Hoş Geldiniz...");
        System.out.print("Üçgenininiz Dik Üçgen Mi ? (Evet : 1 , Hayır : 0) : ");
        
        
        int secim = scanner.nextInt();
        
        if(secim == 1){
            
            System.out.print("Lütfen Birinci Dik Kenarı Girin : ");
            double kenar1 = scanner.nextDouble();
            System.out.print("Lütfen İkinci Dik Kenarı Girin : ");
            double kenar2 = scanner.nextDouble();
            
            double hipotenus = Math.sqrt((kenar1*  kenar1) + (kenar2 * kenar2));
            double cevre = kenar1 + kenar2 + hipotenus;
            double u = cevre / 2;
            double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - hipotenus));
            
            System.out.println("Hipotenüs : " + hipotenus + "\n"
                              + "Çevre : " + cevre +"\n"
                              + "Alan : " + alan);
        }
        
        else{
            
            System.out.println("Lütfen Birinci Kenarı Girin : ");
            double uzunluk1 = scanner.nextDouble();
            System.out.println("Lütfen İkinci Kenarı Girin : ");
            double uzunluk2 = scanner.nextDouble();
            System.out.println("Lütfen Üçüncğ Kenarı Girin : ");
            double uzunluk3 = scanner.nextDouble();
            
            double cevre2 = uzunluk1 + uzunluk2 + uzunluk3;
            double u2 = cevre2 / 2;
            double alan2 = Math.sqrt(u2 * (u2 - uzunluk1) * (u2 - uzunluk2) * (u2 - uzunluk3));
            
            System.out.println("Çevre : " + cevre2 +"\n"
                              + "Alan : " + alan2);
            
        }

    }
    
}
