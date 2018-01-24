// Класс декоратор №3
public class Syrup extends CondimentDecorator {
    Dessert dessert;
    public Syrup(Dessert dessert){
        this.dessert = dessert;
    }
    public  String getDescription(){
        return dessert.getDescription() + ", Syrup";
    }
    public  double cost(){
        return 2.50 + dessert.cost();
    }
}
