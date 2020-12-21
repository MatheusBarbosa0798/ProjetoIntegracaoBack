package eletra.model;

import java.util.List;

public class App {
	 
	Products meter = new Products();
	
    public static void main(String[] args) {
    	 SystemService systemService = new SystemService();
         System.out.println("*** Service - start ***");
         
       /*Products meter = systemService.findById(1423);
         systemService.delete(1423);
         System.out.println(meter.toString()+" was deleted."); */
         
         System.out.println("Number of products is now " + systemService.findAll().size() + ".");
         System.exit(0);
         
    /*  SystemService systemService = new SystemService();
        Products meter1 = new Products(1433,"lino","catg23", "modeloA");
        Products meter2 = new Products(147,"linha3","catg23.5", "modeloX");
        Products meter3 = new Products(151,"linha1","catg25", "modeloM"); 
        System.out.println("*** Persist - start ***");
        systemService.persist(meter1);
        systemService.persist(meter2);
        systemService.persist(meter3);
        List<Products> meters1 = systemService.findAll();
        System.out.println("Books Persisted are :");
        for (Products b : meters1) {
            System.out.println("-" + b.toString());
        }
        System.out.println("*** Persist - end ***");
        System.out.println("*** Update - start ***");
        meter1.setLinha("The Idiot");
        systemService.update(meter1);
        System.out.println("Book Updated is =>" +systemService.findById(meter1.getId()).toString());
        System.out.println("*** Update - end ***");
        System.out.println("*** Find - start ***");
        int id1 = meter1.getId();
        Products another = systemService.findById(id1);
        System.out.println("Book found with id " + id1 + " is =>" + another.toString());
        System.out.println("*** Find - end ***");
        System.out.println("*** Delete - start ***");
        int id3 = meter3.getId();
        systemService.delete(id3);
        System.out.println("Deleted book with id " + id3 + ".");
        System.out.println("Nuber of products is now " + systemService.findAll().size() + ".");
        System.out.println("*** Delete - end ***");
        System.out.println("*** FindAll - start ***");
        List<Products> meters2 = systemService.findAll();
        System.out.println("Books found are :");
        for (Products b : meters2) {
            System.out.println("-" + b.toString());
        }
        System.out.println("*** FindAll - end ***");
        System.out.println("*** DeleteAll - start ***");
        systemService.deleteAll();
        System.out.println("Books found are now " + systemService.findAll().size());
        System.out.println("*** DeleteAll - end ***");
         System.exit(0); */
    }
}