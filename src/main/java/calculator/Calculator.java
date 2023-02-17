package calculator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator 
{
@RequestMapping("add")
public ModelAndView addition(@RequestParam int num1,@RequestParam int num2){
	ModelAndView andView = new ModelAndView();
	 andView.addObject("num1",num1);
	 andView.addObject("num2",num2);
	 andView.addObject("result",num1+num2);
	 andView.addObject("msg","Addition");
	 andView.setViewName("Result.jsp");
	 return andView;
	//int num1=Integer.parseInt(request.getParameter("num1"));
	//int num2=Integer.parseInt(request.getParameter("num2"));
	//response.getWriter().print("<h1>The sum of "+num1+" and "+num2+" is "+(num1+num2)+"</h1>");
}
@RequestMapping("sub")
public ModelAndView subtraction(@RequestParam int num1,@RequestParam  int num2)
{
	ModelAndView andView = new ModelAndView();
	 andView.addObject("num1",num1);
	 andView.addObject("num2",num2);
	 andView.addObject("result",num1-num2);
	 andView.addObject("msg","subtraction");
	 andView.setViewName("Result.jsp");
	 return andView;
}
@RequestMapping("mul")
public ModelAndView multiplication(@RequestParam int num1,@RequestParam  int num2)
{
ModelAndView andView = new ModelAndView();
andView.addObject("num1",num1);
andView.addObject("num2",num2);
andView.addObject("result",num1*num2);
andView.addObject("msg","multiplication");
andView.setViewName("Result.jsp");
return andView;
}
@RequestMapping("div")
public ModelAndView division(@RequestParam int num1,@RequestParam  int num2)
{
	 ModelAndView andView = new ModelAndView();
	 andView.addObject("num1",num1);
	 andView.addObject("num2",num2);
	 andView.addObject("result",num1/num2);
	 andView.addObject("msg","Division");
	 andView.setViewName("Result.jsp");
	 return andView;
}
}