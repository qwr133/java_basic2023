package day12.inner.lambda;


public interface GenericFunction<X, Y> {

    //x를 주면 y를 뱉어줄게(추상화)
    //가전제품을 주면, 가전제품 씨리얼번호를 줄게

    Y apply(X x);

}