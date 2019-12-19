using System;
using System.Data.SQLite;
using System.IO;
using Viaven.Entities;
using Viaven.Entities;
using Newtonsoft.Json;
using Viaven.Requests;


public static class EmployeeDatabaseController
{
    private const string ConnectionString = "Data Source=MyDatabase.sqlite;Version=3;";

    
    public static void AddNewEmployee(EmployeeEntity employee)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "INSERT INTO employees(FirstName) VALUES( '" + employee.FirstName + "')";
        cmd.ExecuteNonQuery();
        con.Close();

    }

    public static void RemoveEmployee(EmployeeEntity employee)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "DELETE FROM employees WHERE Id=" + employee.Id + "";

        cmd.ExecuteNonQuery();
        con.Close();
    }

    public static string GetOneEmployee(EmployeeEntity employee)
    {
        EmployeeEntity emp = new EmployeeEntity();
        EmployeeRequest employeeRequest = new EmployeeRequest();
        var conn = new SQLiteConnection(ConnectionString);
        SQLiteDataReader sqlite_datareader;
        SQLiteCommand sqlite_cmd;
        sqlite_cmd = conn.CreateCommand();
        sqlite_cmd.CommandText = "SELECT * FROM employee where employeeid = '" + employee.Id + "'";

        sqlite_datareader = sqlite_cmd.ExecuteReader();
        while (sqlite_datareader.Read())
        {
            emp.FirstName = sqlite_datareader.GetString(0);
            emp.Id = sqlite_datareader.GetString(1);
        }
        conn.Close();

        employeeRequest.Employee = emp;
        JsonPackage package = new JsonPackage();
        //package.Content = employeeRequest;
        string jsonpackage = JsonConvert.SerializeObject(package);
        return jsonpackage;

    }

    public static string CheckPassword(EmployeeEntity employee)
    {
        EmployeeEntity emp = new EmployeeEntity();
        EmployeeRequest employeeRequest = new EmployeeRequest();
        var conn = new SQLiteConnection(ConnectionString);
        conn.Open();
        SQLiteDataReader sqlite_datareader;
        SQLiteCommand sqlite_cmd;
        sqlite_cmd = conn.CreateCommand();
        sqlite_cmd.CommandText = "SELECT * FROM employees where Id = '" + employee.Id + "'";
        sqlite_datareader = sqlite_cmd.ExecuteReader();
        while (sqlite_datareader.Read())
        {
            emp.Password = sqlite_datareader.GetString(2);
        }
        conn.Close();

        string password = emp.Password;
        return password;
    }


}