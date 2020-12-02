package in.nit.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Product;
import in.nit.repo.ProductRepository;
@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
	       System.out.println(repo.getClass().getName());
	       
	       //----------save------------
	       //1.method
	       //Id is null
	      Product p=repo.save(new Product("PEN",6.8,"BLUE"));
	       repo.save(new Product("PENCIAL",5.8,"RED"));
	       repo.save(new Product("MOBILE",5000.8,"BLACK"));
	       repo.save(new Product("LAPTOP",2000.8,"GRAY"));
	       
	       System.out.println("Get Id:"+p.getProdId());
	       System.out.println("Count:"+repo.count());
	       System.out.println("Inserted data");
	       //------------Update----------------
	       //Id not null
//	       Product p1=new Product(p.getProdId(),"GEL",9.9,"YELLOW") ;
//	       repo.save(p1);
//	       System.out.println("Updated"+p1);
	       
	       //------------Find---------------
	       //2.1 Method
//	       Optional<Product> find=repo.findById(3);
//	       if(find.isPresent()) {
//	    	   System.out.println(find.get());
//	       }else {
//	    	   System.out.println("No Data Found");
//	       }
	       
	       //2.2 Mehod
	//       repo.findAll().forEach(System.out::println);
	       
	      //------------------Delete-------------
	       //3.1 Delete By Specific Id
//	       repo.deleteById(3);
//	       System.out.println();
//	       repo.findAll().forEach(System.out::println);
//	       
	       //Delete all row one by one sequence order
//	       repo.deleteAll();//multiple records are fired no records =no query
//	       System.out.println("No records found");
//	       repo.findAll().forEach(System.out::println);
//	       
//	       //Delete All rows in batch(Single Query fired)
//	       repo.deleteAllInBatch();
//	       repo.findAll().forEach(System.out::println);
//	       System.out.println("No More Batch");
//	       
	       //stop server
	      System.exit(0); 
	       
	}

}
