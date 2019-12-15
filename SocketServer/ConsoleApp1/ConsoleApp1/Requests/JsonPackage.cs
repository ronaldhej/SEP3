using Newtonsoft.Json.Linq;

namespace Viaven.Requests
{
    class JsonPackage
    {
        public string ForwardTo;
        public string Type;
        public JObject Content;
    }
}