package com.organization.mvcproject.MGLTask1.model;

import org.springframework.stereotype.Component;

@Component
public class Game {

	/**
	 * TODO 1.0 java object member variable naming convention declared here are not object oriented,
	 *  rename the variables, and their setter/getter methods to match convention. 
	 */
	private Long gameId;
	private String gameName;
	private String gameGenre;

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long game_Id) {
		this.gameId = game_Id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String game_Name) {
		this.gameName = game_Name;
	}

	public String getGameGenre() {
		return gameGenre;
	}

	public void setGameGenre(String game_Genre) {
		this.gameGenre = game_Genre;
	}

}
