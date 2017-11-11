package  com.baomidou.springwind.registry

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer


/**
 * <p>
 * 服务注册中心
 * </p>
 *
 * @author hubin
 * @since 2017-11-11
 */
@EnableEurekaServer
@SpringBootApplication
open class RegistryApplication

fun main(args: Array<String>) {
    SpringApplication.run(RegistryApplication::class.java, *args)
}