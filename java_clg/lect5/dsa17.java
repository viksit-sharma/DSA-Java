package lect5;

public class dsa17 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("R");//fast and mutable
        str.append("hh");
        str.insert(1, "upes");
        // System.out.println(str);
        //append()
        //insert()
        //replace()
        //delete()
        //deleteCharAt()
        //reverse()
        //capacity()
        // System.out.println(str.capacity());
        // System.out.println(str.reverse());
        str.deleteCharAt(6);
                System.out.println(str);

    }
}
