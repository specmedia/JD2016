package by.it.belsky.project.java;

import javax.servlet.http.HttpServletRequest;

public class CommandLogout implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        return Action.LOGOUT.inPage;
    }
}
