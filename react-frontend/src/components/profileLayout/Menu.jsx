import React, { Component } from "react";
import NavigatorMenuProfile from "../../components/profileLayout/NavigatorMenuProfile.jsx";

import { Link } from "react-router-dom";

class Welcome extends Component {
  state = {};
  render() {
    return (
      <div>
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <div className="container-fluid">
            <nav>
              <NavigatorMenuProfile />
            </nav>
            <ul className="nav bg-light  nav-tabs">
              <li className="nav-item" class="glyphicon glyphicon-log-out">
                <Link to={"/Login"} className="nav-link text-secondary">
                  <h4>Sign-Out</h4>
                </Link>
              </li>
            </ul>
          </div>
        </nav>
      </div>
    );
  }
}

export default Welcome;
