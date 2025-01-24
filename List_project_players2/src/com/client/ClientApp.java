package com.client;

import java.util.List;
import java.util.Scanner;

import com.contoller.PlayerController;
import com.entity.Player;

public class ClientApp {
	public static void main(String[] args) {
		PlayerController controller = new PlayerController();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. List all Players");
			System.out.println("2. Add a new Player");
			System.out.println("3. Find Player by ID");
			System.out.println("4. Find Players by Team");
			System.out.println("5. Get Players by Runs");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				List<Player> players = controller.getAllPlayers();
				for (Player player : players) {
					System.out.println(player);
				}
				break;

			case 2:
				System.out.print("Enter Player ID: ");
				int id = scanner.nextInt();
				System.out.print("Enter Player Name: ");
				String name = scanner.next();
				System.out.print("Enter Team Name: ");
				String team = scanner.next();
				System.out.print("Enter Player Role: ");
				String role = scanner.next();
				System.out.println("Enter players runs");
				int runs=scanner.nextInt();

				Player newPlayer = new Player(id, name, team, role,runs);
				controller.addplayers(newPlayer);
				System.out.println("Player added successfully!");
				break;

			case 3:
				System.out.print("Enter Player ID: ");
				int playerId = scanner.nextInt();
				Player player = controller.getplayerbyid(playerId);
				if (player != null) {
					System.out.println(player);
				} else {
					System.out.println("Player not found!");
				}
				break;

			case 4:
				System.out.print("Enter Team Name: ");
				String teamName = scanner.next();
				List<Player> teamPlayers = controller.getplayerbyteam(teamName);
				if (!teamPlayers.isEmpty()) {
					for (Player teamPlayer : teamPlayers) {
						System.out.println(teamPlayer);
					}
				} else {
					System.out.println("No players found for team " + teamName);
				}
				break;

			case 5:
				System.out.println("Getting players by runs");
				List<Player> player12 = controller.getAllPlayers();
				for (Player playerss : player12) {
					if (playerss.getRuns() > 98) {
						System.out.println(playerss);
					}
				}
				break;
			case 6:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}