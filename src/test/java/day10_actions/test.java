package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class test extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //1. Tarayıcıyı başlatın
        // 2. http://automationexercise.com url'sine gidin
        driver.get("http://automationexercise.com");
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement anasayfa=driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        System.out.println(anasayfa.isDisplayed());
        //4. 'Kayıt Girişi' düğmesini tıklayın
        WebElement kayıtButon=driver.findElement(By.xpath("//a[@ href='/login']"));
        kayıtButon.click();

        //5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        WebElement yeniKullanıcıKaydı=driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        System.out.println(yeniKullanıcıKaydı.isDisplayed());
        //6. Adı ve e-posta adresini girin
        driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("diraz");

        driver.findElement(By.xpath("(//input[@ type='email'])[2]")).sendKeys("diraz32@gmail.com");

        //7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("(//button[@ type='submit'])[2]")).click();
        //8. 'HESAP BİLGİLERİNİ GİRİN'in görünür olduğunu doğrulayın
        System.out.println(driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed());

        //9. Ayrıntıları doldurun: Başlık, Ad, E-posta, Şifre, Doğum tarihi
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@ type='radio'])[1]")).click();
        driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("1234567890");
        driver.findElement(By.xpath("(//div[@class='selector'])[1]")).sendKeys("12");
        //10. 'Kaydol' onay kutusunu seçin bültenimiz için!'
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //12. Ayrıntıları doldurun: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. 'Hesap Oluştur düğmesini' tıklayın
        //14. 'HESAP OLUŞTURULDU!' görünür
        //15. 'Devam' düğmesini tıklayın
        //16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        //17. 'Hesabı Sil' düğmesini tıklayın
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın





    }


}
