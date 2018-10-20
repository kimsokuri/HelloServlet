package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트가 요청하면 이 메소드가 호출된다.
		//위의 매개변수는 우리가 만든 객체가 아니고 기본으로 있는것
		//request에는 form데이터 ; 사용자가 입력한 값 읽기
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//index.html에서 보낸 name값과 파라미터값이 일치해야한다!
		
		//Build Html code //만들어서 클라이언트에게 넘겨주자 (view)
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse +="<h2> your uesr name is"+ username + "<br/>";
		htmlResponse += "your password is "+ password +"</h2>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse); //htmlResponse (string)의 내용이 html로 변환대서 나옴

	}

}
