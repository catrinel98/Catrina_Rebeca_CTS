package main;

import singleton.classics.BazaDate;
import singleton.classics.Secretariat;

public class Main {
    public static void main(String[] args) {

        Secretariat secretariat= Secretariat.instanta.getInstance(200,10);
        Secretariat secretariat1= Secretariat.instanta.getInstance(2043, 10);

        System.out.println(secretariat);
        System.out.println(secretariat1);

        BazaDate bazaDate= BazaDate.getInstance();
        BazaDate bazaDate1=bazaDate.getInstance();
        bazaDate.setDimensiuneData(200);
        bazaDate1.setDimensiuneData(300);
        System.out.print(bazaDate);
        System.out.println(bazaDate1);
    }
}