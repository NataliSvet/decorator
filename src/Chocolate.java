// Класс декоратор №2
public class Chocolate extends CondimentDecorator {
    Dessert dessert;
    public Chocolate(Dessert dessert){
        this.dessert = dessert;
    }
    public  String getDescription(){
        return dessert.getDescription() + ", Chocolate";
    }
    public  double cost(){
        return 6.50 + dessert.cost();
    }
}
