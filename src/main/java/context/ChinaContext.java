package context;

public class ChinaContext extends BaseCountryContext {

    @Override
    public void getDataDetails() {
        System.out.println("Send data to china flow");
    }
}
