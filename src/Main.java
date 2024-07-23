public class Main {
    public static void main(String[] args) {
        Peperroni peperroni1 = new Peperroni("пеперони 40см", 300, 600, true);
        peperroni1.cooking();
        System.out.println(peperroni1);
        peperroni1.delivery();
        Margarita margarita1 = new Margarita("Маргарита 30см", 250, 450, false);
        margarita1.cooking();
        System.out.println(margarita1);
        margarita1.delivery();
        LaFinta laFinta = new LaFinta("Ла Финта 50см", 500, 700, true);
        laFinta.cooking();
        System.out.println(laFinta);
        laFinta.delivery();
    }
}