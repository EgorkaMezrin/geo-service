import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    public void localeTest(){
        LocalizationServiceImpl localeServ = new LocalizationServiceImpl();
        String executed = localeServ.locale(Country.RUSSIA);
        String result = "Добро пожаловать";
        Assertions.assertEquals(executed,result);
    }
}