1. Single Responsibility Principle (SRP): The AccountManager class has a single responsibility of managing accounts (i.e., deposit, withdraw, and get balance), and nothing more.
2. Open-Closed Principle (OCP): The AccountManager class is open for extension but closed for modification. You can extend it to add new account management features without modifying the existing code.
3. Liskov Substitution Principle (LSP): The AccountManager class can work with any subclass of the Account interface (i.e., SavingsAccount, CheckingAccount, and LoanAccount) without any issues.
4. Interface Segregation Principle (ISP): The AccountManager class only depends on the Account interface and not any specific implementation. This makes it easy to swap out the account classes with new implementations that adhere to the Account interface.
5. Dependency Inversion Principle (DIP): The AccountManager class depends on the Account interface and not any specific implementation, allowing for decoupling between the AccountManager and the Account classes. Additionally, the Account classes are responsible for their own behavior, which means that the AccountManager class does not need to know about the details of how accounts work.


1. The Account interface: This is an interface that defines three methods deposit(), withdraw() and getBalance(). All classes that implement this interface must implement these methods.
2. The SavingsAccount class: This class implements the Account interface and provides methods to deposit, withdraw and get balance of a savings account.
3. The CheckingAccount class: This class implements the Account interface and provides methods to deposit, withdraw and get balance of a checking account.
4. The LoanAccount class: This class implements the Account interface and provides methods to withdraw and get balance of a loan account. However, it throws an exception if someone tries to deposit into this account.
5. The AccountManager class: This class manages a list of Account objects and provides methods to deposit, withdraw and get balance of the accounts in the list. It takes a list of Account objects as a parameter in its constructor. 
