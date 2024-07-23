public class Margarita extends AbstractPizza{
    public boolean isMeat;
    public Margarita(String name, int price, int weight, boolean isMeat) {
        super(name, price, weight);
        this.isMeat = isMeat;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    @Override
    public void cooking() {
        System.out.println("маргарита готовится");
    }

    @Override
    public void delivery() {
        System.out.println("Пицца маргарита доставлена");
    }

    @Override
    public String toString() {
        return "Имя: " + super.getName() + "\n" +
                "цена: " + super.getPrice() + "\n" +
                "вес: " + super.getWeight() + " грамма\n" +
                "с мясом: " + isMeat;
    }
}
