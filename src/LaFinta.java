public class LaFinta extends AbstractPizza {
    private boolean withMashrooms;

    public boolean isWithMashrooms() {
        return withMashrooms;
    }

    public void setWithMashrooms(boolean withMashrooms) {
        this.withMashrooms = withMashrooms;
    }

    public LaFinta(String name, int price, int weight, boolean withMashrooms) {
        super(name, price, weight);
        this.withMashrooms = withMashrooms;
    }

    @Override
    public void cooking() {
        System.out.println("Ла Финта готовится");
    }

    @Override
    public void delivery() {
        System.out.println("Пицца Ла Финта доставлена");
    }

    @Override
    public String toString() {
        return "Имя: " + super.getName() + "\n" +
                "цена: " + super.getPrice() + "\n" +
                "вес: " + super.getWeight() + " грамма\n" +
                "с грибами: " + withMashrooms;
    }
}
