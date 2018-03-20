package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerDao {
	
	//总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	//结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	
	//根据id查询用户
	public Customer selectCustomerById(Integer id);
	
	//保存修改用户
	public void updateCustomer(Customer customer);
	//删除用户
	public void deleteCustomerById(Integer id);
}
