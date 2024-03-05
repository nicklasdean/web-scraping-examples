package com.example.scraping

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream

fun main() {
    val xlWb = XSSFWorkbook()
    val xlWs = xlWb.createSheet()

    val rowNumber = 0
    val columnNumber = 0

    xlWs.createRow(rowNumber).createCell(columnNumber).setCellValue("TEST")

    val outputStream = FileOutputStream("app/src/main/java/com/example/scraping/text.xlsx")
    xlWb.write(outputStream)
    xlWb.close()
}