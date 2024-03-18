package com.example.scraping

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.apache.poi.*
import org.apache.poi.ss.usermodel.FillPatternType
import org.apache.poi.ss.usermodel.IndexedColors
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream

//Download dependency
//Isolate Hackernews title by xPath
//Get list of all titles and links
fun main() {
    val driver = ChromeDriver()
    driver.get("https://www.hackernews.com");
    val text = driver.findElement(By.xpath("//*[@id=\"hnmain\"]/tbody/tr[1]/td/table/tbody/tr/td[2]/span/b/a")).text;

    val elements = driver.findElements(By.className("titleline"));

    /*

    val posts: List<WebElement> = driver.findElements(By.className("titleline"));
    val allPosts: ArrayList<HackernewsPost> = ArrayList<HackernewsPost>();


    for(post in posts){
        val currentPost: HackernewsPost = HackernewsPost(post.text, "Link");
        allPosts.add(currentPost);
    }
    println(allPosts);
    */
    driver.quit();
}