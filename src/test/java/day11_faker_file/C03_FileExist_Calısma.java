package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist_Calısma {
    @Test
    public void test01() {

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.home"));

        // Masa ustumuzdeki text dosyasinin varligini test edin

        String dosyaYolu= System.getProperty("user.home")+ "\\Desktop\\text.txt";
        System.out.println(dosyaYolu);


        String farkliKisim= System.getProperty("user.home");

        // herkesin bilgisayarinda ortak olan kisim ise
        String ortakKisim="\\Desktop\\text.txt";
        // mac icin   "/Desktop/text"

        String masaustuDosyaYolu=farkliKisim+ortakKisim ;

        Assert.assertTrue(Files.exists(Paths.get(masaustuDosyaYolu)));


    }
}
