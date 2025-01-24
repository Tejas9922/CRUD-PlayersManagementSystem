package com.service;

import java.util.List;

import com.dao.PlayerDAO;
import com.entity.Player;

public class PlayerService {
	private PlayerDAO playerdao;

	public PlayerService() {
		playerdao = new PlayerDAO();
	}

	public List<Player> getAllPlayers() {
		return playerdao.getallplayers();

	}

	public void addplayers(Player player) {
		playerdao.addplayers(player);
	}

	public Player getplayerbyid(int id) {
		return playerdao.getplayerbyid(id);
	}

	public List<Player> getplayerbyteam(String team) {
		return playerdao.getplayerbyteam(team);
	}
}
