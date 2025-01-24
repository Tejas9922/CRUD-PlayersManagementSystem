package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Player;

public class PlayerDAO {
	private List<Player> players;

	public PlayerDAO() {
		players = new ArrayList();

		players.add(new Player(1, "Virat", "India", "Batsman",99));
		players.add(new Player(2, "Rohit", "India", "Batsman",98));
		players.add(new Player(3, "stokes", "Australia", "Batsman",97));
		players.add(new Player(4, "Gayle", "WestIndies", "Batsman",96));
		players.add(new Player(5, "Bumrah", "India", "Bowler",95));

	}

	public List<Player> getallplayers() {

		return players;
	}

	public void addplayers(Player player) {
		players.add(player);
	}

	public Player getplayerbyid(int id) {
		for (Player player : players) {
			if (player.getId() == id) {
				return player;
			}
		}
		return null;

	}

	public List<Player> getplayerbyteam(String team) {
		List<Player> teamplayers = new ArrayList();
		for (Player player : players) {
			if (player.getTeam().equalsIgnoreCase(team)) {
				teamplayers.add(player);
			}

		}
		return teamplayers;
	}
}