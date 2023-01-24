import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String widthParam = request.getParameter("width");
        String heightParam = request.getParameter("height");
        if (widthParam == null && heightParam == null) {
            int w = 5;
            int h = 10;
            out.format("   ");
            for (int i = 1; i <= w; i++) {
                out.format("%5d", i);
            }
            out.println();
            for (int i = 1; i <= h; i++) {
                out.format("%3d", i);
                for (int j = 1; j <= w; j++) {
                    int y = i * j;
                    out.format("%5d", i * j);
                }
                out.println();
            }
        } else {
            int w = Integer.parseInt(widthParam);
            int h = Integer.parseInt(heightParam);
            out.format("   ");
            for (int i = 1; i <= w; i++) {
                out.format("%5d", i);
            }
            out.println();
            for (int i = 1; i <= h; i++) {
                out.format("%3d", i);
                for (int j = 1; j <= w; j++) {
                    int y = i * j;
                    out.format("%5d", i * j);
                }
                out.println();
            }
        }
    }
}
