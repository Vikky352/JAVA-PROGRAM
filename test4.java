//package excelutility;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test4 {

    public String getReaddata(String path, int sheetno, int colno, int rowno) {
        String value = "";
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(sheetno);
            value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return value;

    }

    public void getdetails(int input) {

        switch (input) {

            case 1: {
                System.out.println("Congress ");
                break;
            }

            case 2: {
                System.out.println("Aam Aadmi Party");
            }
                break;

            case 3: {
                System.out.println("Bhartiya Janta Party");
            }
                break;

            case 4: {
                System.out.println("Others");
            }
                break;

        }
    }

    public static void main(String[] args) {
        ExcelReaddata ob = new ExcelReaddata();
        ob.getdetails(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("-------WELCOME TO VOTING UTILITY------");
        System.out.println("Please enter your name");
        String name = sc.next();
        System.out.println("Please enter your father name ");

        String father = sc.next();
        System.out.println("Please Enter Your Age");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Sorry You Are Not Eligible please try again");
        }
        System.out.println("       " + " Please enter the choice ");
        System.out.println(" Press 1 for Aadhar 2 For Voter id");
        int id = sc.nextInt();

        if (id < 2) {
            // System.out.println("Congratulation ");
        } else {

        }

        String path = "C:\\Users\\suraj saxena\\eclipse-workspace\\17_oct_newjavabatch_8pm\\testdata\\testdata_8_30pm.xlsx";
        String value = ob.getReaddata(path, 0, 1, 1);
        System.out.println(value);
        System.out.println("Congratulation your data is exist in our record :)");
        System.out.println("Please enter the choice for vote");
        System.out.println(" 1 Congress , 2 Aam Aadmi Party , 3 Bhartiya Janta Party , 4 Others");
        int input = sc.nextInt();
        System.out.println(input);

    }
}
