package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException {
        String ipAddress = req.getHeader("X-FORWARDED-FOR");
        String br = req.getHeader("user-agent");
        PrintWriter out = resp.getWriter();

        if (ipAddress == null || ipAddress.isEmpty()) {
            ipAddress = req.getRemoteAddr();
            out.print(ipAddress);

            out.println(br);

        }
    }

}
