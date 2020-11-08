package interface1;

interface I{
    public void z(); // 인터페이스 메소드엔 본체가 없음 (중괄호{})
    // 인터페이스는 구체적인 로직이나 상태를 가지지 않음 {} 없이씀
}
 
class A implements I{
    public void z(){}
}



public interface interface1 {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}
// 클래스 A 뒤의 implements I는 이 클래스가 인터페이스 I를 구현하고 있다는 의미다. 
// 3행의 interface I의 맴버인 public void z() 메소드를 클래스 A가 반드시 포함하고 있어야 한다는 뜻
// 인터페이스의 메소드는 항상 public 해야됨 그래야 인터페이스 참조 적용해서 사용가능
// 상속은 하나의 부모클래스만 가져야되는데 인터페이스는 한 클래스가 구현하는 인터페이스를 여러개 가질 수 있다