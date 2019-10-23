package OrangeHrmFeature;

public class Dashboard extends Utils {

    public void toVerifyUserLoggedIn () {
        assert_URLMethod("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }
}
