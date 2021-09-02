package com.going1h.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormEx() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet �޼��尡 �����");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println("doPost �޼��尡 �����");
		
		request.setCharacterEncoding("euc-kr");
		
		String name = request.getParameter("name");   // �̸� �Ķ���Ͱ� ��������
		String id = request.getParameter("id");		  // id �Ķ���Ͱ� ��������
		String password = request.getParameter("pw"); // pw �Ķ���Ͱ� ��������
		
		String[] hobbys = request.getParameterValues("hobby"); // ��̴� �������ϱ� �迭�� ���� getParameterValues �޼���� �޾ƿ�
		String major = request.getParameter("major");		   // 
		String protocol = request.getParameter("protocol");	   // 
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���." + name + "�� �ݰ����ϴ�." + "<br>");
		writer.println("�Է��Ͻ� �Ʒ� ���������� Ȯ���Ͻñ� �ٶ��ϴ�.<br>");
		writer.println("�̸� : " + name + "<br>");
		writer.println("ID : " + id + "<br>");
		writer.println("Password : " + password + "<br>");
		writer.println("��� : " + Arrays.toString(hobbys) + "<br>"); // hobbys�� �迭�̱⿡ Arrays.toString ���
		writer.println("���� : " + major + "<br>");
		writer.println("�������� : " + protocol + "<br>");
		writer.println("</body></html>");
		writer.close();
	}

}
