package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrintTableController {
@RequestMapping("/pt")
public String pt()
{
	return "printtable";
}
@RequestMapping("/ptlogic")
public ModelAndView ptlogic(HttpServletRequest request,HttpServletResponse response)
{
	int a=Integer.parseInt(request.getParameter("txtnum"));
	int i=1;
	String s="";
	while(i<=10)
	{	
		s=s+" "+a*i;
		
		i++;
	}
	return new ModelAndView("printtable","key",s);
		}

}
