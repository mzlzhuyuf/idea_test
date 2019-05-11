package cn.zhuyuf.idealession.service.impl;

import cn.zhuyuf.idealession.domain.Customer;
import cn.zhuyuf.idealession.mapper.CustomerMapper;
import cn.zhuyuf.idealession.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Hero
 * @description cn.zhuyuf.idealession.service.impl
 * @date 2019/5/11
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void save(Customer customer) {
        customerMapper.save(customer);
    }
}
