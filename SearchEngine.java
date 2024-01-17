import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String[] list = new String[10];
    int ct = 0;
    String sr = "";
    public String handleRequest(URI url)
    {
        if(url.getPath().equals("/searchAll"))
        {
            String listContents = "";
            for(int i = 0; i < list.length; i++)
            {
                listContents += list[i];
            }
            return listContents;
        }
        if(url.getPath().equals("/search"))
        {
            String[] parameters = url.getQuery().split("=");
            for(int i = 0; i < list.length; i++)
            {
                if(list[i] != null && list[i].contains(parameters[0]))
                {
                    sr += list[i] + " ";
                }
            }
            return sr;
        }
        if(url.getPath().equals("/add"))
        {
            String[] parameters = url.getQuery().split("=");
            list[ct] = parameters[0];
            return String.format("%s was added to the list.", parameters[0]);
        }
        return "404 not found.";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
