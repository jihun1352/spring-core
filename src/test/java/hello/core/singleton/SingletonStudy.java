package hello.core.singleton;

public class SingletonStudy {

    //1. static 영역에 객체를 딱 1개만 생성
    private static final SingletonStudy Instance = new SingletonStudy();

    //2. public로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회
    public static SingletonStudy getInstance() {
        return Instance;
    }

    //외부에서 new 키워드를 사용하지 못하게 private로 방지
    private SingletonStudy() {

    }

}
