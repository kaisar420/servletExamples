import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Package Name : ${PACKAGE_NAME}
 * @Root Of Computer : mac
 * @Date : 2019/3/31
 * @Time : 10:19 PM
 * @Author Iparhan
 * @Company IparhanGeek
 * @Address Beijing
 */

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {

    private String message;
    @Override
    public void init() throws ServletException {
        message = "Hello world, New  Servlet";
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("utf-8");
        printWriter.write("Data===="+ message);
    }
}
