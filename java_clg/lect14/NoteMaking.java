package lect14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class NoteMaking {
    public static void createFile(String fileName, String str) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void earseFile(String fileName, String str) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void deleteFile(String fileName) {
        try{
            File deletingFile = new File(fileName);
            if (deletingFile.delete()) {
                System.out.println("File deleteee");
            } else {
                System.out.println("File not deleted");
            }
        } catch (Exception e) {
             System.out.println(e);
        }
    }
    public static void main(String[] arg) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        while(n!=6){
            System.out.println("Enter 1 to create file ");
            System.out.println("Enter 2 to read file ");
            System.out.println("Enter 3 to update file ");
            System.out.println("Enter 4 to delete file ");
            System.out.println("Enter 5 to earse file ");
            System.out.println("Enter 6 to exit app ");
            System.out.print("Enter your choice : ");
            n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter file name to create : ");
                    String fileName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter data : ");
                    String data = sc.nextLine();
                    createFile(fileName, data);
                    break;
                case 2:
                    System.out.print("Enter file name : ");
                    String readFileName = sc.nextLine();
                    readFile(readFileName);
                    break;
                case 3:
                    System.out.print("Enter file name to update : ");
                    String updateFileName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter data : ");
                    String updateData = sc.nextLine();
                    createFile(updateFileName, updateData);
                    break;
                case 4:
                    System.out.print("Enter file name : ");
                    String deleteFileName = sc.nextLine();
                    deleteFile(deleteFileName);
                    break;
                case 5:
                    System.out.print("Enter file name : ");
                    String eraseFileName = sc.nextLine();
                    earseFile(eraseFileName, "");
            }
        }
    }
}
