import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\meblo\\Desktop\\Robota\\OOP i MYSQL\\Servlety_Praca_Domowa-master\\src\\main\\java\\pl\\coderslab\\homeworks\\servlets2\\web\\text.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                out.println(s);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
