public class Employee implements java.io.Serializable {
    public String name;          // Numele angajatului
    public String address;       // Adresa angajatului
    public transient int SSN;    // Numărul de asigurare socială (nu va fi serializat)
    public int number;           // Numărul angajatului

    public void mailCheck() {
        System.out.println("Expedierea mesajului către " + name + " " + address);
    }
}
