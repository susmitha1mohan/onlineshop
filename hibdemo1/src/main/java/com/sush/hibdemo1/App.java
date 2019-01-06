package com.sush.hibdemo1;

import model.dao.ProductDAO;
import model.entity.Product;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.CustomerDAO;
import model.dao.ProductDAO;
import model.entity.Customer;
import model.entity.Product;
import model.entity.ProductDetail;
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    	/*Customer c1 = new Customer("Amit",22);
    	CustomerDAO cd = new CustomerDAO();
    	boolean b = cd.insertCustomer(c1);
    	if(b)
        {
     	   System.out.println("Successfully Inserted");
        }
        else
        {
     	   System.out.println("Not Working");
        }*/
    	/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String pName = br.readLine();
    	String pCost = br.readLine();
    	String pFeat = br.readLine();
    	Date d = new Date();
     Product p1 = new Product(pName,pCost);
     ProductDetail pd = new ProductDetail();
     pd.setPfeatures(pFeat);
     pd.setPdate(d);
     pd.setParent(p1);
       ProductDAO pda = new ProductDAO();
       boolean b = pda.insertProduct(pd);
       if(b)
       {
    	   System.out.println("Successfully Inserted");
       }
       else
       {
    	   System.out.println("Not Working");
       }*/
    	
    	/*ProductDAO pd = new ProductDAO();
    	List<ProductDetail> lp = pd.getProductDetails();
    	for(ProductDetail p: lp)
    	{
    		System.out.println(p.getPdid()+" "+p.getPfeatures()+" "+p.getPdate()+" "+p.getParent().getpName());
    	}*/
    		
    		Customer c = new Customer();
    		c.setcName("Vinodh");
    		c.setcAge(25);
    		
    		Product p1 = new Product(0, null, null);
    		p1.setpName("Laptop");
    		p1.setpCost("60000");
    		
    		Product p2 = new Product(0, null, null);
    		p2.setpName("HeadSet");
    		p2.setpCost("4000");
    		
    		List<Product> l = new ArrayList<Product>();
    		l.add(p1);
    		l.add(p2);
    		
    		c.setProducts(l);
    		
    		CustomerDAO cd = new CustomerDAO();
    		cd.insertCustomer(c);
    		
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}

    }
    }

