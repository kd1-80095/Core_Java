package com.assignment;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Candidates deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id (to vote): ");
			int candidateId = sc.nextInt();
			int cnt = dao.incrementVote(candidateId);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try (CandidateDao dao = new CandidateDao()) {
			Candidate c = new Candidate();
			c.acceptData();
			int value = dao.save(c);
			System.out.println("Rows Inserted:"+value);
			} catch (Exception e) {
			// Handle the exception here
			e.printStackTrace();
			} 
		*/
		
		try(CandidateDao dao = new CandidateDao())
		{
			Candidate candidate = new Candidate();
			System.out.println("Enter ID");
			int id = sc.nextInt();
			candidate.setId(id);
			
			System.out.println("Enter Updated Name");
			String name = sc.next();
			candidate.setName(name);;
			
			System.out.println("Enter Updated Party");
			String party = sc.next();
			candidate.setParty(party);
			
			int value = dao.update(candidate);
			System.out.println("Rows Updated:"+value);
		
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}
}













