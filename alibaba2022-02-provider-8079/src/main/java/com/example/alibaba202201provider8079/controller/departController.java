package com.example.alibaba202201provider8079.controller;//package com.example.alibaba202201provider8081.controller;

import com.example.alibaba202201provider8079.pojo.Depart;
import com.example.alibaba202201provider8079.service.DepartService;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RequestMapping("/provider/depart/")
@RestController
public class departController {
    @Resource
    private DepartService departService;

    @Resource
    private DiscoveryClient client;

    @PostMapping("/")
    public boolean saveHandle(@RequestBody Depart depart){
        return departService.saveDepart(depart);
    }

    @GetMapping("/{id}")
    public Depart getHandleById(@PathVariable("id")int id){
        return departService.getDepartById(id);
    }

    @PutMapping("/")
    public boolean modifyHandle(@RequestBody Depart depart){
        return departService.modifyDepart(depart);
    }

    @DeleteMapping("/{id}")
    public boolean deleteHandle(@PathVariable("id")int id){
        return departService.removeDepart(id);
    }

    @GetMapping("/list")
    public List<Depart> getAllDeparts(){
        return departService.getAllDeparts();
    }

    @GetMapping("/discovery")
    public List<String> discoveryHandler(){
        //获取注册中心所有服务名称
        //[depart-consumer, depart-provider]
        List<String> services = client.getServices();
        for(String serviceName : services){
            //获取指定微服务名称的所有微服务实例
            List<ServiceInstance>instances = client.getInstances(serviceName);
            //depart-provider.instances:[com.alibaba.cloud.nacos.NacosServiceInstance@1f]
            System.out.println(serviceName + ".instances:" + instances);
            for (ServiceInstance instance : instances) {
                //[com.alibaba.cloud.nacos.NacosServiceInstance@1f].instanceId:null
                System.out.println(instances + ".instanceId:" + instance.getInstanceId());
                //[com.alibaba.cloud.nacos.NacosServiceInstance@1f].serviceId:depart-provider
                System.out.println(instances + ".serviceId:" + instance.getServiceId());
                //[com.alibaba.cloud.nacos.NacosServiceInstance@1f].getUri:http://169.254.127.72:8079
                System.out.println(instances + ".getUri:" + instance.getUri());
                //[com.alibaba.cloud.nacos.NacosServiceInstance@1f].getHost:169.254.127.72
                System.out.println(instances + ".getHost:" + instance.getHost());
                //[com.alibaba.cloud.nacos.NacosServiceInstance@1f].getPort:8079
                System.out.println(instances + ".getPort:" + instance.getPort());
                //serviceName:depart-provider
                System.out.println("serviceName:" + serviceName);
            }
        }
        return services;
    }
}
