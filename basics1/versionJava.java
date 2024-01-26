public class versionJava {
    public static void main(String[] args) {
        // to gete the current version of java
        System.out.println("\nJava Version "+System.getProperty("java.version"));
        // to get the current version of JRE
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        // to get the details of java home directory
        System.out.println("Java Home: "+System.getProperty("java.home"));
        // to display the java vendor name
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        // to display the java vendor url
        System.out.println("Java Vendor URl: "+System.getProperty("java.vendor.url"));
        // to display the java class path
        System.out.println("Java Class Path : "+System.getProperty("java.class.path")+"\n");
    }
    
}
