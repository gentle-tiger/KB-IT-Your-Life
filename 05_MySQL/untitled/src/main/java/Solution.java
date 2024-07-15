import java.util.ArrayList;
import java.util.List;

public class Solution {

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            boolean[] visited = new boolean[nums.length];
            backtrack(new ArrayList<>(), nums, visited, result);
            return result;
        }

        // 순열을 만들어서 result에 추가하는 함수
        void backtrack(List<Integer> curr, int[] nums, boolean[] visited, List<List<Integer>> result) {
            // basecase
            if (curr.size() == nums.length) {
                result.add(new ArrayList<>(curr)); //  list를 list안에 넣으면 2차원 배열?
                return;
            }

            // recursive call // #✅ nums를 순회한다.
            for (int i = 0; i < nums.length; i++) {
                // #✅ 현재 접근하는 정수가 curr에 없다면,
                if (visited[i]) continue;
                // #✅ curr에 현재 접근하는 정수를 추가한다.
                curr.add(nums[i]); // add
                visited[i] = true;
                // #✅ 재귀함수를 호출한다.
                backtrack(curr, nums, visited, result);
                //	#✅ curr에서 가장 최근에 추가한 정수를 제거한다.
                curr.remove(curr.size() - 1); // remove 마지막 원소
                visited[i] = false;
            }
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {1, 2, 30, 40};
            List<List<Integer>> permutations = solution.permute(nums);

            for (List<Integer> permutation : permutations) {
                System.out.println(permutation);
            }
        }
    }


