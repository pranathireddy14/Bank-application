import React, { useState, useEffect } from 'react';

const AccountComponent = () => {
    const [account, setAccount] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    const accountId = 1; // Replace with dynamic value as needed

    useEffect(() => {
        const fetchAccount = async () => {
            try {
                const response = await fetch(`/api/accounts/${accountId}`);
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                const data = await response.json();
                setAccount(data);
            } catch (error) {
                setError(error.message);
            } finally {
                setLoading(false);
            }
        };

        fetchAccount();
    }, [accountId]);

    const handleDeposit = async (amount) => {
        // Implement deposit logic
    };

    const handleWithdraw = async (amount) => {
        // Implement withdraw logic
    };

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error: {error}</div>;
    }

    return (
        <div>
            <h2>Account Information</h2>
            <p>Account ID: {account.accountId}</p>
            <p>Account Holder: {account.accountHolderName}</p>
            <p>Balance: ${account.balance}</p>
            <button onClick={() => handleDeposit(100)}>Deposit $100</button>
            <button onClick={() => handleWithdraw(100)}>Withdraw $100</button>
        </div>
    );
};

export default AccountComponent;