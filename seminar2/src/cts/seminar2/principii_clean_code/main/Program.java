package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;
import cts.s02.principii_clean_code.clase.readers.StudentReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReadable = new AngajatReader();
			listaAngajati = aplicantReadable.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
