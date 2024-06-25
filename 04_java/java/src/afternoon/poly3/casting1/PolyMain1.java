package afternoon.poly3.casting1;

public class PolyMain1 {
    public static void main(String[] args) {
//      부모, 자식 메서드 둘 다 사용 가능.
//        Child child = new Child();
//        child.parentMethod();
//        child.childMethod();

//       parent 타입의 child 객체 생성(?)
//         Parent parent = new Child();
//         parent.parentMethod();
//         parent.chlidMethod(); 데이터 타입에 막혀 child 클래스에 접근하지 못한다


//             데이터 타입의 한계로 접근 불가.
//      Parent parent = new Child();
//      parent.childmethod();

//        사용 가능
//        Parent parent = new Child();
//        Child poly = (Child) parent;
//        poly.childMethod();

        Parent parent = new Child();
//      (Child) parent.childMethod();  형변환이 되지 않음.
//      부모는 자식을 담을 수 있기 때문에 다형성에 근간이 될 수 있다?
//      ((Child) parent).childMethod(); 형변환이 됨.

    }
}
