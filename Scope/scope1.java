package Scope;

public class scope1 {
    static int i;
     
    static void c() {
        i = 0; // ���� i�� ���� ���ѷ��� �����߻�
        //���⿡�� �տ� int �����ϸ� ����ȿ��� �ִ� �������� ���ο� i�� ��� 
        // ���� i�� ���� ��ġ�� �ʾ� �����۵�
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { // ������ i �տ� int �ٿ��� 
        	// for�� {} �ȿ����� �����ϴ� ���������� ���� i�� �޶� �����۵�
            c();
            System.out.println(i);
        }
    }
 
}

