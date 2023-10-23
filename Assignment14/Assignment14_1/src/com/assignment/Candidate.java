package com.assignment;

import java.util.Scanner;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;

	public Candidate() {
	
	}

	public Candidate(int id, String name, String party, int votes) {
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return this.party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return this.votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("ID");
//		int id = sc.nextInt();
		
		System.out.println("name");
		this.name= sc.next();
		System.out.println("party");
		this.party = sc.next();
		System.out.println("votes");
		this.votes = sc.nextInt();
		
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
}
