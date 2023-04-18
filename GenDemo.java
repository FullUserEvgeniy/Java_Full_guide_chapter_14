// пример обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        Gen <Integer> gen = new Gen<Integer>(88);
        gen.showType();
        int v = gen.getTypeName();
        System.out.println("Значение v = " + v);

        Gen<String> stringGen = new Gen<String>("Строка");
        stringGen.showType();
        String str = stringGen.getTypeName();
        System.out.println("Значение str = " + str);
    }
}
class Gen<T>{
    T object;

    Gen (T object){
        this.object = object;
    }

    T getTypeName(){
        return object;
    }

    void showType(){
        System.out.println("Типом Т является: " + object.getClass().getName());
    }
}
/*
Типом Т является: java.lang.Integer
Значение v = 88
Типом Т является: java.lang.String
Значение str = Строка
 */