package AlkeWalletM5.Controllers;

import AlkeWalletM5.Repositories.UsuarioRepositoryImpl;
import AlkeWalletM5.Services.UsuarioService;
import AlkeWalletM5.Services.UsuarioServiceImpl;
import AlkeWalletM5.models.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/usuario")
public class UsuarioController extends HttpServlet {

    private UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioServiceImpl(new UsuarioRepositoryImpl()) {
            @Override
            public Usuario login(String correo, String password) {
                return null;
            }
        };
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuarioId = request.getParameter("id");
        Usuario usuario = usuarioService.getUsuarioById(usuarioId);
        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuarioId = request.getParameter("id");
        String accion = request.getParameter("accion");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));

        if ("depositar".equals(accion)) {
            usuarioService.depositarFondos(usuarioId, cantidad);
        } else if ("retirar".equals(accion)) {
            try {
                usuarioService.retirarFondos(usuarioId, cantidad);
            } catch (IllegalArgumentException e) {
                request.setAttribute("error", e.getMessage());
            }
        }

        response.sendRedirect("/usuario?id=" + usuarioId);
    }
}