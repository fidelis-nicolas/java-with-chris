package generics;

import java.util.ArrayList;

public class GenericDemo<T> {
    private T t;

//    public GenericDemo(T t) {
//        this.t = t;
//    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
