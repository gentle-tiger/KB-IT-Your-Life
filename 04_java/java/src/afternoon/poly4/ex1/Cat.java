package afternoon.poly4.ex1;

public class Cat implements Animal{

    @Override
    public void eat(){
        System.out.println("고양이가 츄르를 츄릅");
    }

    @Override
    public void sound(){
        System.out.println("고양이가 냥");
    };
}
