package controller;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.dao.IProductDAO;
import model.daoimpl.ProductDAOImpl;
import model.entity.Product;

@Controller
public class ProductController {
	@RequestMapping(value="/addprodpage",method=RequestMethod.GET)
	public String addProductPage()
	{
		return "addproducts";
	}
	
	@RequestMapping(value="/addproducts",method=RequestMethod.POST)
	public String addProducts(@Valid @ModelAttribute("product1")Product p, BindingResult result)
	{
		boolean b = false;
		if(result.hasErrors())
		{
			return "addproducts";
		}
		else
		{
			IProductDAO pd = new ProductDAOImpl();
			b = pd.insertProduct(p);
		}
		if (b)
		{
			return "success";
		}
		else
		{
			return "addproducts";
		}
	}

}
