package interface1;

interface I{
    public void z(); // �������̽� �޼ҵ忣 ��ü�� ���� (�߰�ȣ{})
    // �������̽��� ��ü���� �����̳� ���¸� ������ ���� {} ���̾�
}
 
class A implements I{
    public void z(){}
}



public interface interface1 {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}
// Ŭ���� A ���� implements I�� �� Ŭ������ �������̽� I�� �����ϰ� �ִٴ� �ǹ̴�. 
// 3���� interface I�� �ɹ��� public void z() �޼ҵ带 Ŭ���� A�� �ݵ�� �����ϰ� �־�� �Ѵٴ� ��
// �������̽��� �޼ҵ�� �׻� public �ؾߵ� �׷��� �������̽� ���� �����ؼ� ��밡��
// ����� �ϳ��� �θ�Ŭ������ �����ߵǴµ� �������̽��� �� Ŭ������ �����ϴ� �������̽��� ������ ���� �� �ִ�