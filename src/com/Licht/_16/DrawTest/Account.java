package com.Licht._16.DrawTest;
//定义一个账户类
public class Account{
	//封装账户ID、账户余额
	private String accountId;
	private double balance; // 余额
	public Account(){}
	public Account(String accountId, double balance){
		this.setAccountId(accountId);
		this.balance = balance;
	}
	public String getAccountId(){
		return accountId;
	}
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}
	public Double getBalance(){
		return balance;
	}
	public void setBalance(Double balance){
		this.balance = balance;
	}
	
	//根据accountId来重写hashCode()方法和equals()方法
	public int hashCode(){
		return accountId.hashCode();
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(this != null
			&& obj.getClass() == Account.class){
				Account target = (Account)obj;
				return target.getAccountId().equals(accountId);
			}
		return false;
	}
}