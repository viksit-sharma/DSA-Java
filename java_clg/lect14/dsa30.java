package lect14;

import java.io.*;

public class dsa30 {
    public static void DataWriter(String str) {
        try {
            FileWriter writer = new FileWriter("newFile.js",true);
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void DataSwepper(String str) {
        try {
            FileWriter writer = new FileWriter("newFile.js");
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void DataReader() {
        try{
            FileReader reader = new FileReader("newFile.js");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (Exception e) {
             System.out.println(e);
        }
    }
    public static void DataDelete() {
        try{
            File deletingFile = new File("newFile.js");
            if (deletingFile.delete()) {
                System.out.println("File deleteee");
            } else {
                System.out.println("File not deleted");
            }
        } catch (Exception e) {
             System.out.println(e);
        }
    }

    public static void main(String[] args) {
        File newFile = new File("newFile.js");
        try{
            if (newFile.createNewFile()) {
                System.out.println("File newFile.js is succesfully created");
                System.out.println("Get name "+newFile.getName());
                System.out.println("Get abs path "+newFile.getAbsolutePath());
                System.out.println("Get abs file "+newFile.getAbsoluteFile());
            }
            else {
                DataWriter("function sum (x,y){\nsum = x+y;\nreturn sum;\n}\nconsole.log(sum(9,11));");
                DataReader();
                DataSwepper("");
                DataDelete();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
