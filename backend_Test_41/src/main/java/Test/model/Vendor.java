package Test.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
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
import Test.converter.DurationConverter;
import Test.converter.UUIDToByteConverter;
import Test.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Vendor")
@Table(name = "\"Vendor\"", schema =  "\"DBtest\"")
@Data
                        
public class Vendor {
	public Vendor () {   
  }
	  
  @Id
  @Column(name = "\"Vendor\"", nullable = true )
  private String vendor;
	  
  @Column(name = "\"Category\"", nullable = true )
  private String category;
  
	  
  @Column(name = "\"ProductName\"", nullable = true )
  private String productName;
  
	  
  @Column(name = "\"ProductUnitsPurchased\"", nullable = true )
  private Integer productUnitsPurchased;
  
	  
  @Column(name = "\"TotalUnitsPurchasedPrice\"", nullable = true )
  private Integer totalUnitsPurchasedPrice;
  
	  
  @Column(name = "\"PricePerUnit\"", nullable = true )
  private Integer pricePerUnit;
  
	  
  @Column(name = "\"VendorAddress\"", nullable = true )
  private String vendorAddress;
  
	  
  @Column(name = "\"VendorContact\"", nullable = true )
  private Long vendorContact;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VendorOrderdetails\"",
            joinColumns = @JoinColumn( name="\"Vendor\""),
            inverseJoinColumns = @JoinColumn( name="\"PurchaseOrderId\""), schema = "\"DBtest\"")
private List<PurchaseOrder> orderdetails = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Vendor [" 
  + "Vendor= " + vendor  + ", " 
  + "Category= " + category  + ", " 
  + "ProductName= " + productName  + ", " 
  + "ProductUnitsPurchased= " + productUnitsPurchased  + ", " 
  + "TotalUnitsPurchasedPrice= " + totalUnitsPurchasedPrice  + ", " 
  + "PricePerUnit= " + pricePerUnit  + ", " 
  + "VendorAddress= " + vendorAddress  + ", " 
  + "VendorContact= " + vendorContact 
 + "]";
	}
	
}