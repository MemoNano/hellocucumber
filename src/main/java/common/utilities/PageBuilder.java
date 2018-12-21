package common.utilities;

import common.models.PageObjectModel;
import model.Home;
import model.Login;


// TODO: This is not implemented for moving between pages. Work on this next - malexander 12/20/18

/**
 * Page Builder Class
 */
public class PageBuilder extends PageObjectModel {

    Home home = new Home();
    Login login = new Login();

    public PageObjectModel getHomePage() {
        return home;
    }

    public PageObjectModel getLoginPage() {
        return login;
    }
}
