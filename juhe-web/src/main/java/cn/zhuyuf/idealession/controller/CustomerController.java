package cn.zhuyuf.idealession.controller;

import cn.zhuyuf.idealession.domain.Customer;
import cn.zhuyuf.idealession.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Hero
 * @description cn.zhuyuf.idealession.controller
 * @date 2019/5/11
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    /**
     * 跳转到input.jsp
     */
    @RequestMapping("/input")
    public String input() {
        return "input";
    }
    /**
     * 保存
     */
    @RequestMapping("/save")
    public String save(Customer customer) {
        customerService.save(customer);
        return "succ";
    }
}
