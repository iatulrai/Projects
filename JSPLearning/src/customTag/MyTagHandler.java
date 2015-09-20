package customTag;

import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport {

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();// return the instance of JspWritter
		
		try{
			out.print(Calendar.getInstance().getTime());
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		return SKIP_BODY; 
	}

}
