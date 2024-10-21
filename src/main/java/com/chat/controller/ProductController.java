package com.chat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.chat.doa.ItemDAO;
import com.chat.doa.ItemDAOImpl;
import com.chat.entity.Item;

//@WebServlet(name = "ProductController", urlPatterns = { "/" }, loadOnStartup = 1)
public class ProductController extends HttpServlet {
	
	
	private ItemDAO productDAO;
	
	
	@Override
	public void init() throws ServletException {
		productDAO = new ItemDAOImpl();
	}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	// Redirect to index.jsp on first access
//        String requestURI = request.getRequestURI();
//        if (requestURI.equals(request.getContextPath() + "/")) {
//            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
//            return; // Stop further processing
//        }
    	
    	List<Item> itemList = new ArrayList<>();
    	
    	itemList = productDAO.getAllItems();
    	
    	request.setAttribute("productList", itemList);
    
        // Forwarding to Product.jsp
        request.getRequestDispatcher("/WEB-INF/product.jsp").forward(request, response);
    }
}
