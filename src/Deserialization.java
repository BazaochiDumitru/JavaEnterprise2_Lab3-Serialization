import java.io.*;

public class Deserialization {
    public static void main(String [] args) {
        // Inițializarea unei referințe de tip Employee cu null
        Employee e = null;

        String filename = "employee.ser";

        try {
            // Deschiderea unui flux de intrare către fișierul employee.ser
            FileInputStream fileIn = new FileInputStream(filename);

            // Crearea unui obiect ObjectInputStream pentru a citi obiectul serializat din fluxul de intrare
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserializarea obiectului și conversia acestuia la tipul Employee
            e = (Employee) in.readObject();

            // Închiderea obiectului ObjectInputStream și a fluxului de intrare
            in.close();
            fileIn.close();
        } catch (IOException i) {
            // Tratarea excepțiilor de IO și afișarea stivei de apeluri
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // Tratarea excepției de clasă neencontrată (ClassNotFoundException) și afișarea stivei de apeluri
            System.out.println("Clasa Employee nu este găsită");
            c.printStackTrace();
            return;
        }

        // Afișarea informațiilor despre Employeeul deserializat
        System.out.println("Employee deserializat ...");
        System.out.println("Nume: " + e.name);
        System.out.println("Adresa: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Număr: " + e.number);
    }
}