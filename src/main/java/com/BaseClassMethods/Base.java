package com.BaseClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	// Browser Launching by using base class driver
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Driver\\operadriver.exe");
			driver = new OperaDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	// browser basic operation methods
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void webDriverWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void get(String url) {
		driver.get(url);
	}

	// Navigation methods
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// Boolean type Return verification methods
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("Whether the WebElement is enabled: "+enabled);
		return enabled;
	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("Whether the WebElement is displayed: "+displayed);
		return displayed;
	}

	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Whether the WebElement is selected: "+selected);
		return selected;
	}

	// String type Return get methods
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current webpage URL address is: "+currentUrl);
		return currentUrl;
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		System.out.println("Text found in the WebElement is: "+text);
		return text;
	}

	public static String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);		
		System.out.println(attribute);
		return attribute;
	}
	//OTP get Scanner Method
	public static String otp() {
		Scanner s =new Scanner(System.in);
		System.out.println("Please enter the otp received");
		String otp = s.next();
		s.close();
		return otp;		
	}
	// input feeding methods
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clearfield(WebElement element) {
		element.clear();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void radioButton(WebElement element) {
		element.click();
	}
	public static void checkBox(WebElement element) {
		element.click();
	}
	// ScreenShot Method
	public static void takesScreenShot(String name) throws IOException, InterruptedException {
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\gobiv\\eclipse-workspace\\Maven_Project\\ScreenShot\\" + name + ".png");
		FileHandler.copy(src, dest);
	}
	//Drop Down Methods
	public static void dropDownSelect(WebElement element, String option, String i) {
		Select s=new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(i);
		}
		else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(i);
		}
		else if (option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(i);
			s.selectByIndex(index);
		}	
	}
	public static void dropDownDeSelect(WebElement element, String option, String data) {
		Select s=new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.deselectByValue(data);
		}
		else if (option.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(data);
		}
		else if (option.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(data);
			s.deselectByIndex(index);
		}	
		else if (option.equalsIgnoreCase("all")) {
			s.deselectAll();
		}
	}
	//Multiple Drop Down Methods	
	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}
	}
	public static void getAllOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement selectedOptions:allSelectedOptions) {
			System.out.println(selectedOptions.getText());
		}
	}
	public static void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	// Action Methods
	public static void actions(WebElement element, String option) {
		Actions a = new Actions(driver);
		if (option.equalsIgnoreCase("moveToElement")) {			
			a.moveToElement(element).build().perform();
		} else if (option.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (option.equalsIgnoreCase("contextClick")) {
			a.contextClick(element).build().perform();
		} else if (option.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(element).build().perform();
		} else if (option.equalsIgnoreCase("clickAndHold")) {
			a.clickAndHold(element).build().perform();
		}  else if (option.equalsIgnoreCase("release")) {
			a.release(element).build().perform();
		}
	}
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element1, element2).build().perform();
	}
	
	//Robot Class Methods for enter
	public static void robot(String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}else if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}		
		else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		else if (option.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		}
		else if (option.equalsIgnoreCase("Right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
	}

	// Alert Methods
	public static void alert(String alertType, String input) throws AWTException {

		if (alertType.equalsIgnoreCase("simpleAlert")) {
			if (input.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			}
		} else if (alertType.equalsIgnoreCase("confirmAlert")) {
			if (input.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (input.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			}
		} else if (alertType.equalsIgnoreCase("promptAlert")) {
			System.out.println("Please enter the prompt input");
			Scanner s = new Scanner(System.in);			
			String promptInput = s.next();
			s.close();
			driver.switchTo().alert().sendKeys(promptInput);
			if (input.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (input.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			}
		}
	}
	
	//Frames Handling Methods
	public static void switchToFrame(String id) {
	driver.switchTo().frame(id);// id is used as reference
	}
	public static void switchToFrame(WebElement element) {
	driver.switchTo().frame(element);//web element is used as reference
	}
	public static void switchToFrame(int index) {
	driver.switchTo().frame(index);//index starts from 0, i.e first iframe is selected
	}
	public static void switchToParentFrame() {
	driver.switchTo().parentFrame();//return to previous frame
	}
	public static void switchToDefaultContent() {
	driver.switchTo().defaultContent();//return to main page
	}
	
	//Window Handling
	public static void windowHandling(String reqTitle) throws InterruptedException {
	Set<String> windowHandles = driver.getWindowHandles();
	
	for(String s:windowHandles) {
		String title = driver.switchTo().window(s).getTitle();
		System.out.println(title);
	}
	//System.out.println("Please enter required web page title here");
	//Scanner s = new Scanner(System.in);
	//Thread.sleep(20000);
	//String reqTitle = s.nextLine();
	//Thread.sleep(9000);
	//s.close();
	for(String s1:windowHandles) {
	if(driver.switchTo().window(s1).getTitle().equals(reqTitle)) {
		break;
	}
	}
	}

	//Java Script Methods
	public static void ScrollByAxis(int x, int y) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(x,y);");
	}
	public static void ScrollByElement(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void ScrollAndClick(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
	}
	public static void scrollToEnd() {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);","");
	}
	// Browser closing methods
	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}
}
