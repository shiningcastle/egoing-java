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
		// static 붙은 클래스의 변수는 인스턴스 별로도 지정을 다르게 해도 공유해서 변경됨
		c1.left = 2;
		c2.left = 4;
		System.out.println(c1.base);
		System.out.println(c2.base);
		System.out.println(classinstance.base);
		
		System.out.println(c1.left);
		System.out.println(c2.left);
		classinstance c3 = new classinstance();
		System.out.println(c3.base);// 새로 만든 인스턴스도 앞에서 static 값을 변한것을 공유
		System.out.println(c3.left);// static 안붙은 left right는 초기화된 0값으로 생성
	}

}
// 변수든 메소드든 static 붙으면 클래스 변수,메소드가 됨/ 안붙으면 인스턴스 변수,메소드