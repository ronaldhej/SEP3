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
        const int PORT_NO = 2000;
        const string SERVER_IP = "127.0.0.1";

        //------------------------------------------SPRINTS-------------------------------------------------

        public void AddSprint(String contributor, String name, int id)
        {
            AddSprintRequest request = new AddSprintRequest();
            String textToSend = request.get(name, contributor, id);

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
            JsonPackage json = 



            client.Close();

        }









    }

}