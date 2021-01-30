package runner.browser_manager;

public class DriverManagerFactory {
    /*
    * clase responsable de manejar los distintos manejadores de los navegadores
     */
    public static runner.browser_manager.DriverManager getManager(DriverType type){

        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Invalid browser selected");
                break;
        }

        return driverManager;

    }
}
