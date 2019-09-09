package com.greenish_orchid.util;

/**
 * @author CFC
 *
 *	时间2019年9月7日
 */
public class StringUtils {

	
	private StringUtils(){}
	
	/**
	 * @param 参数为输入的字符串，验证是否为空
	 */
	private static boolean isEmpty(String str){
		if(str==null || "".equals(str.trim())){
			return true;
		}
		return false;
	}
	/**
	 * @param 参数为字符串
	 * @return 返回结果为被替换后的字符串内容
	 */
	public static String replace(String context){
		if(!isEmpty(context)){
			context = context.replaceAll("\\\\r\\\\n", "<p></p>");
			context = context.replaceAll("\\\\n", "<br/>");
			
			return context;
		}
		return "";
	}
	
	/**
	 * @param 参数为输入的手机号
	 */
	public static boolean isPhone(String phone){
		return phone.matches("^1[3|5|6|7|8]\\d{9}$");
	}
	
	/**
	 * @param 参数为验证的邮箱号
	 */
	public static boolean isEmail(String email){
		return email.matches("^\\w+@\\w+(.com|.com.cn)$");
	}
}
