import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String startParam  = request.getParameter("start");
        String endParam  = request.getParameter("end");
        if (startParam == null && endParam == null) {
            System.out.println("BRAK");
        }else {
            System.out.println("Start param =" + startParam);
            System.out.println("Start end =" + endParam);
        }
        }
}
