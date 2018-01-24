public class Main{

    public static void main(String args[]) {

        Dessert dessert = new FruitIcecream();
        dessert = new Chocolate(dessert);
        System.out.println(dessert.getDescription() + " rub " + dessert.cost());

        Dessert dessert2 = new IceCream();
        dessert2 = new Chocolate(dessert2);
        dessert2 = new Nuts(dessert2);
        System.out.println(dessert2.getDescription() + " rub " + dessert2.cost());

        Dessert dessert3 = new FruitIcecream();
        dessert3 = new Syrup(dessert3);
        dessert3 = new Nuts(dessert3);
        System.out.println(dessert3.getDescription() + " rub " + dessert3.cost());
    }
}
