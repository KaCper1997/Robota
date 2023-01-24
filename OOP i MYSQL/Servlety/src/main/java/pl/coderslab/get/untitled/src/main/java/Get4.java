import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("get4.html");
    }
      /*  String str = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>sendRedirect example</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <a href = \"http://localhost:8080/get5?company=coderslab&learn=php&learn=java&learn=ruby&learn=python\" >Odwolanie</a>\n" +
                "</body>\n" +
                "</html>";
        response.getWriter().append(str);
    */

    }



