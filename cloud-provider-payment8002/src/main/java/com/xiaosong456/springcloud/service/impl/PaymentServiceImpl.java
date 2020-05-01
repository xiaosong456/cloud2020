package com.xiaosong456.springcloud.service.impl;

import com.xiaosong456.springcloud.dao.PaymentDao8002;
import com.xiaosong456.springcloud.entities.payment.Payment;
import com.xiaosong456.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 16:30:58
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao8002 paymentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Payment> queryAllByLimit(int offset, int limit) {
        return paymentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    @Override
    public Payment insert(Payment payment) {
        paymentDao.insert(payment);
        return payment;
    }

    /**
     * 修改数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    @Override
    public Payment update(Payment payment) {
        paymentDao.update(payment);
        return queryById(payment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return paymentDao.deleteById(id) > 0;
    }
}