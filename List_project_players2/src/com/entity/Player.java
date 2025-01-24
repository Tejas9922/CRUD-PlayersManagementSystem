package com.entity;

public class Player {
	private int id;
	private String name;
	private String team;
	private String role;
    private int runs;
	
	
	public Player() {
		super();
	}

	public Player(int id, String name, String team, String role, int runs) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		this.role = role;
		this.runs = runs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + ", role=" + role + ", runs=" + runs + "]";
	}

	
}
