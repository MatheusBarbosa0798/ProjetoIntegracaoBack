package eletra.model;


public class App {
	 
	Products meter = new Products();
	
    public static void main(String[] args) {
    	 SystemService systemService = new SystemService();
         System.out.println("*** Service - start ***");
         System.out.println("*** Persist Mode ***");

       //  Products medidor1 = new Products("x","y","z");
        // systemService.persist(medidor1);
         
         
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         System.exit(0);
    }
}