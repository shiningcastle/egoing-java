package polymorphism;

class A{
    public String x(){return "x";}
    public String x1(){return "A.x";}
}
class B extends A{
    public String x1(){return "B.x";}
    public String y(){return "y";}
}
public class polymorphism1 {
    public static void main(String[] args) {
        A obj = new B(); // obj는 클래스 b의 인스턴스이지만 형태는 a 클래스의 형태
        obj.x(); // obj는 a클래스 형태이므로 x메소드 사용가능
        // 에러발생 obj.y(); // obj는 b클래스 형태가 아니므로 b에서만 정의한 y메소드 사용불가
        System.out.println(obj.x1()); // x1은 클래스 b에서 오버라이딩 되어서 인스턴스 b의 x1메소드가 실행
        // 부모 클래스에서 정의된 메소드만 실행이 가능하지만 
        // 그 내용은 자식 클래스에서 정의된 대로 실행
        // 의미상 obj는 사실상 b클래스인데 b는 a의 상속받은 것이므로 b에 있는데 a에 없는 메소드는 실행불가라고 이해하면 될듯
    }
}
