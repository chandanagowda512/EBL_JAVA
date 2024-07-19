package com.wecp.progressive.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.exception.AccountNotFoundException;
import com.wecp.progressive.repository.AccountRepository;
 
@Service
public class AccountServiceImplJpa {
    @Autowired
    AccountRepository accountRepository;
 
    // @Autowired
    // AccountController accountController;
   
    public Integer addAccount(Accounts account){
        return accountRepository.save(account).getAccountId();
    }
   
    public List<Accounts> getAllAccounts(){
        return accountRepository.findAll();
    }
   
    public Accounts getAccountById(Integer accountId){
        return accountRepository.findById(accountId).get();
    }
 
    // public List<Accounts> getAccountByUser(Integer account_id){
    //     return accountRepository.findById(account_id).get();
    // }
   
    public Accounts updateAccount(Integer accountId,Accounts account) {
        Accounts accounts = accountRepository.findById(accountId).get();
        if (accounts == null) {
            throw new AccountNotFoundException("Not Found");
        }
        accounts.setBalance(account.getBalance());
       // accounts.setCustomer_id(account.getCustomer_id());
        
       
       //accounts.setTransaction(account.getTransaction());
        return accountRepository.save(accounts);
    }
   
    public void deleteAccount(Integer accountId){
        accountRepository.deleteById(accountId);
    }
 
}