package AlkeWalletM5.Controllers;

import AlkeWalletM5.Services.TransaccionService;
import AlkeWalletM5.Services.TransaccionServiceImpl;
import AlkeWalletM5.Repositories.TransaccionRepositoryImpl;
import AlkeWalletM5.models.Transaccion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/transactions")
public class TransaccionController extends HttpServlet {

    private TransaccionService transaccionService;

    public TransaccionController() {
        this.transaccionService = new TransaccionServiceImpl(new TransaccionRepositoryImpl());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuarioId = request.getParameter("usuarioId");
        List<Transaccion> transacciones = transaccionService.getTransaccionesByUsuarioId(usuarioId);
        request.setAttribute("transactions", transacciones);
        request.getRequestDispatcher("/transactions.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Manejo de guardar nueva transacción
        String remitenteId = request.getParameter("remitenteId");
        String receptorId = request.getParameter("receptorId");
        int importe = Integer.parseInt(request.getParameter("importe"));
        String divisaId = request.getParameter("divisaId");

        Transaccion transaccion = new Transaccion();
        transaccion.setTransaccionId(/* Generar ID único */);
        transaccion.setRemitenteUsuarioId(remitenteId);
        transaccion.setReceptorUsuarioId(receptorId);
        transaccion.setImporte(importe);
        transaccion.setFechaTransaccion(new java.util.Date());
        transaccion.setDivisaId(divisaId);

        transaccionService.saveTransaccion(transaccion);
        response.sendRedirect("/transacciones?usuarioId=" + remitenteId);
    }
}