package com.bankmanagement.demo.services;

import com.bankmanagement.demo.dao.model.Bank;
import com.bankmanagement.demo.dao.reponsitories.BankReponsitories;
import com.bankmanagement.demo.dto.BankDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService
{   @Autowired
    private BankReponsitories bankReponsitories;
    @Override
    public void createBank(BankDTO bankDTO) {
        Bank bank =new Bank();
        bank.setBankname(bankDTO.getBankname());
        bank.setBankaccount(bankDTO.getBankaccount());
        bank.setBankusername(bankDTO.getUsername());
        bankReponsitories.save(bank);
        return;


    }
}


