package com.demobank.accountmanagementsystem.exceptions;

public class AccountNumberNotFoundException  extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * The X-ErrorCode.
     */
    private static final String ERROR_CODE = "7";

    /**
     * The constructor for CpdVehicleNotFoundException.
     */
    public AccountNumberNotFoundException(Long accountNumber) {
        super("Account with provided account number :"+accountNumber+" not found.");
    }

    /**
     * Returns the errorCode.
     *
     */
    public String getErrorCode() {
        return ERROR_CODE;
    }

	   
}
