import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        File file = new File("text.txt");
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            lines.forEach(out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
