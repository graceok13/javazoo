public class Animal {

    static int population;

    public String name;
    public String favoriteFood;


    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep(){
        System.out.print(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.print("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }
}
