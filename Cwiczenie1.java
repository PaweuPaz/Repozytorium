package pl.sda.jgdy5.cwiczeniaNaPlikach.cwiczenia;
/*1. Stwórz plik dane.txt, w którym zapisz kilka linijek tekstem.
        Napisz metodę printFile, która za parametr przyjmie łańcuch znaków - nazwę pliku,
        którego wszystkie linie zostaną wypisane. Jeśli plik nie istnieje,
        to metoda zwróci w wyniku wartość false, w innym wypadku zwróci true.*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cwiczenie1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter save = new PrintWriter("dane.txt");
        save.println("2222 Przykładowe kilka linijek tekstu 1\n Przykładowe kilka linijek tekstu 2 \n Przykładowe kilka linijek tekstu 3");
        save.close();
        /*File plik1 =new File("dane.txt");
        Scanner in =new Scanner(plik1);
        while (in.hasNext()){
            String wydruk = in.nextLine();
            System.out.println(wydruk);*/

        /*boolean wynik = printFile("dane.txt");
        System.out.println(wynik);*/



        printFile("dane.txt");
        System.out.println(printFile("dane.txt"));


        }

        public static boolean printFile(String nazwaPliku) throws FileNotFoundException{
            File plik2 =new File(nazwaPliku);
           // plik2.exists();
            if (plik2.exists()){
                Scanner in = new Scanner(plik2);
                while (in.hasNext()) {
                    String tekst = in.nextLine();
                    System.out.println(tekst);

                }return true;

                //System.out.println(plik2.exists());
               // System.out.println(plik2.exists());

            } return false;



    }


    }




