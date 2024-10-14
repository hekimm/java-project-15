/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;
import java.util.Scanner;

/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication40 {
    public static int toplama(int a,int b){
        return a+b;
    }
   public static int toplama(int a,int b,int c){
        return a+b+c;
    }
   
  public static int cikartma(int a,int b){
      return a-b;
  }
  
     public static double bolme(double a,double b){
        return a/b;
    }
        public static int carpma(int a,int b){
        return a*b;
    }
        
        public static int carpma(int a,int b,int c){
        return a*b*c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        System.out.println("Lütfen bir işlem seçiniz: ");
        System.out.println("İki sayıyı toplamak için -->1");
        System.out.println("Üç sayıyı toplamak için -->2");
        System.out.println("İki sayıyı farkı için için -->3");
        System.out.println("İki sayıyı bölmek için -->4");
        System.out.println("İki sayıyı çarpmak için -->5");
        System.out.println("Üç sayıyı çarpmak için  -->6");
int birinciSayi,ikinciSayi,ucuncuSayi;
        Scanner scanner = new Scanner(System.in);
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                
                System.out.println("Girilen iki sayının toplamı :  " + toplama(birinciSayi,ikinciSayi));
                break;
                
            case 2:
                System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                 
                 
                 System.out.println("Üçüncü sayıyı giriniz");
                 ucuncuSayi =scanner.nextInt();
                
                System.out.println("Girilen üç sayının toplamı :  " + toplama(birinciSayi,ikinciSayi,ucuncuSayi));
                break;
                
            case 3:
                 System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                System.out.println("Girilen iki sayının farkı :  " + cikartma(birinciSayi,ikinciSayi));
                break;
                
            case 4:
                System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                System.out.println("Girilen iki sayının bolumu :  " + bolme(birinciSayi,ikinciSayi));
                break;
                
            case 5:
                System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                System.out.println("Girilen iki sayının çarpımı :  " + carpma(birinciSayi,ikinciSayi));
                break;
                
                
            case 6:
                System.out.println("Birinci sayıyı giriniz");
                birinciSayi =scanner.nextInt();
                
                System.out.println("İkinci sayıyı giriniz");
                 ikinciSayi =scanner.nextInt();
                 
                 
                 System.out.println("Üçüncü sayıyı giriniz");
                 ucuncuSayi =scanner.nextInt();
                
                System.out.println("Girilen üç sayının çarpımı :  " + carpma(birinciSayi,ikinciSayi,ucuncuSayi));
                break;
              
            default:
              System.out.println("Geçeersiz işlem girdiniz !!");
              
        }
      

    }
    
}
