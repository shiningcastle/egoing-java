package final1;

class Calculator {
    static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class A{
    final void b(){}
}

class B extends A{
    // ������ abstract �޼ҵ带 ����Ϸ��� ���� �߻� void b(){}
}
 
final class C{
    final void b(){}
}

// ���ٵ� final Ŭ���� ����Ϸ��ؼ� ���� �߻� class D extends C{}

public class final1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10; final������ ����ȵ� ��ӺҰ�
 
 
    }
 
}
