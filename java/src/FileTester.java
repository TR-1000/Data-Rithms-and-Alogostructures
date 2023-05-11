import java.io.File;
import java.io.FileFilter;

class FileFilterApplication {
    //method - starting
    public static void main(String[] args) {
        File directoryPath = new File("D:\\demo\\src");
        
      
        File[] result = directoryPath.listFiles(new FileFilter() {
            
            public boolean accept(File filePathname) {
               return filePathname.getName().endsWith(".java"); 
            }
        });
         
        // File[] result = directoryPath.listFiles(filePathname-> filePathname.getName().endsWith(".java"));
        // File[] result = directoryPath.listFiles((File filePathname) -> filePathname.getName().endsWith(".java"));
        // File[] result = directoryPath.listFiles(filePathname-> { return filePathname.getName().endsWith(".java"); });
        
        
        for(File file: result ){
            System.out.println(file.getName());
        }
    }
}

public class FileTester {
    public static void main(String pars[]) {
    	
    	Thread threadInstanceLambda = new Thread(() -> System.out.println(" Its me from thread"));
    	
    	
//        Thread threadInstance = new Thread(new Runnable() {
//            //run --- implementation
//            public void run() {
//                System.out.println(" Its me from thread");
//            }
//        });
        threadInstanceLambda.start();
    }
}