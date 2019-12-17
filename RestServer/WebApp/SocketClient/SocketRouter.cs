using System;
using System.Net;
using System.Net.Sockets;
using System.Text;
using WebApp.Data;
using WebApp.SocketClient.Model;
using WebApp.SocketClient.Requests;
using Newtonsoft.Json;
using WebApp.SocketClient.JsonHandler;
using System.Collections.Generic;
 

namespace WebApp.Client
{
    public class SocketRouter
    {
        EmployeeJsonHandler employeeJsonHandler = new EmployeeJsonHandler();
        SprintJsonHandler SprintJsonHandler = new SprintJsonHandler();
        BacklogJsonHandler backlogJsonHandler = new BacklogJsonHandler();
        const int PORT_NO = 2000;
        const string SERVER_IP = "127.0.0.1";

        //------------------------------------------SPRINTS-------------------------------------------------

        public void AddSprint(String task, String name)
        {
            String contr = "a";
            string namex = "b";
            string idx = "1";
            SprintRequest request = new SprintRequest();
            
            String textToSend = SprintJsonHandler.Add(name, task);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
        }

        public void RemoveSprint(int id)
        {

        }

        public void GetSprint(string id)
        {

        }

        public void AssignToTeam(string id, string AssignedToTeam)
        {
            SprintRequest request = new SprintRequest();

            String textToSend = SprintJsonHandler.AssignToTeam(id, AssignedToTeam);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
        }

        public void AssignToPerson(string id, string AssignedToTeam)
        {

        }

        public List<SprintEntity> GetSprintByTeam(string id)
        {
            List<SprintEntity> a = new List<SprintEntity>();
            return a;
        }

        public List<SprintEntity> GetSprintByPerson(int id)
        {
            List<SprintEntity> a = new List<SprintEntity>();
            return a;
        }


        //----------------------------------------------EMPLOYEE-------------------------------------------


        public string CheckPassword(string EmployeeId, string Password)
        {
            String textToSend = employeeJsonHandler.CheckPassword(EmployeeId, Password);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
            return "a";
        }

        public void AddEmployee(string name, string password)

        {
            String textToSend = employeeJsonHandler.Add(name, password);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
        }

        public void RemoveEmployee(string id)
        {
            string textToSend = employeeJsonHandler.Remove(id);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();


        }

        public string GetOneEmployee(string id)
        {
            string textToSend = employeeJsonHandler.Remove(id);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();
            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);



            client.Close();
            return "a";

        }

        public List<EmployeeEntity> GetAllEmployees()
        {
            List<EmployeeEntity> a = new List<EmployeeEntity>();
            return a;
        }

       

        //-----------------------------BACKLOG-----------------------------------------------

        public void CreateBacklog(List<BacklogItemEntity> items)
        {

            string textToSend = backlogJsonHandler.Create(items);
            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();
            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();



        }








    }

}