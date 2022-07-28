package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.demo.model.CartInfo;
import com.example.demo.service.UserDetailsServiceImpl;

public class Utils {
	
	private static final Logger LOGGER = LogManager.getLogger(Utils.class);
	
	 
	   // Products in the cart, stored in Session.
	   public static CartInfo getCartInSession(HttpServletRequest request) {
	 
	      CartInfo cartInfo = (CartInfo) request.getSession().getAttribute("myCart");
	 
	    
	      if (cartInfo == null) {
	         cartInfo = new CartInfo();
	          
	         request.getSession().setAttribute("myCart", cartInfo);
	      }
	 
	      return cartInfo;
	   }
	 
	   public static void removeCartInSession(HttpServletRequest request) {
	      request.getSession().removeAttribute("myCart");
	   }
	 
	   public static void storeLastOrderedCartInSession(HttpServletRequest request, CartInfo cartInfo) {
	      request.getSession().setAttribute("lastOrderedCart", cartInfo);
	   }
	 
	   public static CartInfo getLastOrderedCartInSession(HttpServletRequest request) {
	      return (CartInfo) request.getSession().getAttribute("lastOrderedCart");
	   }
	    
	}
