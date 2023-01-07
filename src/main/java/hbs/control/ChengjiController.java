package hbs.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hbs.bean.Chengji;
import hbs.bean.ChengjiImpl;
import hbs.dao.ChengjiDao;
import hbs.dao.ChengjiImplDao;
import hbs.dao.ChengjidelDao;
import hbs.dao.NamegetDao;

@Controller
public class ChengjiController{

	@RequestMapping("/chengji")
	public String chengji(Model model,String id)
	throws Exception{

    	//成績データ取得
    	List<Chengji> chengji=new ChengjiDao().getChengji(Integer.parseInt(id));

    	//名前取得
    	String name=new NamegetDao().getName(Integer.parseInt(id));

    	//Chengjiデータをリクエストコンテナへ保存
    	model.addAttribute("chengji", chengji);
    	model.addAttribute("name", name);

		return "chengji";

	}

	//全員成績一覧取得
	@RequestMapping("/chengjilist")
	public String chengjilist(Model model) {
		//成績データ取得
		List<ChengjiImpl> Chengjilist=new ChengjiImplDao().getChengji();
		model.addAttribute("chengjilist", Chengjilist);
		return "chengjiList";
	}

	//成績削除
	@RequestMapping("/chengjidel")
	public String chengjidel(String[] chenk,Model model) {
		if(chenk!=null && chenk.length!=0) {
			List<ChengjiImpl> dellist=new ArrayList<ChengjiImpl>();
			//成績データ取得
			List<ChengjiImpl> Chengjilist=new ChengjiImplDao().getChengji();
			for (String index : chenk) {
				dellist.add(Chengjilist.get(Integer.parseInt(index)));
			}
			//成績削除
			new ChengjidelDao().deldao(dellist);
		}
		return "redirect:/chengjilist";
	}


	//成績削除2
	@RequestMapping("/chengjidel2")
	public String chengjidel(String[] chenk,String[] STUDENT_ID,String[] NAME,Model model) {
		System.out.println(STUDENT_ID);

		return "redirect:/chengjilist";
	}


}
