package Task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import Task.modules.Note;

public class Program {

    private static void showNotebooks(Set<Note> showcase, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        for (Note note : showcase) {
            note.showСharacteristics();
        }
        System.out.println();
        System.out.print("Введите q для возврата обратно в меню: ");
        String quit = scanner.next();
        if (quit == "q") {
            noteSeller(showcase, scanner);
        } else {
            noteSeller(showcase, scanner);
        }
    }

    private static void ram(Set<Note> showcase, int menuNum, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите минимальное значение ОЗУ: ");
        int userInput = scanner.nextInt();
        System.out.println();
        searchRamAndHdAmount(showcase, menuNum, userInput, scanner);
    }

    private static void searchRamAndHdAmount(Set<Note> showcase, int menuNum, int userInput, Scanner scanner) {
        if (menuNum == 1) {
            boolean checker = false;
            for (Note note : showcase) {
                if (note.getRam() >= userInput) {
                    note.showСharacteristics();
                    checker = true;
                } else {
                    continue;
                }
            }
            if (checker == false) {
                System.out.println("Ноутбука по заданным параметрам не найдено.");
                System.out.println();
                System.out.print("Введите q для возврата обратно в меню: ");
                String quit = scanner.next();
                if (quit == "q") {
                    noteSeller(showcase, scanner);
                } else {
                    noteSeller(showcase, scanner);
                }
            }
        }
        if (menuNum == 2) {
            boolean checker = false;
            for (Note note : showcase) {
                if (note.getHdAmount() >= userInput) {
                    note.showСharacteristics();
                    checker = true;
                } else {
                    continue;
                }
            }
            if (checker == false) {
                System.out.println("Ноутбука по заданным параметрам не найдено.");
                System.out.println();
                System.out.print("Введите q для возврата обратно в меню: ");
                String quit = scanner.next();
                if (quit == "q") {
                    noteSeller(showcase, scanner);
                } else {
                    noteSeller(showcase, scanner);
                }
            }
        }
        System.out.println();
        System.out.print("Введите q для возврата обратно в меню: ");
        String quit = scanner.next();
        if (quit == "q") {
            noteSeller(showcase, scanner);
        } else {
            noteSeller(showcase, scanner);
        }
    }

    private static void noteSeller(Set<Note> showcase, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println("Здравствуйте! Вас интересует что-то конкретное?");
        System.out.println();
        System.out.println("1. ОЗУ");
        System.out.println();
        System.out.println("2. Объем жесткого диска");
        System.out.println();
        System.out.println("3. Операционная система");
        System.out.println();
        System.out.println("4. Цвет");
        System.out.println();
        System.out.println("5. Посмотреть всю витрину");
        System.out.println();
        System.out.println("6. Закрыть программу");
        System.out.println();
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            ram(showcase, userInput, scanner);
        }
        if (userInput == 2) {
            hardDiskAmount(showcase, userInput, scanner);
        }
        if (userInput == 3) {
            osSearch(showcase, userInput, scanner);
        }
        if (userInput == 4) {
            findColor(showcase, userInput, scanner);
        }
        if (userInput == 5) {
            showNotebooks(showcase, scanner);
        }
        if (userInput == 6) {
            System.out.println("\033[H\033[2J");
        }
    }

    private static void findColor(Set<Note> showcase, int menuNum, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите желаемый цвет: ");
        String userInput = scanner.next();
        System.out.println();
        searchOsAndColor(showcase, menuNum, userInput, scanner);
    }

    private static void osSearch(Set<Note> showcase, int menuNum, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите название операционной системы: ");
        String userInput = scanner.next();
        System.out.println();
        searchOsAndColor(showcase, menuNum, userInput, scanner);
    }

    private static void searchOsAndColor(Set<Note> showcase, int menuNum, String userInput, Scanner scanner) {
        if (menuNum == 3) {
            boolean checker = false;
            for (Note note : showcase) {
                if (note.getOs().contains(userInput)) {
                    note.showСharacteristics();
                    checker = true;
                } else {
                    continue;
                }
            }
            if (checker == false) {
                System.out.println("Ноутбука по заданным параметрам не найдено.");
                System.out.println();
                System.out.print("Введите q для возврата обратно в меню: ");
                String quit = scanner.next();
                if (quit == "q") {
                    noteSeller(showcase, scanner);
                } else {
                    noteSeller(showcase, scanner);
                }
            }
        }
        if (menuNum == 4) {
            boolean checker = false;
            for (Note note : showcase) {
                if (note.getColor().contains(userInput)) {
                    note.showСharacteristics();
                    checker = true;
                } else {
                    continue;
                }
            }
            if (checker == false) {
                System.out.println("Ноутбука по заданным параметрам не найдено.");
                System.out.println();
                System.out.print("Введите q для возврата обратно в меню: ");
                String quit = scanner.next();
                if (quit == "q") {
                    noteSeller(showcase, scanner);
                } else {
                    noteSeller(showcase, scanner);
                }
            }
        }
        System.out.println();
        System.out.print("Введите q для возврата обратно в меню: ");
        String quit = scanner.next();
        if (quit == "q") {
            noteSeller(showcase, scanner);
        } else {
            noteSeller(showcase, scanner);
        }
    }

    private static void hardDiskAmount(Set<Note> showcase, int menuNum, Scanner scanner) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.print("Введите минимальное значение жесткого диска: ");
        int userInput = scanner.nextInt();
        System.out.println();
        searchRamAndHdAmount(showcase, menuNum, userInput, scanner);
    }

    private static void printShowcase(Set<Note> showcase) {
        for (Note note : showcase) {
            note.showСharacteristics();
        }
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner scanner = new Scanner(System.in);

        Set<Note> showcase = new HashSet<>();

        Note note1 = new Note("Asus2405", 32, 500, "Windows", "Black");
        Note note2 = new Note("Acer9B9Q0", 16, 999, "Windows", "Black");
        Note note3 = new Note("Asus2K110", 64, 500, "Windows", "Silver");
        Note note4 = new Note("Asus345RTG", 16, 999, "Linux", "Black");
        Note note5 = new Note("Razor7M7L7", 32, 500, "Windows", "Silver");
        Note note6 = new Note("Oracle1I0P2", 16, 999, "Linux", "Black");
        Note note7 = new Note("Hitachi8U7Y6T", 128, 500, "Windows", "Red");
        Note note8 = new Note("Roskosmos6D6E6V", 16, 500, "Linux", "Black");

        showcase.add(note1);
        showcase.add(note2);
        showcase.add(note3);
        showcase.add(note4);
        showcase.add(note5);
        showcase.add(note6);
        showcase.add(note7);
        showcase.add(note8);

        printShowcase(showcase);

        noteSeller(showcase, scanner);

        scanner.close();
    }
}
