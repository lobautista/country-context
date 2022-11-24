package context;

public abstract class BaseCountryContext implements ICountryContext{

    @Override
    public void printDataDetails() {
        System.out.println("Send to Spaas-rOUTER");
    }
}
