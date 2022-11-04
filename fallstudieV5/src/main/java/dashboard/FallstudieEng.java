package dashboard;


import LoginLogout.LoginEng;

//Konstruktor für die Fallstudie Englisch
//Hier wird die Englische Variante gestartet
public class FallstudieEng {
    public static void main(String[] args){
        new splashscreen.SplashScreenEng(null,true).setVisible(true);
        new LoginEng().setVisible(true);
    }
// Methode für den Start der Englsichen Variante
    //Wird benutzt in Fallstudie
    public static void startManuell() {
        new splashscreen.SplashScreenEng(null,true).setVisible(true);
        new LoginEng().setVisible(true);
    }
}
