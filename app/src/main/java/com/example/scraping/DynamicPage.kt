package com.example.scraping

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.interactions.Actions
import java.time.Duration

fun main() {
    // Initialize ChromeDriver
    val driver: WebDriver = ChromeDriver()

    driver.get("https://reddit.com")

    scrollDown(driver)

}

fun scrollDown(driver: WebDriver) {
    // Create a JavascriptExecutor object
    val jsExecutor = driver as JavascriptExecutor

    // Scroll down the page
    jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);")
}