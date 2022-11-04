package dashboard;

import LoginLogout.Login;

//Konstruktor für die Klasse Fallstudie
//Hier wird das gesamte Programm gestartet
public class Fallstudie {
    public static void main(String[] args){
        new splashscreen.SplashScreen(null,true).setVisible(true);
        new Login().setVisible(true);
    }
    //Methode zum Start der deutschen Variante
    //Wird im Englischen benutzt
    public static void startManuell()
    {
        new splashscreen.SplashScreen(null,true).setVisible(true);
        new Login().setVisible(true);
    }
}
