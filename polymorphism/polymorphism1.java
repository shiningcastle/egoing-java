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
        A obj = new B(); // obj�� Ŭ���� b�� �ν��Ͻ������� ���´� a Ŭ������ ����
        obj.x(); // obj�� aŬ���� �����̹Ƿ� x�޼ҵ� ��밡��
        // �����߻� obj.y(); // obj�� bŬ���� ���°� �ƴϹǷ� b������ ������ y�޼ҵ� ���Ұ�
        System.out.println(obj.x1()); // x1�� Ŭ���� b���� �������̵� �Ǿ �ν��Ͻ� b�� x1�޼ҵ尡 ����
        // �θ� Ŭ�������� ���ǵ� �޼ҵ常 ������ ���������� 
        // �� ������ �ڽ� Ŭ�������� ���ǵ� ��� ����
        // �ǹ̻� obj�� ��ǻ� bŬ�����ε� b�� a�� ��ӹ��� ���̹Ƿ� b�� �ִµ� a�� ���� �޼ҵ�� ����Ұ���� �����ϸ� �ɵ�
    }
}
