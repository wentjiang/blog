package com.wentjiang.service.one;

import com.wentjiang.service.Service;

/**
 * @author wentaojiang
 * @date 2019/4/7 9:35 AM
 * @description
 */
public class ServiceOne implements Service {
    @Override
    public void doService() {
        System.out.println("this is service one");
    }

    @Override
    public String serviceType() {
        return "one";
    }


}
