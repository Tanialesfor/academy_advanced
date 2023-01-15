package by.htp.ex.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.ex.controller.impl.DoAddNews;
import by.htp.ex.controller.impl.DoDeleteNews;
import by.htp.ex.controller.impl.DoEditNews;
import by.htp.ex.controller.impl.DoSIgnIn;
import by.htp.ex.controller.impl.DoSignOut;
import by.htp.ex.controller.impl.GoToAddNews;
import by.htp.ex.controller.impl.GoToBasePage;
import by.htp.ex.controller.impl.GoToErrorPage;
import by.htp.ex.controller.impl.GoToNewsList;
import by.htp.ex.controller.impl.GoToRegistrationPageCommand;
import by.htp.ex.controller.impl.GoToViewNews;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_BASE_PAGE, new GoToBasePage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPageCommand());
		commands.put(CommandName.DO_SIGN_IN, new DoSIgnIn());
		commands.put(CommandName.DO_SIGN_OUT, new DoSignOut());
		commands.put(CommandName.GO_TO_NEWS_LIST, new GoToNewsList());
		commands.put(CommandName.GO_TO_VIEW_NEWS, new GoToViewNews());
		commands.put(CommandName.GO_TO_ADD_NEWS, new GoToAddNews());
		commands.put(CommandName.GO_TO_ERROR_PAGE, new GoToErrorPage());
		commands.put(CommandName.DO_DELETE_NEWS, new DoDeleteNews());
		commands.put(CommandName.DO_ADD_NEWS, new DoAddNews());
		commands.put(CommandName.DO_EDIT_NEWS, new DoEditNews());
	}

	public Command getCommand(String name) {

		Command command;
		try {
			CommandName commandName = CommandName.valueOf(name.toUpperCase());
			command = commands.get(commandName);
			return command;
		} catch (Exception e) {
			command = commands.get(CommandName.GO_TO_ERROR_PAGE);
			return command;
		}

	}
}
