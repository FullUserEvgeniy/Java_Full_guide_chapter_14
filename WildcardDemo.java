// Использование подстановочного знака <?>
public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5};
        Double[] nums2 = {1.0, 2.0, 3.0, 4.0, 5.0};

        NextStats<Integer> nextStats1 = new NextStats<Integer>(nums1);
        NextStats<Double> nextStats2 = new NextStats<Double>(nums2);

        double a = nextStats1.average();
        double b = nextStats2.average();

        System.out.println("Среднее значение nextStats1 = " + a);
        System.out.println("Среднее значение nextStats2 = " + b);

        System.out.println("Среднее значение nextStats1 и nextStats2 ");
        if (nextStats1.isSameAvg(nextStats2)) System.out.println("равны");
        else System.out.println("не равны");
    }
}
class NextStats<T extends Number> {
    T[]nums;

    NextStats(T[]nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = nums[i].doubleValue() + sum;
        }
        return sum/2;
    }

    boolean isSameAvg(NextStats<?> object){
        if (average() == object.average())return true;
        else return false;
    }
}
/*
Среднее значение nextStats1 = 7.5
Среднее значение nextStats2 = 7.5
Среднее значение nextStats1 и nextStats2
равны
 */
