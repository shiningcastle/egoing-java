package overriding;
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
//    public int avg() {
//        return (this.left + this.right)/2; // sum�� �Ȱ��� void���̶� �������̵�����
//        // ������ avg�� �θ�Ͱ� �ٸ� ������ int return������ ���� �������̵� �Ұ� ����
//        // �θ� �żҵ尡 avg(int a) ���� �Ű������� int���̸� �ڽ� �޼ҵ� Ŭ���� avg�� int �Ű����� ������ �������̵� ����
//    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
//�޼ҵ��� �̸�
//�޼ҵ� �Ű������� ���ڿ� ������ Ÿ�� �׸��� ����
//�޼ҵ��� ���� Ÿ��  �� 3������ ���ƾ� �������̵� ���� 

public class overriding {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
       // c1.avg(); ������
        c1.substract();
    }
}
