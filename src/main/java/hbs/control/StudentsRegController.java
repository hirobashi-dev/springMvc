package hbs.control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import hbs.bean.Student;
import hbs.dao.StudentDao;
import hbs.dao.StudentInsertDao;

@Controller
public class StudentsRegController{

	@RequestMapping("/Studentsinit")
	public String Studentsinit(){
		return "studentsReg";
	}


	@RequestMapping("/StudentsReg")
	public String StudentsReg(String id,String name,String gende,String age,String jyusyo,Model model){

		if(id.isEmpty() || name.isEmpty()) {

			model.addAttribute("massage", "学生idと姓名を入力してください。");
			model.addAttribute("err", "1");
		}else {
			model.addAttribute("err", "0");
			Student st= new Student(Integer.parseInt(id),name,gende,age.isEmpty()?0:Integer.parseInt(age),jyusyo);
			model.addAttribute("student", st);

          //model.addSession().setAttribute("student", st);
		  //getSession().setAttribute("student", st);

		}

		return "studentsConfim";
	}

	@RequestMapping("/studentsdl")
	public String studentsdl(String id,String name,String gende,String age,String jyusyo,Model model) {

		Student student= new Student(Integer.parseInt(id),name,gende,age.isEmpty()?0:Integer.parseInt(age),jyusyo);
		System.out.println(student);

		//学生登録
		new StudentInsertDao().register(student);

		//すべて学生取得
		model.addAttribute("students",new StudentDao().getStudents());

		return "huanying";
	}


	public HttpSession getSession() {
		ServletRequestAttributes ras=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		return ras.getRequest().getSession();
	}
}
