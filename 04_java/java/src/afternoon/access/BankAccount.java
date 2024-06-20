package afternoon.access;

public class BankAccount {

    private int balance;

    // public 생성자
    public BankAccount(){
        this.balance = 0;
    }

    // 입금기능
    public void deposit(int amount){
        if (isVaildAmount(amount)) {
            this.balance += amount;
            System.out.println("현재 잔고는 : " + this.balance + "입니다.");
        }else{
            System.out.println("유효하지 않은 금액입니다.");

        }
    }

    // 출금기능
    public void withdraw(int amount){
        if(isVaildAmount(amount)){
            if(isPositiveAmount(amount)){
                this.balance -= amount;
                System.out.println("현재 잔고는 : " + this.balance + "입니다.");
            }else{
                System.out.println("통장 잔고가 부족합니다.");
                System.out.println("현재 잔고 : "+ this.balance);
            }
        }else{
            System.out.println("유효하지 않은 금액입니다.");

        }
    }
//    같은 클래스 안에 있기 떄문에 접근 가능.
//    잔고 확인
    public void getBalance(){
        System.out.println("현재 잔고는 : " + this.balance + "원 입니다! ㅋㅋ ") ;
    }

//    중복되는 if문을 써야함. 클래스 안에서만 쓰니까 안전하게 private 해도 됨.
        private boolean isVaildAmount(int amount){
            return amount > 0;
        }


        private boolean isPositiveAmount(int amount){
            return this.balance >= amount;
        }
    }


