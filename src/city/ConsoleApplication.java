package city;

import java.util.Scanner;

/**
 * Vstupní bod konzolové aplikace MiniCity.
 */
public class ConsoleApplication {
    private final Scanner scanner;
    private final CityManager cityManager;

    /**
     * Vytvoří konzolovou aplikaci.
     *
     * @param scanner zdroj uživatelského vstupu
     * @param cityManager správce města
     */
    public ConsoleApplication(Scanner scanner, CityManager cityManager) {
        this.scanner = scanner;
        this.cityManager = cityManager;
    }

    /**
     * Připraví základní objekty a spustí aplikaci.
     *
     * @param args argumenty příkazové řádky se nepoužívají
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityManager cityManager = new CityManager(new CityMap(5), 1_000);
        new ConsoleApplication(scanner, cityManager).run();
    }

    /**
     * Spustí zpracování příkazů uživatele.
     */
    public void run() {
        // TODO: Implementujte hlavní cyklus konzolové aplikace.
    }
}
