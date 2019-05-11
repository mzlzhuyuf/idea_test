import cn.zhuyuf.idealession.domain.Customer;
import cn.zhuyuf.idealession.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Hero
 * @description PACKAGE_NAME
 * @date 2019/5/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {
    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testSave() {
        Customer customer = new Customer();
        customer.setName("zhuyuf");
        customer.setGender("男");
        customer.setAge(20);
        customerMapper.save(customer);
    }
}
