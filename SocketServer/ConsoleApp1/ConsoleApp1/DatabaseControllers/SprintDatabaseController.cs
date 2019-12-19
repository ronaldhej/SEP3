using System;
using System.Data.SQLite;
using System.IO;
using Viaven.Entities;


public static class SprintDatabaseController
{
    private const string ConnectionString = "Data Source=MyDatabase.sqlite;Version=3;";


    public static void AddNewSprint(SprintEntity sprint)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "INSERT INTO sprint(SprintName, Task, BacklogId) VALUES('" + sprint.Name + "', '" + sprint.Task + sprint.BacklogId + "');";
        cmd.ExecuteNonQuery();
        con.Close();

    }

    public static void RemoveSprint(string sprintId)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "DELETE FROM sprint WHERE Id=" + sprintId + "";

        cmd.ExecuteNonQuery();
        con.Close();
    }

    public static void AssignToTeam(string teamid)
    {

    }


}