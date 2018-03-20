package com.itheima.crm.service;

import java.util.List;

import com.itheima.common.utils.Page;
import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerService {


	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	//根据id查询用户
	public Customer selectCustomerById(Integer id);
	//保存修改用户
	public void updateCustomer(Customer customer);
	//删除用户
	public void deleteCustomerById(Integer id);
}
