package com.wentjiang.service.two;

import com.wentjiang.service.Service;

/**
 * @author wentaojiang
 * @date 2019/4/7 9:37 AM
 * @description
 */
public class ServiceTwo implements Service {
    @Override
    public void doService() {
        System.out.println("this is service two");
    }

    @Override
    public String serviceType() {
        return "two";
    }
}
