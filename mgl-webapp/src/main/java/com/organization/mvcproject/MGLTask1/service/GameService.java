package com.organization.mvcproject.MGLTask1.service;

import java.util.List;

import com.organization.mvcproject.MGLTask1.model.Game;

//TODO 1.0  follow java interface naming conventions, improve interface name
public interface GameService {

	List<Game> retrieveAllGames();

	Game saveGame(Game game);

}
