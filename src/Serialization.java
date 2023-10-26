import java.io.*;

public class Serialization {
    public static void main(String [] args) {
        // Crearea unui obiect de tip Employee și inițializarea datelor acestuia
        Employee e = new Employee();
        e.name = "Bazaochi Dumitru";
        e.address = "Balti, Moldova";
        e.SSN = 11122333;
        e.number = 101;

        String filename = "employee.ser";

        try {
            // Crearea unui flux de ieșire către fișierul employee.ser
            FileOutputStream fileOut = new FileOutputStream(filename);

            // Crearea unui obiect ObjectOutputStream pentru a scrie obiectul Employee în fluxul de ieșire
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Scrierea obiectului Employee în fluxul de ieșire
            out.writeObject(e);

            // Închiderea obiectului ObjectOutputStream și a fluxului de ieșire
            out.close();
            fileOut.close();

            // Afișarea unui mesaj pentru a indica că datele serializate au fost salvate cu succes
            System.out.printf("Datele serializate sunt salvate în employee.ser");
        } catch (IOException i) {
            // Tratarea excepțiilor de IO și afișarea stivei de apeluri
            i.printStackTrace();
        }
    }
}