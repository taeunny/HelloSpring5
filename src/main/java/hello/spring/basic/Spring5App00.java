package hello.spring.basic;

public class Spring5App00 {
    // 첫번째사례
    // 간단한 인삿말을 출력하는 프로그램 작성

    public static void main(String[]args) {
        // sayHello 메서드를 호출하기위해
        // Spring5App00의 객체화 필요!!
        Spring5App00 app00 = new Spring5App00();
        app00.sayHello("스프링5!!");
    }

    private void sayHello(String msg) {
        System.out.println("안녕하세요." + msg);
    }

}
