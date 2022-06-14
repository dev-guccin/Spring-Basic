package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();// 클래스 레벨에 올라간다.

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){ // 프라이빗 생성자를 통해 외부에서 생성자를 사용하여 인스턴스를 생성하지 못하도록 막아버린다.
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
