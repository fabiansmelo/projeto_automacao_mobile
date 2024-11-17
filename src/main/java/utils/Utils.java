package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static AppiumDriver driver;

    public static void acessarApp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "RQ8N80EAPPE");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "ru.innim.my_finance");
        desiredCapabilities.setCapability("appActivity", "ru.innim.my_finance.MainActivity");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void inputTextAppiumCommand(WebElement elemento, String keyeventCommand) {
        elemento.click();

        List<String> argsCommandKeyevent = Arrays.asList("text", transformarNome(keyeventCommand));
        Map<String, Object> commandKeyevent = ImmutableMap.of("command", "input", "args", argsCommandKeyevent);

        String output = (String) driver.executeScript("mobile: shell", commandKeyevent);

        System.out.println(output);
    }

    public static String transformarNome(String texto) {
        String[] lista = texto.split(" ");

        StringBuilder stringModificada = new StringBuilder();

        for (String palavra : lista) {
            stringModificada.append(palavra).append("%s");
        }

        if (stringModificada.length() > 0) {
            stringModificada.setLength(stringModificada.length() - 2);
        }

        return stringModificada.toString();
    }

    // Fazer Screenshot
    public static void gerarCenario(Scenario cenario) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        cenario.attach(screenshot, "image/png", cenario.getName()); // Use 'attach' para versões mais recentes do Cucumber
        File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, new File("./target/screenshots", cenario.getName() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}