using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApp.SocketClient.Model;
using WebApp.SocketClient.Requests;
using Newtonsoft.Json;

namespace WebApp.SocketClient.JsonHandler
{
    public class BacklogJsonHandler
    {

        public String Create(List<BacklogItemEntity> items)
        {

            BacklogEntity backlogEntity = new BacklogEntity();
            BacklogRequest backlogRequest = new BacklogRequest();

            JsonPackage package = new JsonPackage();
            backlogEntity.items = items;
            backlogRequest.backlogEntity = backlogEntity;
            package.Type = "CreateRequest";
            package.ForwardTo = "BacklogController";
            package.Content = backlogRequest;
            String jsonpackage = JsonConvert.SerializeObject(package);

            return jsonpackage;


        }
    }
}