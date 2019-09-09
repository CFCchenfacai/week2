package com.greenish_orchid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.greenish_orchid.util.StringUtils;

/**
 * @author CFC
 *
 *	时间2019年9月7日
 */
@Controller
public class FormVController {

	@RequestMapping("testForm.do")
	@ResponseBody
	public int testForm(String context,String phone,String email){
		System.out.println(context+phone+email+"**********************8");
		String replace = StringUtils.replace(context);
		
		System.out.println(replace);
		
		if(StringUtils.isPhone(phone)){
			System.out.println("手机号格式正确");
		}else{
			System.out.println("手机号格式错误");
		}
		
		if(StringUtils.isEmail(email)){
			System.out.println("邮箱格式正确");
		}else{
			System.out.println("邮箱格式错误");
		}
		
		if("".equals(replace)){
			return 0;
		}
		return 1;
	}
}
