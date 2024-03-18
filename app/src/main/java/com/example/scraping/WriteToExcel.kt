package com.example.scraping

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream

fun main() {
    val xlWb = XSSFWorkbook()
    val xlWs = xlWb.createSheet()

    val rowNumber = 0
    val columnNumber = 0

    val list1 = arrayListOf<String>("1","2","3");
    val list2 = arrayListOf<String>("et","to","tre");

    for (i in list1.indices){
        val row: Row = xlWs.createRow(i);
        row.createCell(0).setCellValue(list1[i]);
        row.createCell(1).setCellValue(list2[i]);
    }


    val outputStream = FileOutputStream("app/src/main/java/com/example/scraping/text.xlsx")
    xlWb.write(outputStream)
    xlWb.close()
}