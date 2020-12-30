package eletra.model;


public class App {
	 
	Products meter = new Products();
	
    public static void main(String[] args) {
    	 SystemService systemService = new SystemService();
         System.out.println("*** Service - start ***");    
         systemService.delete(11);
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         System.exit(0);
    }
}