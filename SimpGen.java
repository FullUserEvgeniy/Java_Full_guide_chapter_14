//Простой обобщенный класс с двумя параметрами типов
class TwoGen<T, V>{
    T obj1;
    V obj2;

    TwoGen(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void showTypeObject(){
        System.out.println("Типом объекта T является: " + obj1.getClass().getName());
        System.out.println("Типом объекта V является: " + obj2.getClass().getName());
    }

    T getObj1(){return obj1;}
    V getObj2(){return obj2;}
}
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "Строка");

        twoGen.showTypeObject();

        int t = twoGen.getObj1();
        String v = twoGen.getObj2();

        System.out.println("obj1 содержит: " + t);
        System.out.println("obj2 содержит: " + v);
    }
}
/*
Типом объекта T является: java.lang.Integer
Типом объекта V является: java.lang.String
obj1 содержит: 88
obj2 содержит: Строка
 */