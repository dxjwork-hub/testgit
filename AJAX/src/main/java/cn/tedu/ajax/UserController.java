package cn.tedu.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("login.do")
	@ResponseBody
	public JsonResult login(
			@RequestParam(name = "username")String username,
			@RequestParam(name = "password")String password) {
		Integer state;
		String message;
		if("root".equals(username)) {
			if("1234".equals(password)) {
				state=1;
				message="��½�ɹ�";
			}else {
			state=2;
			message="�������";
			}
		}else {
		state=3;
		message="�û�������";
		}
		JsonResult jsonResult=new JsonResult();
		jsonResult.setState(state);
		jsonResult.setMessage(message);
		return jsonResult;
	}
}
