import {Component} from "react";
import {BrowserRouter as Router, Route} from "react-router-dom";
import Category from "./Category";
import Home from "./Home";
import Expenses from "./Expenses";

class App extends Component {
    state = {};

    render() {
        return (
            <Router>
                <switch>
                    <Route path="/" exact={true} component={Home}/>
                    <Route path="/categories" exact={true} component={Category}/>
                    <Route path="/expenses" exact={true} component={Expenses}/>
                </switch>
            </Router>
        );
    }
}

export default App;
