package Caculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcInhance")
public class CalculatorInhance extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String addNum1String = req.getParameter("num1");
        String addNum2String = req.getParameter("num2");
        String mulNum1String = req.getParameter("num3");
        String mulNum2String = req.getParameter("num4");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Sign up</title>\n" +
                "    <link href=\"resources/style.css\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<fieldset>\n" +
                "    <legend>Calculator</legend>\n" +
                "    <form action=\"calc2\" method=\"get\">\n" +
                "\n" +
                "        <div class=\"input_line\">\n" +
                "            <input type=\"number\" name=\"add_num1\" value=" + addNum1String + ">\n" +
                "            +\n" +
                "            <input type=\"number\" name=\"add_num2\" value=" + addNum2String + ">\n" +
                "            =\n" +
                "            <input type=\"number\" value=\"");


        if (addNum1String != null && addNum2String != null && addNum1String != "" && addNum2String != "") {
            int addNum1 = Integer.parseInt(addNum1String);
            int addNum2 = Integer.parseInt(addNum2String);
            out.print(addNum1 + addNum2);

        }
        out.print("\">\n" +
                "\n" +
                "        </div>\n" +
                "        </div>\n" +
                "        <br>\n" +
                "        <div class=\"input_line\">\n" +
                "            <input type=\"number\" name=\"mul_num1\" value=" + mulNum1String + ">\n" +
                "            *\n" +
                "            <input type=\"number\" name=\"mul_num2\" value=" + mulNum2String + ">\n" +
                "            =\n" +
                "            <input type=\"number\" value=\"");
        if (mulNum1String != null && mulNum2String != null && mulNum1String != "" && mulNum2String != "") {
            int mulNum1 = Integer.parseInt(mulNum1String);
            int mulNum2 = Integer.parseInt(mulNum2String);
            out.print(mulNum1 * mulNum2);
        }
        out.print("\">\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"input_line\">\n" +
                "            <input class=\"input-submit\" type=\"submit\" value=\"Submit\">\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</fieldset>\n" +
                "</body>\n" +
                "</html>");
        out.print("</body></html>");
	}

}
