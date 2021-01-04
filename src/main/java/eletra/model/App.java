package eletra.model;


public class App {
	 
	Products meter = new Products();
	
    public static void main(String[] args) {
    	 SystemService systemService = new SystemService();
         System.out.println("*** Service - start ***");
        
         Products medidor1 = new Products("x","y","z");
         systemService.persist(medidor1);
         
         
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         System.exit(0);
    }
}