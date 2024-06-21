package afternoon.extendss.access.parent;

public class Parent {
        public int publicValue;
        protected int protectedValue;
        int defaultValue;
        private int privateValue;

//        변수와 메서드에서 사용 가능
        public void publicMethod(){

            System.out.println("Parent.publicMethod");
        }
        protected void protectedMethod(){

            System.out.println("Parent.protectedMethod");
        }
        void defaultMethod(){
            System.out.println("Parent.defaultMethod");
        }
        private void privateMethod(){

            System.out.println("Parent.privateMethod");


             publicMethod();
            protectedMethod();
            defaultMethod();
            privateMethod();
        }
    public void printParent(){
        System.out.println("publicValue : "+ publicValue);
        System.out.println("protectedValue : "+ protectedValue );
        System.out.println("defaultValue :"+ defaultValue);
        System.out.println("privateValue :"+ privateValue);
        publicMethod();
        protectedMethod();
//            defaultMethod();
//            privateMethod();


    }}

