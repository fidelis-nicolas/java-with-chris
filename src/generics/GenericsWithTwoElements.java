package generics;

public class GenericsWithTwoElements <K, V>{
    private K k;
    private V v;

    public GenericsWithTwoElements() {
    }

    public GenericsWithTwoElements(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
