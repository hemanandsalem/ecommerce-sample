package com.ecommerce.Sample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.Sample.entity.CartProducts;
import com.ecommerce.Sample.entity.OrderDetails;
import com.ecommerce.Sample.entity.Product;
import com.ecommerce.Sample.entity.UserAccount;
import com.ecommerce.Sample.model.OrderDetailsModel;
import com.ecommerce.Sample.model.ProductModel;
import com.ecommerce.Sample.repository.UserRepository;
import com.ecommerce.Sample.service.CartService;
import com.ecommerce.Sample.service.OrderService;
import com.ecommerce.Sample.service.ProductService;



@RestController
@RequestMapping(path = "/ecommerce")
public class ShoppingController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	OrderService orderService;

	@GetMapping(path="/users")
	public @ResponseBody Iterable<UserAccount> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping(path="/cart")
	public @ResponseBody List<CartProducts> getAllCartValues(){
		return cartService.getAllCartProducts();
	}
	
	@RequestMapping(value= "/", method=RequestMethod.GET)
	public ModelAndView home(){
		return new ModelAndView("login");
	}
	
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("credentials") UserAccount user){
		userRepository.save(Arrays.asList(user));
		return getAllProducts();
	}
	
	@RequestMapping(value= "/products", method=RequestMethod.GET)
	public ModelAndView getAllProducts(){
		List<Product> productList = productService.getAllProducts(); 
		ProductModel productModel = new ProductModel();
		productModel.setProducts(productList);
		return new ModelAndView("all_products_list","productList",productModel);
	}
	
	@RequestMapping(value ="/orders", method=RequestMethod.GET)
	public ModelAndView getAllOrdersr(String username){
		List<OrderDetails> myOrders = orderService.viewMyOrders(username); 
		return new ModelAndView("my_orders","orderList",myOrders);
	}
	
	@RequestMapping(value= "/mycart/save", method=RequestMethod.POST)
	public ModelAndView saveToCart(@ModelAttribute("productModel") ProductModel cartDetails, String username){
		Product cartItem = cartDetails.getProducts().get(0);
		CartProducts cartProduct = new CartProducts("user01",cartItem.getProductId(), cartItem.getProductName(), cartItem.getPrice(), 2);
		cartService.addToCart(Arrays.asList(cartProduct));
		return getAllProducts();
	}
	
	@RequestMapping(value= "/mycart", method=RequestMethod.GET)
	public ModelAndView getAllCartProducts(String username){
		List<CartProducts> productList = cartService.getCartByUserName(username);
		return new ModelAndView("my_cart","productList",productList);
	}
	
//	@RequestMapping(value= "/login", method=RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("productModel") ProductModel cartDetails, String username){
//		return new ModelAndView("login","productList",cartDetails);
//	}
	
	@RequestMapping(value= "/mycart/placeorder", method=RequestMethod.POST)
	public void placeOrder(@ModelAttribute("orderDetails") OrderDetailsModel orderDetails){
		System.out.println("data received");
		
	}
	
}
