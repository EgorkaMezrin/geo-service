import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceimplTest {
    @Test
    public void byIPTest() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location LocationEcecuted = new Location("", Country.RUSSIA, "", 0);
        Country executedCountry = LocationEcecuted.getCountry();
        Country LocationResult = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(executedCountry, LocationResult);
    }
}
