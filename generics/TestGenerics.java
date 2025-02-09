package generics;

public class TestGenerics {
    public static void main(String[] args) {
        Pair <String, Integer> pair1 = new Pair<String, Integer>();
        pair1.set("myKey", 12);

        System.out.println(pair1.toString());

    }
}
