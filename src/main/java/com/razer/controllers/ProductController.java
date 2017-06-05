package com.razer.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.razer.iservice.CategoriesIService;
import com.razer.iservice.IService;
import com.razer.iservice.SupplierIService;
import com.razer.model.ProductList;


@Controller
public class ProductController {

	@Autowired
	IService iservice;

	@Autowired
	CategoriesIService cis;

	@Autowired
	SupplierIService sis;
	
	static int count= 1;
	String prod_name;
	float prod_price;
	
	

	@RequestMapping("managep")
	public ModelAndView manage() {
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);

		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;
	}

	@RequestMapping(value = "addproduct", method = RequestMethod.POST)
	public ModelAndView addproduct(ProductList prod) {
		if( count !=0 && prod.getProduct_name()!= prod_name && prod.getProduct_price() != prod_price){
		iservice.addProduct(prod);
		count = 0;
		prod_name = prod.getProduct_name();
		prod_price = prod.getProduct_price();
		
		String path = "C:\\Users\\Harsh\\workspace\\razer\\src\\main\\webapp\\res\\prod_images\\";
		path = path+String.valueOf(prod.getProduct_id())+".jpg";
		File f = new File(path);///
		MultipartFile mfile = prod.getProduct_image();
		if(!mfile.isEmpty())
		{
			try{
			byte[] b=mfile.getBytes();
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(b);
			bos.close();
				
			}catch(Exception e){
				System.out.println("Error in Upload"+e);
			}
			
		}
		else{
			System.out.println("File is Empty");
		}
				}
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
         count=1;
		return mvc;

	}

	@RequestMapping(value = "deletep", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@RequestParam("product_id") int prodid) {
		iservice.delete(prodid);
		String path = "C:\\Users\\Harsh\\workspace\\razer\\src\\main\\webapp\\res\\prod_images\\";
		path = path+String.valueOf(prodid)+".jpg";
		File f = new File(path);
		try{
			f.delete();
		}catch(Exception e ){
			System.out.println("Error File Not Deleted"+e);
		}
		
		
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);

		return mvc;
	}

	@RequestMapping(value = "updateprod", method = RequestMethod.GET)
	public ModelAndView updateproduce(@RequestParam("product_id") int prodid) {
		ProductList pl = iservice.fetchproduct(prodid);
		
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", pl);
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		mvc.addObject("userClickedUpdateProduct", "true");
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;

	}

	@RequestMapping(value = "validp", method = RequestMethod.POST)
	public ModelAndView addtodb(ProductList pl) {
		pl.setProduct_status("Enabled");
		iservice.updateProduct(pl);
		
		String path = "C:\\Users\\Harsh\\workspace\\razer\\src\\main\\webapp\\res\\prod_images\\";
		path = path+String.valueOf(pl.getProduct_id())+".jpg";
		File f = new File(path);
		MultipartFile mfile = pl.getProduct_image();
		if(!mfile.isEmpty())
		{
			try{
				byte[] b = mfile.getBytes();
				FileOutputStream fos = new FileOutputStream(f);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				bos.write(b);
				bos.close();
				
				
			}catch(Exception e){
				System.out.println("Error in Image Upload"+e);
			}
			
		}else{
			System.out.println("File is Empty");
		}
		
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;

	}

	@RequestMapping(value = "status_enable_product", method = RequestMethod.GET)
	public ModelAndView enablecat(@RequestParam("product_id") int id) {
		String status = "Enabled";
		iservice.setProductStatus(id, status);
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;
	}

	@RequestMapping(value = "status_disable_product", method = RequestMethod.GET)
	public ModelAndView disablecat(@RequestParam("product_id") int id) {
		String status = "Disabled";
		iservice.setProductStatus(id, status);
		ModelAndView mvc = new ModelAndView("ManageProduct", "mp", new ProductList());
		String productlist = iservice.retriveProduct();
		mvc.addObject("prodlist", productlist);
		
		String categorylist = cis.retrieveCategories();
		mvc.addObject("catobj", categorylist);

		String supplierlist = sis.retriveProduct();
		mvc.addObject("suppobj", supplierlist);
		return mvc;

	}

}
