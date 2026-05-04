package controller;

import model.QuestStep;
import service.QuestService;

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

    private final QuestService service = new QuestService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String stepId = req.getParameter("step");

        if (stepId == null || stepId.isBlank()) {
            stepId = "start";
        }

        QuestStep step = service.getStep(stepId);


        req.setAttribute("step", step);

        if (service.isFinalStep(step)){
            req.getRequestDispatcher("/result.jsp").forward(req, resp);
            return;
        }

        req.getRequestDispatcher("/game.jsp").forward(req, resp);
    }
}
