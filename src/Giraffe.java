public class Giraffe extends Animal{

    public Giraffe (String name){
        super(name,"leaves");
    }

    public void eat(String food) {
        if (food.equals(favoriteFood)) {
            System.out.print("YUM!!! " + name + " wants more " + food);
        } else {
            System.out.print("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
