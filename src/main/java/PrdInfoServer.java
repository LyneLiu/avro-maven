import com.lyne.proto.PrdInfo;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by nn_liu on 2017/6/19.
 */
public class PrdInfoServer {

    private static Server server;

    private static void startServer() {
        try {
            server = new NettyServer(new SpecificResponder(PrdInfo.class, new PrdInfoImpl()), new InetSocketAddress(65111));
            // the server implements the Mail protocol (MailImpl)
        }catch (Exception e){
            // do nothing
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("Starting server");
        // usually this would be another app, but for simplicity
        startServer();
        System.out.println("Server started");
    }

}
