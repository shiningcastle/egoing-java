package overloading;
// �޼ҵ� �̸��� ���Ƶ� �Ű������� ���������̳� �޴� ������ �ٸ��ٸ� �ٸ� �޼ҵ�� �ν�
// ������ �޶� ���� Ÿ���� ���ƾ���
class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
//        this.left = left; 
//        this.right = right;
//        �� �޼ҵ�� �Ȱ��� �ߺ��� 2���� 1�ٷ� ��ü
        this.setOprands(left, right);
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class overloading {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}