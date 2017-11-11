package com.baomidou.springwind.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy


/**
 * <p>
 * 服务注册中心
 * </p>
 *
 * @author hubin
 * @since 2017-11-11
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
open class GatewayApplication

fun main(args: Array<String>) {
    SpringApplication.run(GatewayApplication::class.java, *args)
}