import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/weightcalc")
public class WeightConverterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        CalcWeights calcWeights = new CalcWeights();
        writer.println("<h1>Podana wartość w przeliczeniu na:<br>");
        if (kilograms.equals("") && grams.equals("") && miligrams.equals("")) {
            writer.println("Nie wprowadzono żadnej warości.");
        } else {
            if (grams.equals("") && miligrams.equals("")) {
                writer.println("<h2>kilogramy: " + kilograms + "<br><br>");
                double cent = calcWeights.countGramsFromKilograms(kilograms);
                writer.println("gramy: " + cent + " <br><br>");
                double mili = calcWeights.countMiligramsFromKilograms(kilograms);
                writer.println("miligramy: " + mili + " </h3>");
            } else if (kilograms.equals("") && miligrams.equals("")) {
                writer.println("<h2>kilogramy: " + calcWeights.countKilogramsFromGrams(grams) + "<br><br>");
                writer.println("gramy: " + grams + " <br><br>");
                writer.println("miligramy: " + calcWeights.countMiligramsFromGrams(grams) + " </h3>");
            } else {
                writer.println("<h2>kilogramy: " + calcWeights.countKilogramsFromMiligrams(miligrams) + "<br><br>");
                writer.println("gramy: " + calcWeights.countGramsFromMiligrams(miligrams) + " <br><br>");
                writer.println("miligramy: " + miligrams + " </h3>");
            }
        }
    }
}
