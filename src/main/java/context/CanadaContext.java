package context;

public class CanadaContext extends BaseCountryContext{

    @Override
    public void getDataDetails() {
        System.out.println("Send data to Canada flow");
    }
}
