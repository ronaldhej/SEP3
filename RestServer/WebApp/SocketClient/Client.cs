using System;
using System.Net;
using System.Net.Sockets;
using System.Text;
using WebApp.Data;
using WebApp.SocketClient.Model;
using WebApp.SocketClient.Requests;
using Newtonsoft.Json;
using WebApp.SocketClient.JsonHandler;
 

namespace WebApp.Client
{
    public class Client
    {
        EmployeeJsonHandler employeeJsonHandler = new EmployeeJsonHandler();
        SprintJsonHandler SprintJsonHandler = new SprintJsonHandler();
        const int PORT_NO = 2000;
        const string SERVER_IP = "127.0.0.1";

        //------------------------------------------SPRINTS-------------------------------------------------

        public void AddSprint(String contributor, String name, String Id)
        {
            String contr = "a";
            string namex = "b";
            string idx = "1";
            SprintRequest request = new SprintRequest();
            
            String textToSend = SprintJsonHandler.Add(namex, contr, idx);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
        }

        public void RemoveSprint(int id)
        {

        }

        public void GetSprint(int id)
        {

        }

        //----------------------------------------------EMPLOYEE-------------------------------------------

        public void AddEmployee()
        {
            string name = "andrzej";
            String textToSend = employeeJsonHandler.Add(name);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();
        }

        public void RemoveEmployee()
        {
            string id = "1";
            string textToSend = employeeJsonHandler.Remove(id);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();

            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);
            client.Close();


        }

        public string GetOneEmployee()
        {
            string id = "2";
            string textToSend = employeeJsonHandler.Remove(id);

            TcpClient client = new TcpClient(SERVER_IP, PORT_NO);
            NetworkStream nwStream = client.GetStream();
            byte[] bytesToSend = ASCIIEncoding.ASCII.GetBytes(textToSend);
            nwStream.Write(bytesToSend, 0, bytesToSend.Length);



            client.Close();
            return "a";

        }









    }

}