package interface1;
// 인터페이스 파일로 개발할때 필요한 조건(입력 형식 등) 통일하기위해 사용
// implements 인터페이스 파일명
// imp앞에 class는 interface파일과 동일한 메소드 실행해야 에러안뜨고 컴파일됨(커뮤니케이션 통일 위한 기능)


class CalculatorDummy implements interface1{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class interface2 {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
