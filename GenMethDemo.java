// Демонстрация определения простого обобщенного метода <Т extends Comparable <T>, V extends Т>
public class GenMethDemo {
    static <T extends Comparable <T>, V extends T> boolean isIn(T x, V[] y){
        for (int i=0; i<y.length; i++){
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) System.out.println("2 присутствует в nums");
        if (!isIn(7, nums)) System.out.println("7 не присутствует в nums");
        System.out.println();

        String[] str = {"one", "two", "three", "four", "five"};
        if (isIn("two", str)) System.out.println("two присутствует в str");
        if (!isIn("seven", str)) System.out.println("seven не присутствует в str");
    }
}
/*
2 присутствует в nums
7 не присутствует в nums

two присутствует в str
seven не присутствует в str
 */