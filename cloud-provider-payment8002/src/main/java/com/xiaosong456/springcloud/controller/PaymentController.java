package com.xiaosong456.springcloud.controller;

import com.xiaosong456.springcloud.entities.CommonResult;
import com.xiaosong456.springcloud.entities.payment.Payment;
import com.xiaosong456.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2020-04-29 16:33:12
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        return new CommonResult(200,"查询成功",paymentService.queryById(id));
    }

    @PostMapping(value = "/create")
    public CommonResult insert(Payment payment){
        Payment paymentResult = paymentService.insert(payment);
        if(paymentResult != null){
            return new CommonResult(200,String.format("新增成功%s,serverPort为%s",paymentResult,serverPort));
        }else{
            return new CommonResult(500,"新增失败",paymentResult);
        }

    }


}