package lect8;

public class Ques1 {
    public static void main(String[] args) {
        Shapes rec = new Rectangle();
        Shapes cir = new Circle();
        float area = rec.area(12, 3);
        System.out.println(area);
        float areaC = cir.area(5,0);
        System.out.println(areaC);
    }
}

abstract class Shapes {
    abstract float area(float par1, float par2);
}

class Rectangle extends Shapes {
    float area(float par1, float par2) {
        float area;
        area = par1*par2;
        return area;
    }
}
class Circle extends Shapes {
    float area(float par1, float par2) {
        float area;
        area = 3.14f*par1*par1;
        return area;
    }
}

