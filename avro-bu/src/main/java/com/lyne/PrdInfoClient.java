package com.lyne;

import com.lyne.proto.PrdIdentity;
import com.lyne.proto.PrdInfo;
import com.lyne.proto.PrdInfoType;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;

import java.net.InetSocketAddress;

/**
 * Created by nn_liu on 2017/6/19.
 */
public class PrdInfoClient {

    public static void main(String[] args) {
        NettyTransceiver client = null;
        try{

            client = new NettyTransceiver(new InetSocketAddress(65111));
            // client code - attach to the server and send a message
            PrdInfo proxy = SpecificRequestor.getClient(PrdInfo.class, client);
            System.out.println("Client built, got proxy");

            // fill in the Message record and send it
            // message中的各个字段均需要初始化，不然会报错：NullPointException
            PrdIdentity prdIdentity = new PrdIdentity();
            prdIdentity.setId(1);
            prdIdentity.setType("adult");
            System.out.println("Calling proxy.send with message:  " + prdIdentity.toString());
            PrdInfoType prdInfoType = proxy.queryPrdInfo(prdIdentity);
            System.out.println("Proxy response message: " + prdInfoType.toString());

        }catch (Exception e){
            // do nothing
            e.printStackTrace();
        }finally {
            // cleanup
            client.close();
        }
    }

}
