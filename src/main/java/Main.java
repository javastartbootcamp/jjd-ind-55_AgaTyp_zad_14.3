import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        // usupełnij metodę
        File countryFile = new File("src/main/resources/countries.csv");

        try {
            Map<String, Country> countries;
            countries = readFile(countryFile);

            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
            String countryCode = scanner.nextLine();

            if (countries.containsKey(countryCode)) {
                System.out.println(countries.get(countryCode));
            } else {
                System.out.printf("Kod kraju %s nie został znaleziony.", countryCode);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv.");

        }

    }

    public static Map<String, Country> readFile(File file) throws FileNotFoundException {
        Map<String, Country> countries = new HashMap<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String countryLine = sc.nextLine();
                String[] data = countryLine.split(";");
                String countryCode = data[0];
                String countryName = data[1];
                Long population = Long.parseLong(data[2]);

                countries.put(countryCode, new Country(countryCode, countryName, population));
            }
        }

        return countries;
    }

}
