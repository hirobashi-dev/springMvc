package hbs.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hbs.bean.Student;
import hbs.dao.StudentDao;
import hbs.dao.StudentInsertDao;

@WebServlet("/studentsdl")
public class StudentsDlController  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String gende=req.getParameter("gende");
		String age=req.getParameter("age");
		String jyusyo=req.getParameter("jyusyo");

		//Student student =(Student)req.getSession().getAttribute("student");

		Student student= new Student(Integer.parseInt(id),name,gende,age.isEmpty()?0:Integer.parseInt(age),jyusyo);
		System.out.println(student);

		//学生登録
		new StudentInsertDao().register(student);

		//すべて学生取得
		req.setAttribute("students",new StudentDao().getStudents());

		req.getRequestDispatcher("/jsp/huanying.jsp").forward(req, resp);
	}
}
