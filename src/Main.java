import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pervyiSostav = new ArrayList<>();
        ArrayList<String> vtoroiSostav = new ArrayList<>();
        System.out.println("Введите имена игроков первого состава:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            pervyiSostav.add(input);
        }
        System.out.println("Состав первой команды: ");
        for (int i = 0; i < pervyiSostav.size(); i++) {
            System.out.println(pervyiSostav.get(i));
        }

        System.out.println("-------------------------------------------");

        System.out.println("Введите имена игроков второго состава: ");
        for (int b = 0; b < 5; b++) {
            String input = scanner.nextLine();
            vtoroiSostav.add(input);
        }

        System.out.println("Состав второй команды:");
        for (int b = 0; b < vtoroiSostav.size(); b++) {
            System.out.println(vtoroiSostav.get(b));
        }
        System.out.println("-------------------------------------------");
        ArrayList<String> allPlayers = new ArrayList<>();
        for (int c = 0; c < 5; c++) {
            allPlayers.add(pervyiSostav.get(c));
            allPlayers.add(vtoroiSostav.get(4 - c));
        }
        System.out.println("Общая заявка: ");
        for (int с = 0; с < allPlayers.size(); с++) {
            System.out.println(allPlayers.get(с));
        }
        System.out.println("-------------------------------------------");
        allPlayers.sort(Comparator.comparingInt(String::length));
        System.out.println("Отсортированная заявка: "+allPlayers);
    }
}