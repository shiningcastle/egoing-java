package acesscontrol;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){ // private�� �ٸ� Ŭ�������� ���� �ȵ� ���� Ŭ������ ���� ����
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class acesscontrol {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // �Ʒ� �ڵ�� ������ �߻��Ѵ�.
        //System.out.println(a.z());
        System.out.println(a.x()); // �ٸ� �޼ҵ带 ���� private ����
    }
}   
//	                    public	protected  default	private
//���� ��Ű��, ���� Ŭ����     ���	       ���	     ���  	  ���
//���� ��Ű��, ��� ����       ���	       ���	     ���	      �ҿ�
//���� ��Ű��, ��� ���� �ƴ�	 ���	       ���	     ���	      �ҿ�
//�ٸ� ��Ű��, ��� ����       ���	       ���	     �ҿ�	      �ҿ�
//�ٸ� ��Ű��, ��� ���� �ƴ�	 ���	       �ҿ�	     �ҿ�	      �ҿ�

