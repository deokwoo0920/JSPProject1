package controller;

import java.io.IOException;
import java.util.List;

import dto.Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cartList.do")
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> cartList = List.of(
                new Product("키보드", 20000, 4),
                new Product("USB", 15000, 20),
                new Product("Laptop", 1000000, 2),
                new Product("마우스", 10000, 15));

        req.setAttribute("cartList", cartList);
        RequestDispatcher dp = req.getRequestDispatcher("WEB-INF/views/cartSummary.jsp");
        dp.forward(req, resp);

    }

}
