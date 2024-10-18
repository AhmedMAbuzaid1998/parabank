//package Data;
//
//import com.github.javafaker.Faker;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class DataPrep {
//    public static XSSFWorkbook workbook;
//    // to start create Excel sheets
//    public static XSSFSheet sheet;
//    // from this I'll start creating Excel sheets
//    public static XSSFRow rows;
//    // create row from class
//    public static Faker faker;
//    // generate fake data
//    public static Cell cell;
//    // create cell from class
//    public static FileOutputStream out;
//
//
//    public static <map> void setData() throws IOException {
//        //set data hard way
//        workbook = new XSSFWorkbook();
//        // to start create Excel sheets
//        sheet = workbook.createSheet("data");
//        // creating new Excel sheet called "data"
//        faker = new Faker();
//        //generating fake data
//        String pass =faker.internet().password();
//        Map<String, Object[]> data = new TreeMap<>();
//        //[] array , creating data
//        data.put("1", new Object[]{"FirstName", "LastName", "Address", "City", "State", "ZipCode", "Phone", "SSN", "Username", "Password", "Confirm"});
//        //create array of data on the sheet ("firs row " ,    , {Values})
//        data.put("2", new Object[]{faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(), faker.address().cityName(), faker.address().state(), faker.address().zipCode(), faker.phoneNumber().cellPhone(), faker.code().asin(), faker.name().username(), pass, pass});
//        // creating data of 2nd row
//        data.put("3", new Object[]{faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(), faker.address().cityName(), faker.address().state(), faker.address().zipCode(), faker.phoneNumber().cellPhone(), faker.code().asin(), faker.name().username(), pass, pass});
//
//        int rowID = 0;
//        for (String key : data.keySet()) {
//            //condition : here we make new string called key , condition will move on the created data "here we have 3 data (1,2,3)"
//            rows = sheet.createRow(rowID++);
//            // creating new row
//            Object[] arrRows = data.get(key);
//            //
//            int cellID = 0;
//
//            for (Object obj : arrRows) {
//                // for cell , here we make it object not string
//                cell = rows.createCell(cellID++);
//                //creating new cell
//                cell.setCellValue((String) obj);
//                //will put the data in the cell
//            }
//        }
//        out = new FileOutputStream("E:\\3. Testing\\DEPI\\Final Project\\my work edit\\ParkBank1.1\\ParkBank\\src\\test\\java\\Data\\data1.xlsx");
//        // the place of created file data
//        workbook.write(out);
//        // writing data in the file out which I created
//        out.close();
//        // close the output stream
//
//    }
//
//    public static void setDataValue(String value, int rowNo, int cellNo)
//        // set data  easy way
//            throws IOException {
//        sheet = workbook.createSheet("DataValue");
//        rows = sheet.createRow(rowNo);
//        cell = rows.createCell(cellNo);
//        cell.setCellValue(value);
//        out = new FileOutputStream("E:\\3. Testing\\Automation\\project\\ParkBank\\src\\test\\java\\Data\\dataValue.xlsx");
//        workbook.write(out);
//        out.close();
//    }
//
//    public static CharSequence getData(int rowNo, int cellNo) throws IOException {
//        // get data from created file
//        workbook = new XSSFWorkbook("E:\\3. Testing\\Automation\\project\\ParkBank\\src\\test\\java\\Data\\data.xlsx");
//        sheet = workbook.getSheet("data");
//        return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
//    }
//
//    public static void getAllData() {
//        int sheetRowsNo = sheet.getLastRowNum() - sheet.getFirstRowNum();
//        for (int i = 0; i < sheetRowsNo; i++) {
//            String value = sheet.getRow(i).getCell(1).getStringCellValue();
//            sheet.getRow(i).getCell(2).getStringCellValue();
//            sheet.getRow(i).getCell(3).getStringCellValue();
//            sheet.getRow(i).getCell(4).getStringCellValue();
//            System.out.println(value);
//
//        }
//
//    }
//}
package Data;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DataPrep {
    public static XSSFWorkbook workbook;
    // to start create Excel sheets
    public static XSSFSheet sheet;
    // from this I'll start creating Excel sheets
    public static XSSFRow rows;
    // create row from class
    public static Faker faker;
    // generate fake data
    public static Cell cell;
    // create cell from class
    public static FileOutputStream out;


    public static <map> void setData() throws IOException {
        //set data hard way
        workbook = new XSSFWorkbook();
        // to start create Excel sheets
        sheet = workbook.createSheet("data");
        // creating new Excel sheet called "data"
        faker = new Faker();
        //generating fake data
        String pass =faker.internet().password();
        Map<String, Object[]> data = new TreeMap<>();
        //[] array , creating data
        data.put("1", new Object[]{"FirstName", "LastName", "Address", "City", "State", "ZipCode", "Phone", "SSN", "Username", "Password", "Confirm"});
        //create array of data on the sheet ("firs row " ,    , {Values})
        data.put("2", new Object[]{faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(), faker.address().cityName(), faker.address().state(), faker.address().zipCode(), faker.phoneNumber().cellPhone(), faker.code().asin(), faker.name().username(), pass, pass});
        // creating data of 2nd row
        data.put("3", new Object[]{faker.name().firstName(), faker.name().lastName(), faker.address().streetAddress(), faker.address().cityName(), faker.address().state(), faker.address().zipCode(), faker.phoneNumber().cellPhone(), faker.code().asin(), faker.name().username(), pass, pass});

        int rowID = 0;
        for (String key : data.keySet()) {
            //condition : here we make new string called key , condition will move on the created data "here we have 3 data (1,2,3)"
            rows = sheet.createRow(rowID++);
            // creating new row
            Object[] arrRows = data.get(key);
            //
            int cellID = 0;

            for (Object obj : arrRows) {
                // for cell , here we make it object not string
                cell = rows.createCell(cellID++);
                //creating new cell
                cell.setCellValue((String) obj);
                //will put the data in the cell
            }
        }
        out = new FileOutputStream("E:\\testing\\automation\\New folder\\parabank_DEPI graduation\\my work\\parabank\\src\\test\\java\\Data\\data.xlsx");
        // the place of created file data
        workbook.write(out);
        // writing data in the file out which I created
        out.close();
        // close the output stream

    }

    public static void setDataValue(String value, int rowNo, int cellNo)
        // set data  easy way
            throws IOException {
        sheet = workbook.createSheet("DataValue");
        rows = sheet.createRow(rowNo);
        cell = rows.createCell(cellNo);
        cell.setCellValue(value);
        out = new FileOutputStream("E:\\testing\\automation\\New folder\\parabank_DEPI graduation\\my work\\parabank\\src\\test\\java\\Data\\dataValue.xlsx");
        workbook.write(out);
        out.close();
    }

    public static CharSequence getData(int rowNo, int cellNo) throws IOException {
        // get data from created file
        workbook = new XSSFWorkbook("E:\\testing\\automation\\New folder\\parabank_DEPI graduation\\my work\\parabank\\src\\test\\java\\Data\\data.xlsx");
        sheet = workbook.getSheet("data");
        return sheet.getRow(rowNo).getCell(cellNo).getStringCellValue();
    }

    public static void getAllData() {
        int sheetRowsNo = sheet.getLastRowNum() - sheet.getFirstRowNum();
        for (int i = 0; i < sheetRowsNo; i++) {
            String value = sheet.getRow(i).getCell(1).getStringCellValue();
            sheet.getRow(i).getCell(2).getStringCellValue();
            sheet.getRow(i).getCell(3).getStringCellValue();
            sheet.getRow(i).getCell(4).getStringCellValue();
            System.out.println(value);

        }

    }
}
