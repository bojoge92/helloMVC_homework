package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.CustomerService;
import model.Customer;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doResgister doPost");
		
		String customerId = request.getParameter("id");
		String passwd = request.getParameter("password");
		String cusName = request.getParameter("name");
		String cusGender = request.getParameter("gender_check");
		String cusEmail = request.getParameter("email");
		
		List<Customer> customers = new ArrayList<>();
		/*customers.add(new Customer(customerId, passwd, cusName, cusGender, cusEmail));
		
		customers.add(new Customer("test", "test1", "testName", "Women", "test@test.com"));*/
		
		CustomerService service = (CustomerService) CustomerService.getInstance();
		
		service.addCustomer(new Customer(customerId, passwd, cusName, cusGender, cusEmail));
		
		/*
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(customerId, passwd, cusName, cusGender, cusEmail));
		
		customers.add(new Customer("test", "test1", "testName", "Women", "test@test.com"));
		
		System.out.println("success registering customer");
		*/
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
		
	}

}
