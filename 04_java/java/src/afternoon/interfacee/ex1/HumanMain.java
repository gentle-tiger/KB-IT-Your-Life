package afternoon.interfacee.ex1;

public class HumanMain {
    public static void main(String[] args) {

        Human[] humans = {new Korean(), new American(), new Spanish()};

        for(Human h : humans){
            humanCall(h);
        }



    }
    public static void humanCall(Human human){
        human.speak();
        human.eat();
        human.hello();
    }

}
