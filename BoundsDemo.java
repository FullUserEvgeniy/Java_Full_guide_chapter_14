// В этой версии класса Stats аргументом типа для Т должен быть
// либо Number, либо класс, производный от NumЬer
class Stats<T extends Number>{
    T[]nums;

    Stats(T[]nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = nums[i].doubleValue() + sum;
        }
        return sum/2;
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stats<Integer> stats = new Stats<Integer>(nums);
        double v = stats.average();

        System.out.println("Среднее значение stats = " + v);

        Double[] nums2 = {2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0};
        Stats<Double> stats2 = new Stats<Double>(nums2);
        double x = stats2.average();

        System.out.println("Среднее значение stats2 = " + x);
    }
}
/*
Среднее значение stats = 22.5
Среднее значение stats2 = 24.1
 */