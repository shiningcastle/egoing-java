package Scope;

public class scope2 extends scope1 {
    static int i = 5; // 전역변수
 
    static void a() {
        int i = 10; // 지역변수
        b();
    }
 
    static void b() {
    	int i = 30;// 지역변수
        System.out.println(i);
    }
 
    public static void main(String[] args) {
    	int i = 1; // 지역변수
        a();
        c(); // 상속 함 해봄
        // 실행결과 i=30, print라인은 b메소드에 들어있어서 b의 메소드의 유효범위 사용
        // b 메소드 안에 i가 없으면 전역변수 static i 사용(지역변수가 전역변수보다 순위 높음)
    }
 
}