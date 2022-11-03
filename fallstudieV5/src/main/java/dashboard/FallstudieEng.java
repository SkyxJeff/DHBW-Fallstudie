package dashboard;


import LoginLogout.LoginEng;

public class FallstudieEng {
    public static void main(String[] args){
        new splashscreen.SplashScreenEng(null,true).setVisible(true);
        new LoginEng().setVisible(true);
    }

    public static void startManuell() {
        new splashscreen.SplashScreenEng(null,true).setVisible(true);
        new LoginEng().setVisible(true);
    }
}
