package com.bankmanagement.demo.dao.reponsitories;

import com.bankmanagement.demo.dao.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  BankReponsitories extends JpaRepository<Bank, Long> {
}
