package com.marquess.demo.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExcelUtils {
    private static String getValue(XSSFCell xssfCell) {
        if(xssfCell == null) {
            return null;
        }

        if(xssfCell.getCellType() == xssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfCell.getBooleanCellValue());
        } else if(xssfCell.getCellType() == xssfCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfCell.getNumericCellValue());
        } else {
            return String.valueOf(xssfCell.getStringCellValue());
        }
    }

    private static String getValue(HSSFCell hssfCell) {
        if(hssfCell == null) {
            return null;
        }

        if(hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if(hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(hssfCell.getNumericCellValue());
        } else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }

    public static void readFromXlsx(String path, String a) throws  Exception {
        InputStream is = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        //read the row
        for(int numSheet = 0; numSheet <= xssfWorkbook.getNumberOfSheets(); numSheet++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if(xssfSheet == null) {
                continue;
            }
            for(int numRow = 0; numRow <= xssfSheet.getLastRowNum(); numRow++) {
                XSSFRow xssfRow = xssfSheet.getRow(numRow);
                if(xssfRow != null) {
                    XSSFCell cell0 = xssfRow.getCell(0);
                    XSSFCell cell1 = xssfRow.getCell(1);
                    System.out.printf("cell0:" + getValue(cell0) + ",cell1:" + getValue(cell1));
                }
            }
        }
    }

    public static void readFromXls(String path, String a) throws  Exception {
        InputStream is = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        //read the row
        for(int numSheet = 0; numSheet <= hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if(hssfSheet == null) {
                continue;
            }
            for(int numRow = 0; numRow <= hssfSheet.getLastRowNum(); numRow++) {
                HSSFRow hssfRow = hssfSheet.getRow(numRow);
                if(hssfRow != null) {
                    HSSFCell cell0 = hssfRow.getCell(0);
                    HSSFCell cell1 = hssfRow.getCell(1);
                    System.out.printf("cell0:" + getValue(cell0) + ",cell1:" + getValue(cell1));
                }
            }
        }
    }
}
