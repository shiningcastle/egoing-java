package Scope;

public class scope2 extends scope1 {
    static int i = 5; // ��������
 
    static void a() {
        int i = 10; // ��������
        b();
    }
 
    static void b() {
    	int i = 30;// ��������
        System.out.println(i);
    }
 
    public static void main(String[] args) {
    	int i = 1; // ��������
        a();
        c(); // ��� �� �غ�
        // ������ i=30, print������ b�޼ҵ忡 ����־ b�� �޼ҵ��� ��ȿ���� ���
        // b �޼ҵ� �ȿ� i�� ������ �������� static i ���(���������� ������������ ���� ����)
    }
 
}