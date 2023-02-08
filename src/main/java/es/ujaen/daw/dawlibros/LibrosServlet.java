package es.ujaen.daw.dawlibros;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/libros")
public class LibrosServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String html= """
                <!DOCTYPE html>
                <html><body>
                    <h1> %s </h1>
                </body></html>
                """.formatted(message);
        out.println(html);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String titulo = request.getParameter("titulo");
        String isbn = request.getParameter("isbn");

        String html="""
            <!DOCTYPE html>
            <html><body><h1>Datos del libro (servlet)</h1>
                <div>Nombre: %s </div>
                <div>ISBN: %s </div>
            </body></html>
        """.formatted(titulo, isbn);
        response.getWriter().println(html);	    }

    public void destroy() {
    }
}