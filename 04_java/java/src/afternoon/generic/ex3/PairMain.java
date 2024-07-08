package afternoon.generic.ex3;

public class PairMain {
    public static void main(String[] args) {
        // new Pair <> -> 생략
        Pair<String, String> nameDate = new Pair<>( "최호진", "name");
        Pair<String,Integer> ageDate = new Pair<>("age",28);
        Pair<String, Boolean> marriedDate = new Pair<>("married",false);

        System.out.println("marriedDate = " + marriedDate);
        System.out.println("ageDate = " + ageDate);
        System.out.println("nameDate = " + nameDate);
    }



}
