using System;
using System.Data.SQLite;
using System.IO;
using Viaven.Entities;

public static class DbContext
{
    private const string ConnectionString = "Data Source=MyDatabase.sqlite;Version=3;";

    private static void InitializeTables()
    {
      

        var con = new SQLiteConnection(ConnectionString);
        con.Open();

        var cmd = new SQLiteCommand(con);


        cmd.CommandText = @"CREATE TABLE employees(id integer primary key autoincrement,
                     FirstName varchar(255), Password varchar(255))";
        cmd.ExecuteNonQuery();
        cmd.CommandText = @"CREATE TABLE sprint(Id integer primary key autoincrement,
                     SprintName varchar(255), Task varchar(255), AssignedToTeam varchar(255), AssignedToPerson varchar(255))";
        cmd.ExecuteNonQuery();
        cmd.CommandText = @"CREATE TABLE backlog(Id integer primary key autoincrement,
                     task varchar(255), points varchar(255), priority varchar(255))";
        cmd.ExecuteNonQuery();
        cmd.CommandText = @"CREATE TABLE taskassigment(Id integer primary key autoincrement,
                     SprintId varchar(255), AssignedToTeam varchar(255), AssignedToPerson varchar(255))";
        cmd.ExecuteNonQuery();



        Console.WriteLine("Table created");
        con.Close();
       
    }

    public static void Setup()
    {
        if (!File.Exists("MyDatabase.sqlite"))
        {
            SQLiteConnection.CreateFile("MyDatabase.sqlite");
            InitializeTables();
        }

        

    }
    
}