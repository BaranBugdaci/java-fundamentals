package Temeller;

import java.util.Scanner;

public class BurcBulma
{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaçıncı Ayda Doğduğunuzu Giriniz : ");
        int dogduguAy = scanner.nextInt();
        System.out.println("Kaçıncı Günde Doğduğunuzu Giriniz : ");
        int dogduguGun = scanner.nextInt();


        switch (dogduguAy){
            case 1:
                if(dogduguGun >= 1 && dogduguGun < 31) {
                    if (dogduguGun <= 21)
                        System.out.println("Oğlak Burcu");
                    else
                        System.out.println("Kova Burcu");
                }
                break;

            case 2:
                if(dogduguGun >= 1 && dogduguGun <=28) {
                    if (dogduguGun <= 19)
                        System.out.println("Kova Burcu ");
                    else
                        System.out.println("Balık Burcu");
                }
                break;

            case 3:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if (dogduguGun <= 20)
                        System.out.println("Balık Burcu");
                    else
                        System.out.println("Koç Burcu");
                }
                break;

            case 4:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun <= 20)
                        System.out.println("Koç Burcu");
                    else
                        System.out.println("Boğa Burcu");
                }
                break;

            case 5:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun <= 21)
                        System.out.println("Boğa Burcu");
                    else
                        System.out.println("İkizler Burcu");
                }
                break;

            case 6:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=21)
                        System.out.println("İkizler Burcu");
                    else
                        System.out.println("Yengeç Burcu");
                }
                break;

            case 7:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=22)
                        System.out.println("Yengeç Burcu");
                    else
                        System.out.println("Aslan Burcu");
                }
                break;

            case 8:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=23)
                        System.out.println("Aslan Burcu");
                    else
                        System.out.println("Başak Burcu");
                }
                break;

            case 9:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=22)
                        System.out.println("Başak Burcu");
                    else
                        System.out.println("Terazi Burcu");
                }
                break;

            case 10:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=22)
                        System.out.println("Terazi Burcu");
                    else
                        System.out.println("Akrep Burcu");
                }
                break;

            case 11:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=20)
                        System.out.println("Akrep Burcu");
                    else
                        System.out.println("Yay Burcu");
                }
                break;

            case 12:
                if (dogduguGun >= 1 && dogduguGun<=31) {
                    if(dogduguGun<=21)
                        System.out.println("Yay Burcu");
                    else
                        System.out.println("Oğlak Burcu");
                }
                break;


        }

    }

}
