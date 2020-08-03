package com.bdsoft.rpcproducer;

import com.bdsoft.rpcaio.API.HelloService;
import com.bdsoft.rpcaio.API.StudentServiceApi;
import com.bdsoft.rpcaio.containers.Registry;
import com.bdsoft.rpcaio.transporthession.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpcProducerApplication {

    public static void main(String[] args) {

        SpringApplication.run(RpcProducerApplication.class, args);
        Registry.map.put(StudentServiceApi.class.getName(),ProducerServer.class);
        Server server = new Server();
        server.bind(8080);
    }

}
