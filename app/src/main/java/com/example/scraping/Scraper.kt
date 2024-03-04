package com.example.scraping

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver

fun main() {
    val driver = ChromeDriver()

    driver.get("https://www.hackernews.com");

    //Uncomment to quit after executing
    //driver.quit();
}