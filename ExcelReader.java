package com.automation.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) {
        String cellData = "";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);
            cellData = cell.toString();
            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellData;
    }
}
