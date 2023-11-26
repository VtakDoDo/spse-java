import java.util.Scanner;
import java.lang.Math;


public class ulohy2 {
    public static void main(String[] args) {
        Desiata(args);
    }
    static void Prva(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Zadajte číslo: ");
        int cislo = scanner.nextInt();
        
        if (cislo > 0) {
            System.out.println("Číslo je kladné");
        } else if (cislo < 0) {
            System.out.println("Číslo je záporné");
        } else {
            System.out.println("Číslo je nulové");
        }
        
        scanner.close();
    }
    static void Druha(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vstup a: ");
        double a = sc.nextDouble();
        
        System.out.print("Vstup b: ");
        double b = sc.nextDouble();
        
        System.out.print("Vstup c: ");
        double c = sc.nextDouble();
        
        double D = b * b - 4 * a * c;
        
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Korene sú " + x1 + " a " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Korene sú " + x + " a " + x);
        } else {
            System.out.println("Daná kvadratická rovnica nemá riešenie v obore reálnych čísel.");
        }
        
        sc.close();
    }
    static void Tretia(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadajte 1. číslo: ");
        int cislo1 = sc.nextInt();

        System.out.print("Zadajte 2. číslo: ");
        int cislo2 = sc.nextInt();

        System.out.print("Zadajte 3. číslo: ");
        int cislo3 = sc.nextInt();

        sc.close();

        int najvacsieCislo = cislo1;

        if (cislo2 > najvacsieCislo) {
            najvacsieCislo = cislo2;
        }

        if (cislo3 > najvacsieCislo) {
            najvacsieCislo = cislo3;
        }

        System.out.println("Najväčšie číslo: " + najvacsieCislo);
    }
    static void Stvrta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo: ");
        double cislo = scanner.nextDouble();

        System.out.println("Vstupná hodnota: " + cislo);

        if (cislo == 0) {
            System.out.println("Nula");
        } else if (cislo > 0) {
            System.out.print("Kladné číslo");
            if (Math.abs(cislo) < 1) {
                System.out.println(" malé");
            } else if (Math.abs(cislo) > 1000000) {
                System.out.println(" veľké");
            } else {
                System.out.println();
            }
        } else {
            System.out.print("Negatívne číslo");
            if (Math.abs(cislo) < 1) {
                System.out.println(" malé");
            } else if (Math.abs(cislo) > 1000000) {
                System.out.println(" veľké");
            } else {
                System.out.println();
            }
        }
        scanner.close();
    }

    static void Piata(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo medzi 1 a 7: ");
        int cislo = scanner.nextInt();

        if (cislo >= 1 && cislo <= 7) {
            String[] dniVtýždni = {"Pondelok", "Utorok", "Streda", "Štvrtok", "Piatok", "Sobota", "Nedeľa"};
            String denVtýždni = dniVtýždni[cislo - 1];
            System.out.println(denVtýždni);
        } else {
            System.out.println("Neplatný vstup. Zadajte číslo medzi 1 a 7.");
        }

        scanner.close();
    }
    static void Siesta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj 1. číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadaj 2. číslo: ");
        double cislo2 = scanner.nextDouble();

        boolean suRovnake = suRovnakeAzNaTriDesatinneMiesta(cislo1, cislo2);

        if (suRovnake) {
            System.out.println("Sú rovnaké");
        } else {
            System.out.println("Sú odlišné");
        }
        scanner.close();
    }
    public static boolean suRovnakeAzNaTriDesatinneMiesta(double cislo1, double cislo2) {
        double rozdiel = Math.abs(cislo1 - cislo2);
        return rozdiel < 0.0001;
    }
    static void Siedma(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj číslo mesiaca: ");
        int mesiac = scanner.nextInt();

        System.out.print("Zadaj rok: ");
        int rok = scanner.nextInt();

        int pocetDni = zistiPocetDniVMesiaci(mesiac, rok);

        if (pocetDni > 0) {
            System.out.println(getNazovMesiaca(mesiac) + " " + rok + " má " + pocetDni + " dní");
        } else {
            System.out.println("Neplatný mesiac.");
        }
        scanner.close();
    }

    public static int zistiPocetDniVMesiaci(int mesiac, int rok) {
        if (mesiac >= 1 && mesiac <= 12) {
            int[] dniVMesiaci = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (mesiac == 2 && jePriestupnyRok(rok)) {
                return 29;
            }

            return dniVMesiaci[mesiac - 1];
        } else {
            return -1;
        }
    }

    public static boolean jePriestupnyRok(int rok) {
        return (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0));
    }

    public static String getNazovMesiaca(int mesiac) {
        String[] nazvyMesiaca = {
            "Január", "Február", "Marec", "Apríl", "Máj", "Jún",
            "Júl", "August", "September", "Október", "November", "December"
        };
        return nazvyMesiaca[mesiac - 1];
    }
     static void Osma(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte písmeno abecedy: ");
        String userInput = scanner.next();

        if (userInput.length() != 1) {
            System.out.println("Chybové hlásenie: Zadali ste viac ako jedno písmeno.");
        } else {
            char character = userInput.charAt(0);

            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {

                if (isVowel(character)) {
                    System.out.println("Zadané písmeno je samohláskové");
                } else {
                    System.out.println("Zadané písmeno je spoluhláskové");
                }
            } else {
                System.out.println("Chybové hlásenie: Zadali ste znak, ktorý nie je písmeno.");
            }
        }
        scanner.close();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    static void Deviata(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj rok: ");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok " + rok + " je priestupný rok");
        } else {
            System.out.println("Rok " + rok + " nie je priestupný rok");
        }

        scanner.close();
    }
    static void Desiata(String[] args) {
        System.out.println("Prvých 10 prirodzených čísel je:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    static void Jedenasta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo: ");
        int n = scanner.nextInt();

        System.out.println("Zadané číslo: " + n);
        System.out.println("Prvých n prirodzených čísel je: " + n);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Súčet prirodzených čísel až do n členov: " + sum);

        scanner.close();
    }
    static void Dvanasta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte 5 čísel: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / 5;

        System.out.println("Zadané 5 čísla: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Súčet 5 je: " + sum);
        System.out.println("Priemer je: " + average);

        scanner.close();
    }
    static void Trinasta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj koncové celé číslo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Číslo je: " + i + " a kocka " + i + " je: " + cube);
        }

        scanner.close();
    }
    static void Strnasta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo pre výpočet tabuľky násobenia: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
    static void Pätnasta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj nepárne prirodzené číslo: ");
        int n = scanner.nextInt();

        System.out.println("Nepárne čísla sú: ");
        int sum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Súčet " + n + " nepárnych prirodzených čísel je: " + sum);

        scanner.close();
    }

}
