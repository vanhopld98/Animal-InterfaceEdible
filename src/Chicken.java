public class Chicken extends Animal implements Edible{

    @Override
    public String makeSoud() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}