package Scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v); // �������� 10, ���⼭ this�� c1�ǹ�
        System.out.println(v); // �������� 20
    }
}
 
public class scope3 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}