package utility;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelUtils {
    static String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" +
            File.separator + "resources" + File.separator + "data.xlsx";
    static XSSFWorkbook workbook;

    private ExcelUtils() {

    }

    private static void initialize(String path) {
        try {
            workbook = new XSSFWorkbook(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialize() {
        initialize(filePath);
    }

    public static int getLastRowNumber(String sheet) {
        return workbook.getSheet(sheet).getLastRowNum();
    }

    public static int getLastCellNumber(String sheet, int row) {
        return workbook.getSheet(sheet).getRow(row).getLastCellNum();
    }

    public static String getCellValue(String sheet, int row, int cell) {
        String value = "";
        XSSFCell cellValue = workbook.getSheet(sheet).getRow(row).getCell(cell);
        if (cellValue.getCellType() == CellType.NUMERIC) {
            value = String.valueOf(cellValue.getNumericCellValue());
        } else if(cellValue.getCellType() == CellType.STRING){
            value = cellValue.getStringCellValue();
        } else if(cellValue.getCellType() == CellType.BOOLEAN) {
            value = String.valueOf(cellValue.getBooleanCellValue());
        }
        return value;
    }
}
