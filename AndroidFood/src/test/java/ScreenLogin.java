import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {


    public ScreenLogin(AppiumDriver<MobileElement> driver ){
        PageFactory.initElements(new AppiumFieldDecorator(driver),  this);
    }

    //Mapeamento dos campos e botão entrar
    @AndroidFindBy(accessibility = "email")
    //@iOSFindBy(accessibility = "")
    private MobileElement campoEmail;

    @AndroidFindBy(accessibility = "password")
    //@iOSFindBy(accessibility = "")
    private MobileElement campoSenha;

    @AndroidFindBy(accessibility = "login-button")
    //@iOSFindBy(accessibility = "")
    private MobileElement botaoEntrar;

    public void escreverEmail(String txt)throws InterruptedException {
        Thread.sleep(10000);
        campoEmail.sendKeys(txt);

    }
    public void escreverSenha(String txt)throws InterruptedException {
         campoSenha.sendKeys(txt);
    }

    public void clicarEntrar() {
           botaoEntrar.click();
    }

    public void logar()throws InterruptedException{
        Thread.sleep(10000);
        campoEmail.sendKeys("teste@teste.com");
        campoSenha.sendKeys("123456");
        botaoEntrar.click();
    }


}
