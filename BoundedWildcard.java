// демонстрация использования ограниченного аргумента с подстановочным знаком <? extends SuperClass>
class TwoD{
    int x, y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD{
    int z;
    ThreeD(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD{
    int t;
    FourD(int x, int y, int z, int t){
        super(x, y, z);
        this.t = t;
    }
}

class Coords <T extends TwoD>{
    T[] coords;
    Coords(T[] coords){
        this.coords = coords;
    }
}

public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("Координаты x & y ");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Координаты x & y & z ");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }
    static void showXYZT(Coords<? extends FourD> c){
        System.out.println("Координаты x & y & z & t");
        for (int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD[] td = {new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 2)};
        Coords<TwoD> tdlocs = new Coords<>(td);
        showXY(tdlocs);

        FourD[] fd = {new FourD(1, 2, 3, 4), new FourD(2, 3, 4, 5)};
        Coords<FourD> fdlocs = new Coords<>(fd);
        showXYZ(fdlocs);
        showXYZT(fdlocs);
    }
}
/*
Координаты x & y
0 0
7 9
18 2
Координаты x & y & z
1 2 3
2 3 4
Координаты x & y & z & t
1 2 3 4
2 3 4 5
 */
