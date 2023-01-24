import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Random random = new Random();
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(random.nextInt((100-1) + 1 ) + 1);
        }
        for (int i = 0; i < arrList.size(); i++) {
            out.print(arrList.get(i) + " ");
        }
        Collections.sort(arrList);
        out.println();
        for (int i = 0; i < arrList.size(); i++) {
            out.print(arrList.get(i) + " ");
        }
    }
}

