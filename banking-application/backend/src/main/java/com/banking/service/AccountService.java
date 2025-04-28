public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    public Account updateAccount(Long accountId, Account accountDetails) {
        Account account = getAccountById(accountId);
        if (account != null) {
            account.setAccountHolderName(accountDetails.getAccountHolderName());
            account.setBalance(accountDetails.getBalance());
            return accountRepository.save(account);
        }
        return null;
    }

    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}