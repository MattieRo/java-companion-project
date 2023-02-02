package com.organization.mvcproject.service;

import java.util.List;

import com.organization.mvcproject.model.Game;

public interface GameService {

    //Retrieve
	List<Game> retrieveAllGames();
	//Create
	Game saveGame(Game game);
	
	Boolean deleteGame(Long gameId);
	
	Game updateGame(Game game);

}
