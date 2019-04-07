package com.wentjiang.service.loader;

import com.wentjiang.service.Service;

import java.util.ServiceLoader;

/**
 * @author wentaojiang
 * @date 2019/4/7 9:31 AM
 * @description
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Service> sl = ServiceLoader.load(Service.class);
        for (Service service : sl){
            service.doService();
            System.out.println(service.serviceType());
        }
    }
}
