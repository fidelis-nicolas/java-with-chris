package generics;

import inheritance.Human;

public class Main {
    public static void main(String[] args) {
        GenericDemo<Integer> ex = new GenericDemo<>();
        GenericDemo<String> ex2 = new GenericDemo<>();
        ex.setT(45);
        System.out.println(ex.getT());

        ex2.setT("Fidelis");
        System.out.println(ex2.getT());

        GenericsWithTwoElements<Human, String> map = new GenericsWithTwoElements<>(60, "Chris");
        System.out.println(map.getK());
        System.out.println(map.getV());

    }
}
