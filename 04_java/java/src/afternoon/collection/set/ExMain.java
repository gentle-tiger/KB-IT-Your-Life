package afternoon.collection.set;

import java.util.HashSet;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열 생성
        int[] arr = new int[10];
        Random rand = new Random();

        // 2. 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가진다.
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = rand.nextInt(10) + 1;
            arr[i] = randomNumber;
        }
        // 3. Set 을 이용해서 발생한 배열에 중복 값이 있으면 "중복이다"
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isAdded = set.add(arr[i]);
            if (isAdded) {
                System.out.println("중복이다.");
            } else {
                System.out.println("말복이다.");
            }

        }
    }
}
