import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/distancecalc")
public class DistanceConverterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String meters = request.getParameter("meters");
        String centimeters = request.getParameter("centimeters");
        String milimeters = request.getParameter("milimeters");


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        CalcMeters calcMeters = new CalcMeters();
        writer.println("<h1>Podana wartość w przeliczeniu na:<br>");
        if (meters == "" && centimeters == "" && milimeters == "") {
            writer.println("Nie wprowadzono żadnej warości.");
        } else {
            if (centimeters == "" && milimeters == "") {
                writer.println("<h2>metry: " + meters + "<br><br>");
                double cent = calcMeters.countCentimetersFromMeters(meters);
                writer.println("centymetry: " + cent + " <br><br>");
                double mili = calcMeters.countMilimetersFromMeters(meters);
                writer.println("milimetry: " + mili + " </h3>");
            } else if (meters == "" && milimeters == "") {
                writer.println("<h2>metry: " + calcMeters.countMetersFromCentimeters(centimeters) + "<br><br>");
                writer.println("centymetry: " + centimeters + " <br><br>");
                writer.println("milimetry: " + calcMeters.countMilimetersFromCentimeters(centimeters) + " </h3>");
            } else {
                writer.println("<h2>metry: " + calcMeters.countMetersFromMilimeters(milimeters) + "<br><br>");
                writer.println("centymetry: " + calcMeters.countCentimetersFromMilimeters(milimeters) + " <br><br>");
                writer.println("milimetry: " + milimeters + " </h3>");
            }
        }
    }
}
