package day12.inner.lambda;

@FunctionalInterface //람다 사용가능
// 사과를 필터링할 추상적 명세서
public interface ApplePredicate {

    // 사과를 받으면 조건에 맞게 검사해서 논리값 반환
    boolean test(Apple apple);
}
