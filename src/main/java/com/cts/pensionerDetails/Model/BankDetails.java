package com.cts.pensionerDetails.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *  @author Sarika Soni
 *  @author 890071
 *  
 * This is BankDetail class which contains the Bank details
 * like bankName, bankType, accountNumber
 *
 */

@AllArgsConstructor
@Getter
public class BankDetails {
	
	
	private String bankName;
	private long accountNumber;
	private String bankType;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public BankDetails() {
		
	}
	
	

}
