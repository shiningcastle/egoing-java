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
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
//    public int avg() {
//        return (this.left + this.right)/2; // sum은 똑같이 void형이라 오버라이딩가능
//        // 하지만 avg는 부모것과 다른 형태인 int return형으로 만듬 오버라이딩 불가 에러
//        // 부모 매소드가 avg(int a) 같이 매개변수가 int형이면 자식 메소드 클래스 avg도 int 매개변수 가져야 오버라이딩 가능
//    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
//메소드의 이름
//메소드 매개변수의 숫자와 데이터 타입 그리고 순서
//메소드의 리턴 타입  이 3가지가 같아야 오버라이딩 가능 

public class overriding {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
       // c1.avg(); 에러뜸
        c1.substract();
    }
}
