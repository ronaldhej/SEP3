using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Viaven
{

    public class ServerStart
    {

        public static int Main(String[] args)
        {
            AsynchronousSocketListener socketListener = new AsynchronousSocketListener();

            DbContext.Setup();
            socketListener.StartListening();
            return 0;
        }
    }
}
