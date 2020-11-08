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
    // 이줄은 abstract 메소드를 상속하려해 오류 발생 void b(){}
}
 
final class C{
    final void b(){}
}

// 이줄도 final 클래스 상속하려해서 에러 발생 class D extends C{}

public class final1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10; final붙은건 변경안됨 상속불가
 
 
    }
 
}
