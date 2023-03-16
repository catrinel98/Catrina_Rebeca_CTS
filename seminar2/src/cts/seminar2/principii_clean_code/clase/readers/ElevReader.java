package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
