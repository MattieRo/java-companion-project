package com.organization.mvcproject.api.dao;

import java.util.List;

import com.organization.mvcproject.api.model.Game;

public interface GameDao {

    List<Game> retrieveAllGames();

    Game saveGame(Game game);

    Boolean deleteGameByIdgameId(Long idOfGameToDelete);

    Game findGameById(Long gameIdToFind);

}
