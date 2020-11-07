package Scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v); // 전역변수 10, 여기서 this는 c1의미
        System.out.println(v); // 지역변수 20
    }
}
 
public class scope3 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}