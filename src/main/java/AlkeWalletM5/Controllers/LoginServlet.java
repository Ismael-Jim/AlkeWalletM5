package AlkeWalletM5.Controllers;

import AlkeWalletM5.models.Usuario;
import AlkeWalletM5.Services.UsuarioService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UsuarioService usuarioService = new UsuarioService() {
        @Override
        public Usuario login(String correo, String password) {
            return null;
        }

        @Override
        public Usuario getUsuarioById(String UsuarioId) {
            return null;
        }

        @Override
        public void depositarFondos(String usuarioId, int cantidad) {

        }

        @Override
        public void retirarFondos(String usuarioId, int cantidad) {

        }

    };

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        Usuario usuario = usuarioService.getUsuarioById(correo); // Asume que tienes este método en UsuarioService
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            request.getSession().setAttribute("usuario", usuario);
            response.sendRedirect("menu.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}