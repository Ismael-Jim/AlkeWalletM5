package AlkeWalletM5.Controllers;

import AlkeWalletM5.Services.MonedaService;
import AlkeWalletM5.Services.MonedaServiceImpl;
import AlkeWalletM5.Repositories.MonedaRepositoryImpl;
import AlkeWalletM5.models.Moneda;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/moneda")
public class MonedaServlet extends HttpServlet {

    private MonedaService monedaService;

    public MonedaServlet() {
        this.monedaService = new MonedaServiceImpl(new MonedaRepositoryImpl());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Moneda> monedas = monedaService.getAllMonedas();
        request.setAttribute("monedas", monedas);
        request.getRequestDispatcher("/sendmoney.jsp").forward(request, response);
    }
}