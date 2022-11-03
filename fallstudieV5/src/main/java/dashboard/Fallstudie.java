package dashboard;

import LoginLogout.Login;

public class Fallstudie {
    public static void main(String[] args){
        new splashscreen.SplashScreen(null,true).setVisible(true);
        new Login().setVisible(true);
    }
    public static void startManuell()
    {
        new splashscreen.SplashScreen(null,true).setVisible(true);
        new Login().setVisible(true);
    }
}
