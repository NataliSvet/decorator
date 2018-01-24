// Класс декоратор №1
public class Nuts extends  CondimentDecorator {
    Dessert dessert;
    public  Nuts (Dessert dessert){
        this.dessert = dessert;
    }
    public  String getDescription(){
        return dessert.getDescription() + ", Nuts";
    }
    public  double cost(){
        return 5.50 + dessert.cost();
    }
}
