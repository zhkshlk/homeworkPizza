public class Peperroni extends AbstractPizza{
    public boolean isSpicy;
    public Peperroni(String name, int price, int weight, boolean isSpicy) {
        super(name, price, weight);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    @Override
    public void cooking() {
        System.out.println("Пепперони готовится");
    }

    @Override
    public void delivery() {
        System.out.println("Пицца пеперрони доставлена");
    }

    @Override
    public String toString() {
        return "Имя: " + super.getName() + "\n" +
                "цена: " + super.getPrice() + "\n" +
                "вес: " + super.getWeight() + " грамма\n" +
                "острый: " + isSpicy;
    }
}
