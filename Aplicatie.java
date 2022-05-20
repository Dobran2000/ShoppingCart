package DiagrameClase;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aplicatie
{
	public static void main(String[] args)
	{
		 Product p1=new Product("Laptop",500,300);
		 Product p2=new Product("Telefon",100,400);
		 Product p3=new Product("Mouse",200,400);
		 Product p4=new Product("Casti",100,400);
		 Product p5=new Product("Masina",200,400);
		 
		 Admin user1 = new Admin();
		 Customer user2= new Customer();
		 
		 boolean keepGoing = true;
		 
		 ShoppingCart cart= new ShoppingCart(user2);
		 ShoppingCart cartAdmin= new ShoppingCart(user1);
		 
		 double totalPrice=0;
	     Product item=new Product();
	 
		   ShoppingCart shopCart= new ShoppingCart(user2);

		   String filename="user.txt";

		   LocalDate date=LocalDate.now();


		   Scanner scanner = new Scanner(System.in);
		   System.out.println("1 -> User ");
		   System.out.println("2 -> Admin ");
		   System.out.println("1. Creare cont in aplicatie ");
		   System.out.println("2. Afisare utlizatori din aplicatie ");
		   System.out.println(" Va rugam introduceti o comanda ");
		   String comanda = scanner.nextLine();
	       boolean citeste=true;
	       do {
		     switch(comanda)
		     {  
		      case "1":
		    	  System.out.println("1. Creare cont utilizator ");
		    	  System.out.println("2. Afisare  utilizator ");
		    	  System.out.println("3. Adaugare  produs ");
		      	  System.out.println("4. Sterge  produs ");
		      	  System.out.println("5. Vizualizare Pret");
		    	  System.out.println("Introduceti comanda dorita ");
		    	  String comandaUser =scanner.nextLine();
		       switch(comandaUser)
		    	  {
		    	    case "1":
		    		  System.out.println("Nume utlizator: ");
				      String username = scanner.nextLine();
				      System.out.println("Parola: ");
				      String password = scanner.nextLine();
				      System.out.println("Email : ");
				      String email = scanner.nextLine();
				      System.out.println("Contact Number : ");
				      String contact_number = scanner.nextLine();
				      user2.create_account(filename, username, email, contact_number, password);
				      System.out.println("Contul a fost creat cu succes");
				    break;
		    	   case "2":
		    		  System.out.println("Afisare utilizatori: ");

		  user1.read(filename);
			    
		    	    break;
		    	   case "3":
		    		   System.out.println("Lista produse disponibile");
		    		   cart.GetCatalogDescription();
		    		   System.out.println("Introduceti numele produsului dorit");
		    		   String productName=scanner.nextLine();
		    		   shopCart.AddProduct(productName);
		    		   shopCart.showCart();
            		  
		     		   break;

		    	   case "4":
		    		   System.out.println("Introduceti numele produsului dorit");
		    		   String productNameToRemove=scanner.nextLine();
		    		   shopCart.RemoveProduct(productNameToRemove);	    		   
		    		   shopCart.showCart();
		    		   System.out.println(shopCart.calculateTotalPrice(cart.cart));
		    		   shopCart.showAllProducts();
		    		   break;
					case "5":
						shopCart.printTotal();
						break;
		    	   default:
			    	  System.out.println("Ati introdus o comanda gresit. Va rugam introduceti alta comanda");
				   }
		           break;
	   
		      case "2":
		    	  System.out.println("1. Afisare  utilizatori ");
		    	  System.out.println("2. Adaugare produs nou ");
	        	  System.out.println("3. Afisare stoc produse ");
		    	  System.out.println("4. Actualizare stoc produse");
		    	  System.out.println("5. Stergere produse");
		    	  System.out.println("--Introduceti comanda admin--");
		    	  String comandaAdmin = scanner.nextLine();
		    	   switch(comandaAdmin)
		    	   {
		    	    case "1":
		    		  System.out.println("Afisare utilizatori: ");
		    		  user1.read(filename);
		    	     break;
		    	    case "2":
		    		   cartAdmin.AddProductToCatalog();
		              break;
		    	    case "3":
		    		   cartAdmin.showAllProducts();
		    		 break;
		    	    case "4":
		    	    	cartAdmin.showAllProducts();
		    	    	System.out.println("Introduceti numele produsului ");
		    	    	String productName=scanner.nextLine();
		    	    	cartAdmin.UpdateStock(productName);
		    			cartAdmin.showAllProducts();  		   
		    		 break;
		    	    case "5":
		    	    	System.out.println("Introduceti numele produsului ");
		    	    	String productNameToRemove=scanner.nextLine();
		    	    	cartAdmin.RemoveProduct(productNameToRemove);
		    	    	break;
		    	    	
		    	   default:
				       System.out.println("Ati introdus o comanda gresit. Va rugam introduceti alta comanda");
		    	  }
		      break;
		    	   
		     default:
		      System.out.println("Ati introdus o comanda gresit. Va rugam introduceti alta comanda");
		      break;
		    }
	      }while(citeste==true);
		}
	}