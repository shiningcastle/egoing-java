package abstract1;

abstract class A{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
class B extends A{
	public int b() {return 1;} //A가 abstract라  B만들어서 상속해서 사용
	// b 메소드도 abstract라 상속한 클래스 B에서 오버라이딩해서(이름 같은 메소드로 다시 정의)사용
}
public class abstract1 {
    public static void main(String[] args) {
        // A obj = new A();  바로사용안되고 에러뜸
    	B obj = new B(); // 상속해서 사용
        System.out.println(obj.b());
    }
}