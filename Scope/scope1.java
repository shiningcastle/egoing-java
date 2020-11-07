package Scope;

public class scope1 {
    static int i;
     
    static void c() {
        i = 0; // 위의 i와 같음 무한루프 에러발생
        //여기에도 앞에 int 선언하면 여기안에만 있는 지역변수 새로운 i로 취급 
        // 위에 i에 영향 미치지 않아 정상작동
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { // 여기의 i 앞에 int 붙여도 
        	// for문 {} 안에서만 존재하는 지역변수임 위에 i와 달라 정상작동
            c();
            System.out.println(i);
        }
    }
 
}

