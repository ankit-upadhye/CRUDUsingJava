package com.ankit.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ankit.config.dbConfig;

public class Service {

	private  Connection conn;

	public Service() throws ClassNotFoundException, SQLException 
	{
		conn=dbConfig.connectMySql();
	}
	
	public void saveLicenseType(LicenseType LT) throws SQLException
	{
		String query=String.format("INSERT INTO LicenseType(licenseid,type) VALUES(%d,'%s')",LT.getLicenseId(),LT.getType());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nLicense Type Added Successfully.");
	}
	
	public void updateLicenseType(LicenseType LT) throws SQLException
	{
		String query=String.format("Update LicenseType set type='%s' where licenseid=%d",LT.getType(),LT.getLicenseId());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nLicense Type Updated Successfully.");
	}
	
	public void deleteLicenseType(LicenseType LT) throws SQLException
	{
		String query=String.format("Delete from LicenseType where licenseid=%d",LT.getLicenseId());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nLicense Type Deleted Successfully.");
	}
	
	public void savePerson(Person P) throws SQLException
	{
		String query=String.format("INSERT INTO Person(personid,person_name,address,city,contactno,fklicenseid) VALUES(%d,'%s','%s','%s','%s',%d)",
				P.getPersonid(),
				P.getPerson_name(),
				P.getAddress(),
				P.getCity(),
				P.getContactno(),
				P.getFklicenseid());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nPerson Added Successfully.");
	}
	
	public void updatePerson(Person P) throws SQLException
	{
		String query=String.format("Update Person set person_name='%s',address='%s',city='%s',contactno='%s',fklicenseid=%d where personid=%d",
				P.getPerson_name(),
				P.getAddress(),
				P.getCity(),
				P.getContactno(),
				P.getFklicenseid(),
				P.getPersonid());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nPerson Updated Successfully.");
	}
	
	public void deletePerson(Person P) throws SQLException
	{
		String query=String.format("Delete from Person where personid=%d",P.getPersonid());
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		System.out.println("\nPerson Deleted Successfully.");
	}
}
