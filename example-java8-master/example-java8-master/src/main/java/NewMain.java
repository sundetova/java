
import com.avaje.ebean.Ebean;
import java.time.LocalDate;
import org.example.domain.Customer;
import org.example.domain.test;
import org.junit.experimental.categories.Category;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        test tt = new test();
        tt.setName("Newname");
        /*Customer customer = new Customer();
        customer.setName("Rob");*/

        // insert the customer
        tt.save();

        test fetched = test.find.byId(tt.getId());
        // fetch using the Ebean singleton style
        test fetched2 = Ebean.find(test.class,tt.getId());

       // Category cat = Ebean.
        
        
        System.out.println("Hello hjkhj" + fetched.getName());
        
        
    }

}
