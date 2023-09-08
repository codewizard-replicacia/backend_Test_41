package Test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import Test.model.Document;
import Test.model.ProductCatalogue;
import Test.model.Vendor;
import Test.model.Reorder;
import Test.model.InventoryStock;
import Test.model.PurchaseOrder;
import Test.model.ProductStore;
import Test.model.ProductCategory;
import Test.enums.Product;
import Test.converter.ProductConverter;

@Entity(name = "ReorderProductVendor")
@Table(schema = "\"DBtest\"", name = "\"ReorderProductVendor\"")
@Data
public class ReorderProductVendor{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ReOrderId\"")
	private Integer reOrderId;

    
    @Column(name = "\"Vendor\"")
    private String vendor;
 
}