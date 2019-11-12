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
                     FirstName varchar(255))";
        cmd.ExecuteNonQuery();


        Console.WriteLine("Table cars created");
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

    public static void AddNewEmployee(EmployeeEntity employee)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "INSERT INTO employees(FirstName) VALUES( '" + employee.FirstName + "')";
        cmd.ExecuteNonQuery();
        con.Close();

    }
    
    public static void RemoveEmployee(int employeeId)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "DELETE FROM employees WHERE Id="+ employeeId +"";
        
        cmd.ExecuteNonQuery();
        con.Close();
    }

    
}