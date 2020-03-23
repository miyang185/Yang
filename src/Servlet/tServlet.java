package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import Javabean.Yi;


public class tServlet extends HttpServlet {
	

	/**
	 * 特有id号
	 */
	private static final long serialVersionUID = 1L;
    Dao dao = new Dao();
    /**
     * 方法选择
     * @return 
     * @throws IOException 
     * @throws ServletException 
     */
    protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
    {
    	req.setCharacterEncoding("utf-8");
    	String method = req.getParameter("method");
    	if("search".equals(method)) {
    		search(req,resp);
    	}
  }
    private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String lastupdateTime = req.getParameter("Date");
		List<Yi> yis = dao.search(lastupdateTime);
		req.setAttribute("yis", yis);
		req.getRequestDispatcher("liulan.jsp").forward(req, resp);
		
  }
}
