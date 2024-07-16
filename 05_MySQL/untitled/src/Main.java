import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,n,k, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int n , int k , List<Integer> curr, List<List<Integer>> result) {

        // basecase
        if(curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;

        }
        // recursive call
        for(int i = start; i <= n; i++){
            curr.add(i);
            backtrack(i+1, n, k, curr, result);
            curr.remove(curr.size() -1 );
        }
    }



    public static void main(String[] args) {
        Main main = new Main();

        int n = 4;
        int k = 2;
        List<List<Integer>> combinations = main.combine(n, k);
        System.out.println("Combinations of " + n + " taken " + k + " at a time are:");

        for(List<Integer> combination : combinations) {
            System.out.println(combination);
        }

    }
}
