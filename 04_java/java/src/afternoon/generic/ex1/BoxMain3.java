package afternoon.generic.ex1;


// GenericBox 클래스를 사용하는 경우
public class BoxMain3 {
    public static void main(String[] args) {
 // 타입 정보가 고정있었지만, 현재 코드는 Integer  타입으로 바로 불러올 수 있는 것ㅇ.ㅁ 
//         1. 코드 중복을 막았고 2. classCastException도 막았음.
//        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setValue(1000);
        Integer integer = integerGenericBox.getValue();
        System.out.println("integer = " + integer);


        // 원래 Object는 모든 타입을 받을 수 있어서 이전에는 예외가 생기지 않았는데,
        // 현재 코드를 보면 Iteger만 넣을 수 있도록 하여 에러가 뜨는 것을 볼 수 있다.
//        integerGenericBox.setValue("2000");
        
        
//        GenericBox<String> stringGenericBox = new GenericBox<String>();
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hellooo");
        String string = stringGenericBox.getValue();
        System.out.println("string = " + string);

    }}
