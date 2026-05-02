package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Основной класс логики игры.
 * Использует HttpSession для хранения состояний игры
 *
 */

@WebServlet("/game")
public class GameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String stepId = req.getParameter("step");

        if (stepId == null || stepId.isBlank()) {
            stepId = "start";
        }

        session.setAttribute("playerName", req.getParameter("playerName"));
        req.setAttribute("step", stepId);

        req.getRequestDispatcher("/game.jsp").forward(req, resp);

//        if ("accept".equals(stepId)) {
//            req.setAttribute("result", "resukt 1");
//        } else {
//            req.setAttribute("result", "resultat 2");
//        }
//
//        resp.sendRedirect(req.getContextPath() + "/result.jsp");
    }
}
