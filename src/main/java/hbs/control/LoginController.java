package hbs.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hbs.bean.Login;
import hbs.bean.Student;
import hbs.dao.LoginDao;
import hbs.dao.StudentDao;

@Controller
public class LoginController{

	@RequestMapping("/")
	public String doIndex() throws Exception {
		return "login";
	}

	@RequestMapping("/login")
	public String dologin(Model model,Login login,HttpSession session) throws Exception {
//    	//文字コード
//    	req.setCharacterEncoding("UTF-8");
//
//    	//リクエストからパラメータ取得
//    	String username = req.getParameter("username");
//    	String password = req.getParameter("password");
//    	// String chek = req.getParameter("chek");

		String username = login.getUsername();
		String password = login.getPassword();

    	if(new LoginDao().chkLogin(username, password)) {
        	//studentデータ取得
        	List<Student> students=(new StudentDao()).getStudents();

        	//studentデータをリクエストコンテナへ保存
        	model.addAttribute("students", students);

        	//login情報session保管
            //HttpSession session=.getSession();

        	session.setAttribute("username", username);
        	session.setAttribute("password", password);

            //req.getRequestDispatcher("/jsp/huanying.jsp").forward(req, resp);

        	return "huanying";
    	}else {

           //req.getRequestDispatcher("/jsp/loginError.jsp").forward(req, resp);
    		return "loginError";
    	}

	}
}
