import React from "react";

import "./App.css";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Login from "./components/login/Login.jsx";
import Reg from "./components/register/Reg.jsx";
import Dashboard from "./Dashboard";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Welcome from "./components/welcome/Welcome";
import Footer from "./components/layout/Footer.jsx";
import Feed from "./components/profile/Feed.jsx";

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path="/" component={Welcome} />
        <Route path="/Login" component={Login} />
        <Route path="/Signup" component={Reg} />
        <Route path="/Feed" component={Feed} />
      </Switch>
      <Switch>
        <Route path="/Dashboard" component={Dashboard} />
      </Switch>
      <div>
        <Footer></Footer>
      </div>
    </Router>
  );
}

export default App;
