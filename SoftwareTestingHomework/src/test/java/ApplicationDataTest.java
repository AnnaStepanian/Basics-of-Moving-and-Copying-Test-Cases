import Homework3.ApplicationData;
import Homework3.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationDataTest {
    @Test
    public void getApplictions(){
        Assert.assertNotNull(new Methods().getApplicationData());
    }

    @Test
    public void addNewApplication(){
        Assert.assertNotNull(new Methods().addNewApplication(new ApplicationData("Robert", "Brown", "05/08/2001", 787657876)));
    }

    @Test
    public void updateApplicationData(){
        Assert.assertNotNull(new Methods().updateApplicationData("Robert", 78987667));
    }

    @Test
    public void findSpecificApplication(){
        Assert.assertNotNull(new Methods().findSpecificApplication("John"));
    }
}
