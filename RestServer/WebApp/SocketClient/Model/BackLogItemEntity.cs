using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApp.SocketClient.Model
{
    public class BacklogItemEntity
    {
        public string task;
        public string points;
        public string priority;

        public void SetValues(string task, string points, string priority)
        {
            this.task = task;
            this.points = points;
            this.priority = priority;

        }

    }



}
