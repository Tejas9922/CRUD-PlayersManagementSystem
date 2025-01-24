package com.contoller;

//Controller: PlayerController.java
import java.util.List;

import com.dao.PlayerDAO;
import com.entity.Player;
import com.service.PlayerService;

public class PlayerController {
	private PlayerService playerservice;

	public PlayerController() {
		playerservice = new PlayerService();
	}

	public List<Player> getAllPlayers() {
		return playerservice.getAllPlayers();

	}

	public void addplayers(Player player) {
		playerservice.addplayers(player);
	}

	public Player getplayerbyid(int id) {
		return playerservice.getplayerbyid(id);
	}

	public List<Player> getplayerbyteam(String team) {
		return playerservice.getplayerbyteam(team);
	}

}
