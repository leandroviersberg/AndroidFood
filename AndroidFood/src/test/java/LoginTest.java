import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.io.File;
import java.net.MalformedURLException;

public class LoginTest {

    private static ScreenLogin ScreenLogin;


    @BeforeClass
    public static void caps() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app", "E:\\Lene e Leo\\Documents\\qazandofood.apk");
        capabilities.setCapability( "deviceName",  "emulator-5554");
        capabilities.setCapability( "platformName",   "Android");


        AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL( "http://localhost:4723/wd/hub"), capabilities);
        ScreenLogin = new ScreenLogin(driver);

    }

    @Test
    public void testeLogin() throws InterruptedException{
        ScreenLogin.logar();
    }

    @Test
    public void testeLogin2() throws InterruptedException{
        ScreenLogin.escreverEmail( "teste@teste.com");
        ScreenLogin.escreverSenha("123456");
        ScreenLogin.clicarEntrar();

    }

}
