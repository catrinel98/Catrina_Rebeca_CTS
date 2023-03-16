package singletonRegistry.main;

import singletonRegistry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie= InstitutiePublica.getInstitutie("Politie");
        InstitutiePublica pompieri= InstitutiePublica.getInstitutie("Pompieri");
        InstitutiePublica politielocala= InstitutiePublica.getInstitutie("Politie");

        politie.setNrAngajati(10);
        pompieri.setNrAngajati(5);
        politielocala.setNrAngajati(20);

        System.out.println(politie);
        System.out.println(pompieri);
        System.out.println(politielocala);
    }
}
