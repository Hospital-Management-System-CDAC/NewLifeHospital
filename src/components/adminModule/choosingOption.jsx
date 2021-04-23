import React, { Component } from "react";
import { Link } from "react-router-dom";
import NavMenu from "../../components/profileLayout/Menu.jsx";
class choosingOption extends Component {
  constructor(props) {
    super(props);

    this.state = {};
  }

  render() {
    return (
      <div>
        <NavMenu />
        <h4>Please choose the option</h4>
        <ul className="nav bg-light  nav-tabs">
          <li className="nav-item" class="glyphicon glyphicon-log-out">
            <Link to={"/listPatients"} className="nav-link text-secondary">
              <h4> View Patients </h4>
            </Link>
          </li>
        </ul>

        <ul className="nav bg-light  nav-tabs">
          <li className="nav-item" class="glyphicon glyphicon-log-out">
            <Link to={"/newAddtion"} className="nav-link text-secondary">
              <h4>New Registration</h4>
            </Link>
          </li>
        </ul>
        <ul className="nav bg-light  nav-tabs">
          <li className="nav-item" class="glyphicon glyphicon-log-out">
            <Link to={"/appoinm"} className="nav-link text-secondary">
              <h4>Appoinment Details</h4>
            </Link>
          </li>
        </ul>
        <ul className="nav bg-light  nav-tabs">
          <li className="nav-item" class="glyphicon glyphicon-log-out">
            <Link to={"/new-appoinm"} className="nav-link text-secondary">
              <h4> Add New Appoinment </h4>
            </Link>
          </li>
        </ul>
        <ul className="nav bg-light  nav-tabs">
          <li className="nav-item" class="glyphicon glyphicon-log-out">
            <Link to={"/appoinm"} className="nav-link text-secondary">
              <h4>Lab Facilites</h4>
            </Link>
          </li>
        </ul>
      </div>
    );
  }
}
export default choosingOption;
