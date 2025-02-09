package generics;

public class TestGenerics {
    // can use generics in methods
    public static <T> void reverse(Pair<T, T> p) {
        p.set(p.getValue(), p.getKey());
    }
    public static void main(String[] args) {
        Pair <String, Integer> pair1 = new Pair<String, Integer>();
        pair1.set("myKey", 12);

        System.out.println(pair1);

        Pair<String, String> pair2 = new Pair<String, String>();
        pair2.set("KCL", "King's College London");
        System.out.println(pair2);
        reverse(pair2);
        System.out.println(pair2);
    }
}
