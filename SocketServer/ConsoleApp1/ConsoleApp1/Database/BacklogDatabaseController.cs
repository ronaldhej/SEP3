using System;
using System.Data.SQLite;
using System.IO;
using Viaven.Entities;


public static class BacklogDatabaseController
{
    private const string ConnectionString = "Data Source=MyDatabase.sqlite;Version=3;";


    public static void CreateBacklog(BacklogEntity backlog)
    {

        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        int count = backlog.items.Count;
        for(int i = 0; i <= count; i++)
        {

            var cmd = new SQLiteCommand(con);
            cmd.CommandText = "INSERT INTO backlog (task, points, priority) VALUES ('" + backlog.items[i].task + "' ,'"
                + backlog.items[i].points + "' , '" + backlog.items[i].priority + "');";
            cmd.ExecuteNonQuery();
        }
        con.Close();
    }

    public static void AddItem(int ItemId)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "";

        cmd.ExecuteNonQuery();
        con.Close();
    }

    public static void RemoveItem(int ItemId)
    {
        var con = new SQLiteConnection(ConnectionString);
        con.Open();
        var cmd = new SQLiteCommand(con);
        cmd.CommandText = "";

        cmd.ExecuteNonQuery();
        con.Close();
    }


}