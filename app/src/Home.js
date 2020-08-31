import {Component} from "react";
import AppNav from "./AppNav";

class Home extends Component {
    state = {};

    render() {
        return (
            <div>
                <AppNav/>
                <h2
                    style={{
                        display: "flex",
                        justifyContent: "center",
                        alignItems: "center",
                        height: "100vh",
                    }}
                >
                    Expense Tracker Using React.js and Spring Boot by : Abhishek Gupta and
                    Amar Gurav
                </h2>
            </div>
        );
    }
}

export default Home;
