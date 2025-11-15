package stringAssignment;
// Question 5 : Search and read about
// a. intern() method in String
// b. StringBuffer
public class Ques5 {
    public static void capacityMethodInfo() {

        //INSERTED "1" INSIDE STRINGBUFFER SO IT MAKES CAPACIITY TO BE 17 MEANS 1 FOR "1" + 16 BY DEFAULT SO SUM TO 17
        StringBuffer sb = new StringBuffer("1");
        System.out.println(sb.capacity()); // 17

        //INSERTED 16 ELEMENTS AFTER 1 SO TOTAL 17 ELEMENTS ARE INSERTED MEANS CAPACITY FULL
        sb.append("1234567890123456");
        System.out.println(sb.capacity()); // 17

        //AS WE ENTER ONE MORE ELEMENT THE THE CAPACITY BECOMES {OLD CAPACITY * 2 + 2} THAT SUM TO 36 HERE
        sb.append("7");
        System.out.println(sb.capacity()); //36
    }

    
    public static void insertMethodInfo() {
        String x = new String("UniqueString");
        String y = x.intern(); 
        String z = "UniqueString"; 
        /*
        String pool is technically known as string inter pool.
        String x = new String("UniqueString");
        → Creates a new String object in Heap (not in String Pool)
        
        String y = x.intern();
        → JVM checks if "UniqueString" exists in String Pool
        → Since it is NOT present, JVM adds it to the Pool
        → y now refers to the pooled String (different from x)
        
        String z = "UniqueString";
        → "UniqueString" is already in the Pool, so z gets the SAME reference as y
        
        Result:
        x == y → false   (heap vs pool)
        y == z → true    (both refer to the same pooled string)
        */
    }
}
