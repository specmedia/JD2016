package by.it.sinkevich.project.java;

import javax.servlet.http.HttpServletRequest;

public class CommandLogin implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        return Action.LOGIN.startPage;
    }
}
