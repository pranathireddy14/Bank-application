import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.banking.model.Account;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepository accountRepository;

    private Account account;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account();
        account.setAccountId(1L);
        account.setAccountHolderName("John Doe");
        account.setBalance(1000.0);
    }

    @Test
    void createAccount() {
        when(accountRepository.save(any(Account.class))).thenReturn(account);
        Account createdAccount = accountService.createAccount(account);
        assertNotNull(createdAccount);
        assertEquals("John Doe", createdAccount.getAccountHolderName());
    }

    @Test
    void getAccountById() {
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
        Account foundAccount = accountService.getAccountById(1L);
        assertNotNull(foundAccount);
        assertEquals("John Doe", foundAccount.getAccountHolderName());
    }

    @Test
    void updateAccount() {
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
        account.setBalance(1500.0);
        when(accountRepository.save(any(Account.class))).thenReturn(account);
        Account updatedAccount = accountService.updateAccount(1L, account);
        assertNotNull(updatedAccount);
        assertEquals(1500.0, updatedAccount.getBalance());
    }

    @Test
    void deleteAccount() {
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
        accountService.deleteAccount(1L);
        verify(accountRepository, times(1)).delete(account);
    }
}