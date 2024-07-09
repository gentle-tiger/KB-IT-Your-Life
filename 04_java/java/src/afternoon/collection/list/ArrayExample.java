package afternoon.collection.list;

// ArrayList를 사용하지 않을 때
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        temp[arr.length] = 6;
        arr = temp;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(temp[i]);
        }

        // 배열 제일 뒤에 6을 추가해 주세요!


    }

}
