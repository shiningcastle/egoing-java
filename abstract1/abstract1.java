package abstract1;

abstract class A{
    public abstract int b();
    //��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
    //public abstract int c(){System.out.println("Hello")}
    //�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�. 
    public void d(){
        System.out.println("world");
    }
}
class B extends A{
	public int b() {return 1;} //A�� abstract��  B���� ����ؼ� ���
	// b �޼ҵ嵵 abstract�� ����� Ŭ���� B���� �������̵��ؼ�(�̸� ���� �޼ҵ�� �ٽ� ����)���
}
public class abstract1 {
    public static void main(String[] args) {
        // A obj = new A();  �ٷλ��ȵǰ� ������
    	B obj = new B(); // ����ؼ� ���
        System.out.println(obj.b());
    }
}