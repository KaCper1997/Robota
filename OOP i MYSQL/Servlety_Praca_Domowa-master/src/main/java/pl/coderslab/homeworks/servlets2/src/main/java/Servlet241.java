import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Random random = new Random();
        int variable = random.nextInt(40);
        System.out.println(variable);
        String web = String.valueOf(variable);
        response.sendRedirect("http://localhost:8080/web_war_exploded/servlet242?productId=" + web);
    }
}
