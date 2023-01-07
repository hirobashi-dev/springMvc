package hbs.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hbs.bean.Chengji;
import hbs.dao.RegisterDao;

@Controller
public class RegisterController{

	@RequestMapping("/registerres")
	public String registerres() {
		return "register";
	}

	@RequestMapping("/register")
	public String register(String STUDENT_ID, String SUBJECT,String SCORE,Model model) throws Exception  {

//		String STUDENT_ID=req.getParameter("STUDENT_ID");
//		String SUBJECT=req.getParameter("SUBJECT");
//		String SCORE=req.getParameter("SCORE");

		if(STUDENT_ID.isEmpty() || SUBJECT.isEmpty() || SCORE.isEmpty()) {

			model.addAttribute("massage", "画面内容を入力してください。");
			return "register";

		}else {

			Chengji chengji=new Chengji(Integer.parseInt(STUDENT_ID),SUBJECT,Integer.parseInt(SCORE));

			new RegisterDao().register(chengji);

	//    	//成績データ取得
	//    	List<Chengji> chengji=new ChengjiDao().getChengji(Integer.parseInt(STUDENT_ID));
	//
	//    	//Chengjiデータをリクエストコンテナへ保存
	//    	req.setAttribute("chengji", chengji);
	//
	//		req.setAttribute(getServletName(), resp);
	//		req.getRequestDispatcher("/jsp/chengji.jsp").forward(req, resp);

			//resp.sendRedirect("/springMvc/chengji?id="+STUDENT_ID);

			return "redirect:/chengji?id="+chengji.getSTUDENT_ID();
		}

	}
}
