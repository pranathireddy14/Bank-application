import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import AccountComponent from './components/AccountComponent';

const App = () => {
    return (
        <Router>
            <div>
                <h1>Banking Application</h1>
                <Switch>
                    <Route path="/account" component={AccountComponent} />
                    <Route path="/" exact>
                        <h2>Welcome to the Banking Application</h2>
                    </Route>
                </Switch>
            </div>
        </Router>
    );
};

export default App;