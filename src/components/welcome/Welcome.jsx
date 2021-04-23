import React, { Component } from "react";
import Header from "../../components/layout/Header.jsx";
import NavigatorMenu from "../../components/layout/NavigatorMenu.jsx";
import { Link } from "react-router-dom";

class Welcome extends Component {
  state = {};
  render() {
    return (
      <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
          <div class="container-fluid">
            <NavigatorMenu />
            <ul class="nav bg-info  nav-tabs">
              <li className="nav-item " class="glyphicon glyphicon-user">
                <Link to={"/Login"} className="nav-link text-dark">
                  <h4>Login</h4>
                </Link>
              </li>
              <li className="nav-item" class="glyphicon glyphicon-log-in">
                <Link to={"/Signup"} className="nav-link text-dark">
                  <h4>Sign Up</h4>
                </Link>
              </li>
              <li className="nav-item" class="glyphicon glyphicon-log-in">
                <Link to={"/admin"} className="nav-link text-dark">
                  <h4>Admin Login</h4>
                </Link>
              </li>
              {/* <td className="nav-item" class="glyphicon glyphicon-log-in">
                <Link to={"/admin"}   className="nav-link text-secondary">
                  <h4>Login  as Admin</h4>
                </Link>
              </td> */}
            </ul>
          </div>
        </nav>
        <Header></Header>
      </div>
    );
  }
}

export default Welcome;
