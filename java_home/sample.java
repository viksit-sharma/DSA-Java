public class sample {
    // public static void bs(int num, int lp, String str) {
    //     if (num == 0) {
    //         System.out.println(str);
    //         return;
    //     } else if (lp == 1 || lp == 0) {
    //         str = str + "0";
    //         lp = 0;
    //     } else {
    //         str = str + "1";
    //         lp = 1;
    //     }
    //     bs(num - 1, lp, str);
    // }
//      public static void bs(int num, int lp, String str) {
//         if (num == 0) {
//             System.out.println(str);
//             return;
//         }
//         if (lp == 0 || lp == 1) {
//             str = str + "0";
//             lp = 0;
//             bs(num-1,lp, str);
//         }
//         else if (lp == 0) {//never runs or works since above works for lp == 0
//             str = str + "1";
//              lp = 1;
//             bs(num-1,lp , str);
//         }
//     }
        public static void bs(int num, int lp, String str) {
            if (num == 0) {
                System.out.println(str);
                return;
            }
            bs(num - 1, 0, str + "0");
            if (lp == 0) {
            bs(num - 1, 1, str + "1");
            }
        }
        public static void main(String[] args) {
            bs(3, 0, "");
        }
}
