package day12.inner;

// 계산 기능 명세
// 두개의 정수를 상황에 맞게 연산할 수 있다

//인터페이스 - > 추상적 -> 객체생성X


//람다 사용이 가능한지 체크 : 추상메서드가 1개인 경우
@FunctionalInterface //입력시 에러 발생이 안나면 람다식 사용 가능

public interface Calculator {

    int operate(int n1, int n2);

}
