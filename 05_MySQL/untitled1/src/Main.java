import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<Integer>> permute (int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        // 재귀함수 실행
        // new ArrayList<>()는 임의의 배열로 모든 순열의 조합들을 만들기 위한 틀이며 완성될 때마다 result에 저장된다.
        // 그래서 result는 재귀함수가 리턴하는 배열의 값을들 저장하기 위해 2차원 배열의 형태로 선언한 것이고,
        // backtrack 메서드의 매개변수는 1차원 배열의 형태로 값을 저장하는 것이다.
        backtrack(new ArrayList<>(),visited,nums, result);

        return result;

    }

    public void backtrack(List<Integer> curr, boolean[] visited, int[] nums, List<List<Integer>> result){
        System.out.println("backtrack 재귀 실행 ");

        // 순열을 구하는 문제로 해당 배열이 nums의 크기만큼 찼다면 해당 값을 저장해놓아야한다.
        if(curr.size() == nums.length){
            result.add(curr); // 순열의 조합이 만들어지면 해당 배열을 result에 저장해놓는다.
        }

        for(int i=0; i<nums.length; i++){
            // 방문했다면 이후의 코드를 실행시키지 않고 진행하다 for문이 종료된다.
            if(visited[i]) continue;

            // 배열에서 방문하지 않았다면 해당값을 curr에 저장해나아간다.
            // curr 과 nums 배열의 크기가 동일해질 때까지 모든 원소를 저장해 나아간다.
            // 이때 방문했던 배열의 인덱스를 알기 위해 해당 원소의 인덱스 값으로 visited 배열의 값을 boolean 형태로 저장한다.
            visited[i] = true;
            curr.add(nums[i]);
            // 수정된 데이터들을 다시 재귀함수를 사용하여 메서드를 다시 호출한다.
            // curr 배열은 모든 값들을 저장한 배열로 해당 배열이 찰 때까지 계속 넣는다.
            // visited 배열을 통해 해당 원소의 값이 방문한 값인지 아닌지 확인하며 visited의 값을 통해 방문했는지 아닌지 확인한다.
            // result는 curr 배열이 모든 원소들을 품었을 때의 값을 전달받아 저장해 놓는다.
            backtrack(curr,visited,nums,result);
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }



    }



    public static void main(String[] args) {
        Main solution = new Main();
        int[] nums = {1, 2, 30, 40};
        List<List<Integer>> permutations = solution.permute(nums);

        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}


