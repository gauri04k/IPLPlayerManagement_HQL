package com.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="player_id")
	 private int playerId;
	
	
	@Column(name ="player_name")
     private String playerName;
	
	@Column(name ="team_name")
     private String teamName;
	
     private String role;
     private int runs;
     private int wickets;
     private double price;
     
     
	 public Player() {
		super();
	 }


	 public int getPlayerId() {
		 return playerId;
	 }


	 public void setPlayerId(int playerId) {
		 this.playerId = playerId;
	 }


	 public String getPlayerName() {
		 return playerName;
	 }


	 public void setPlayerName(String playerName) {
		 this.playerName = playerName;
	 }


	 public String getTeamName() {
		 return teamName;
	 }


	 public void setTeamName(String teamName) {
		 this.teamName = teamName;
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


	 public int getWickets() {
		 return wickets;
	 }


	 public void setWickets(int wickets) {
		 this.wickets = wickets;
	 }


	 public double getPrice() {
		 return price;
	 }


	 public void setPrice(double price) {
		 this.price = price;
	 }


	 @Override
	 public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", teamName=" + teamName + ", role="
				+ role + ", runs=" + runs + ", wickets=" + wickets + ", price=" + price + "]";
	 }
     
	 
	 
     
     
}
