package utility;

public class ExcelRunner {
    public static void main(String[] args) {
        ExcelUtils.initialize();
        System.out.println(ExcelUtils.getLastRowNumber("PV"));
        System.out.println(ExcelUtils.getCellValue("PV", 0,0));
        System.out.println(ExcelUtils.getCellValue("PV", 0,1));
        System.out.println(ExcelUtils.getCellValue("PV", 1,0));
        System.out.println(ExcelUtils.getCellValue("PV", 1,1));
        System.out.println(ExcelUtils.getCellValue("PV", 2,0));
        System.out.println(ExcelUtils.getCellValue("PV", 2,1));
        System.out.println(ExcelUtils.getCellValue("PV", 3,0));
        System.out.println(ExcelUtils.getCellValue("PV", 3,1));
    }
}
