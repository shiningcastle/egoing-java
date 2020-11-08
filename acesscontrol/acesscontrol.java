package acesscontrol;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){ // private라 다른 클래스에서 접근 안됨 같은 클래스만 접근 가능
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
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x()); // 다른 메소드를 통해 private 접근
    }
}   
//	                    public	protected  default	private
//같은 패키지, 같은 클래스     허용	       허용	     허용  	  허용
//같은 패키지, 상속 관계       허용	       허용	     허용	      불용
//같은 패키지, 상속 관계 아님	 허용	       허용	     허용	      불용
//다른 패키지, 상속 관계       허용	       허용	     불용	      불용
//다른 패키지, 상속 관계 아님	 허용	       불용	     불용	      불용

