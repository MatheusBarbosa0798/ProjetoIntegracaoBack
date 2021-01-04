package eletra.model;


public class App {
	 
	Products meter = new Products();
	
    public static void main(String[] args) {
    	 SystemService systemService = new SystemService();
         System.out.println("*** Service - start ***");  
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         systemService.delete(0);
         System.out.println("*** Delete - complete ***");
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         System.exit(0);
    }
}