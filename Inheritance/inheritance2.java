package Inheritance;

class Calculator1 {
    int left, right;
     
    public Calculator1(){}
     
    public Calculator1(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
class SubstractionableCalculator1 extends Calculator1 {
    public SubstractionableCalculator1(int left, int right) {
        super(left, right); 
        // 위에 부모 클래스 calculator1의 생성자와 내용같아 super(인자들) 사용
        //this.left = left;
        //this.right = right; 의미, super는 부모뜻함
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class inheritance2 {
    public static void main(String[] args) {
        SubstractionableCalculator1 c1 = new SubstractionableCalculator1(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}