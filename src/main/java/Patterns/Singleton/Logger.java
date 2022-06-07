package Patterns.Singleton;

public class Logger {

    private static Logger Logger;

    public static Logger getInstance() {
        if (Logger == null) {
            Logger = new Logger();
        }
        return Logger;
    }

    public void info(Class tClass){
        System.out.println(tClass.getSimpleName());
        System.out.println(tClass.getClass());
    }

}
