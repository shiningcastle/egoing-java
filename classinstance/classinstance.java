package classinstance;

public class classinstance {
	static int base = 0;
	int left, right;

	public void setoprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public static void main(String[] args) {
		classinstance c1 = new classinstance();
		classinstance c2 = new classinstance();
		c1.base = 1; 
		c2.base = 3;
		// static ���� Ŭ������ ������ �ν��Ͻ� ���ε� ������ �ٸ��� �ص� �����ؼ� �����
		c1.left = 2;
		c2.left = 4;
		System.out.println(c1.base);
		System.out.println(c2.base);
		System.out.println(classinstance.base);
		
		System.out.println(c1.left);
		System.out.println(c2.left);
		classinstance c3 = new classinstance();
		System.out.println(c3.base);// ���� ���� �ν��Ͻ��� �տ��� static ���� ���Ѱ��� ����
		System.out.println(c3.left);// static �Ⱥ��� left right�� �ʱ�ȭ�� 0������ ����
	}

}
// ������ �޼ҵ�� static ������ Ŭ���� ����,�޼ҵ尡 ��/ �Ⱥ����� �ν��Ͻ� ����,�޼ҵ�