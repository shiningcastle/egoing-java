package interface1;
// �������̽� ���Ϸ� �����Ҷ� �ʿ��� ����(�Է� ���� ��) �����ϱ����� ���
// implements �������̽� ���ϸ�
// imp�տ� class�� interface���ϰ� ������ �޼ҵ� �����ؾ� �����ȶ߰� �����ϵ�(Ŀ�´����̼� ���� ���� ���)


class CalculatorDummy implements interface1{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class interface2 {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}