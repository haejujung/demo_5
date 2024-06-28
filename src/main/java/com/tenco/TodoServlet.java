package com.tenco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 // 주소설계 http://127.0.0.1:8080/demo_5/todo1
@WebServlet("/todo1")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TodoServlet() {
        super();
       
    }

	// get 요청시 동작
    // 주소설계 - http://localhost:8080/d5/todo-servlet ??
    // http://127.0.0.1/d5/todo-servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 확인");
		
		Todo todo1 = new Todo();
		todo1.setId(100);
		todo1.setTitle("json 해줘 제발");
		todo1.setCompleted(false);
		
		//Gson lib 사용 가능
		
		response.setContentType("application/json");
		String strJson = "{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"title\": \"delectus aut autem\",\r\n"
				+ "  \"completed\": false\r\n"
				+ "}";
		PrintWriter pw = response.getWriter();
		pw.print(todo1.toString());
		
		
	}


	//  post 요청 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
