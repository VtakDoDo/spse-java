import java.util.Random;

class A {
    public static void main(String[] args) {
        Random rand = new Random();
        int pocetPlodin = rand.nextInt(100) + 1; 
        String[] typyPlodin = {"ovocie", "zelenina", "obilnina"};
        String typPlodiny = typyPlodin[rand.nextInt(typyPlodin.length)]; 
        double urodaNaJednuPlodinu = rand.nextDouble() * 100; 
        System.out.println("Počet plodín: " + pocetPlodin);
        System.out.println("Typ plodiny: " + typPlodiny);
        System.out.printf("Úroda na jednu plodinu: %.2f kg%n", urodaNaJednuPlodinu);
    }
}
