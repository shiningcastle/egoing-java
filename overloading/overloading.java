package overloading;
// 메소드 이름이 같아도 매개변수의 데이터형이나 받는 갯수가 다르다면 다른 메소드로 인식
// 변수는 달라도 리턴 타입은 같아야함
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
//        위 메소드와 똑같이 중복인 2줄을 1줄로 대체
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