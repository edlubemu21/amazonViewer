
package amazonviewer;

import java.util.Date;

public class AmazonViewer {

    public static void main(String[] args) {
        showMenu();
    }
    
    public static void showMenu(){
        int exit = 0;
        
        do {            
            System.out.println("BIENVENIDOS AMAZON VIEWER\n");
            System.out.println("Selecciona la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");            
            
            int response = 3;
            switch(response){
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;                    
                case 3:
                    showBooks();
                    break;                    
                case 4:
                    showMagazines();
                    break;
                case 5:                    
                    makeReport();
                    break;
                case 6:          
                    makeReport(new Date());
                    break;
                default:
                    System.out.println("\n...¡¡Selecciona una opción!!\n");
                    break;
            }
            
        } while (exit != 0);
    }
    
    public static void showMovies(){
        int exit = 0;
        do {            
            System.out.println("::MOVIES::");
        } while (exit != 0);
    }
    
    public static void showSeries(){
        int exit = 0;
        do {            
            System.out.println("::SERIES::");
        } while (exit != 0);
    }
   
    public static void showChapters(){
        int exit = 0;
        do {            
            System.out.println("::CHAPTER::");
        } while (exit != 0);
    }
    
    public static void showBooks(){
        int exit = 0;
        do {            
            System.out.println("::BOOKS::");
        } while (exit != 0);
    }
    
    public static void showMagazines(){
        int exit = 0;
        do {            
            System.out.println("::MAGAZINES::");
        } while (exit != 0);
    }
    
    public static void makeReport(){
        
    }
    
    public static void makeReport(Date date){
        
    }
}
