import context.CanadaContext;
import context.ChinaContext;
import context.ICountryContext;

public class Main {

    public static void main(String[] args) {

        String countryCode = "CA";
        Main main = new Main();
        ICountryContext countryContext = main.getContext(countryCode);
        countryContext.getDataDetails();
        countryContext.printDataDetails();

    }

    private ICountryContext getContext(String countryCode) {
        ICountryContext countryContext = null;
        switch (countryCode) {
            case "CN":
                countryContext = new ChinaContext();
                break;
            default:
                countryContext = new CanadaContext();
                break;
        }

        return countryContext;
    }
}
