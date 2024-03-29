import React, { Component } from "react";
import Header from "../../components/layout/Header.jsx";
import NavMenu from "../../components/profileLayout/Menu.jsx";

import HospitalService from "../../services/HospitalService";

import Cookies from "universal-cookie";

class Feed extends Component {
  constructor(props) {
    super(props);

    this.state = {
      id: this.props.match.params.id,
      patients: [],
    };
    this.haveAppointment = this.haveAppointment.bind(this);
    this.viewPatient = this.viewPatient.bind(this);
    this.haveLab = this.haveLab.bind(this);
  }

  haveAppointment(id) {
    this.props.history.push(`/appoin-doctor/${id}`);
  }
  viewPatient(id) {
    this.props.history.push(`/view-patient/${id}`);
  }
  haveLab(id) {
    this.props.history.push(`/lab-patient/${id}`);
  }

  componentDidMount() {
    const cookies = new Cookies();
    HospitalService.getPatientById(
      cookies.get("email"),
      cookies.get("pwd")
    ).then((res) => {
      this.setState({ patients: [res.data] });
    });
  }

  render() {
    // let patients = this.state.patient;
    return (
      <div>
        <NavMenu />

        <nav className="navbar navbar-dark bg-dark justify-content-between">
          <ul className="nav bg-light  nav-tabs">
            <li className="nav-item" class="glyphicon glyphicon-log-out"></li>
          </ul>
          <form class="form-inline">
            <input
              className="form-control mr-sm-2"
              type="search"
              placeholder="Search"
            ></input>
            <button
              className="btn btn-outline-success my-2 my-sm-0"
              type="submit"
            >
              Search
            </button>
          </form>
        </nav>
        <Header></Header>
        <div className="row">
          <table className="table table-bordered">
            <thead className="thead-dark">
              <tr>
                <th> Name</th>
                <th> Email</th>
                <th> Phone Number</th>
                <th> Actions</th>
              </tr>
            </thead>
            <tbody>
              {this.state.patients.map((patient) => (
                <tr key={patient.id}>
                  <td> {patient.name} </td>
                  <td> {patient.email}</td>
                  <td> {patient.phoneNumber}</td>
                  <td>
                    <button
                      style={{ marginLeft: "10px" }}
                      onClick={() => this.haveAppointment(patient.id)}
                      className="btn btn-primary"
                    >
                      Book The Slot{" "}
                    </button>
                    <button
                      style={{ marginLeft: "20px" }}
                      onClick={() => this.viewPatient(patient.id)}
                      className="btn btn-success"
                    >
                      View All Details{" "}
                    </button>
                    <button
                      style={{ marginLeft: "20px" }}
                      onClick={() => this.haveLab(patient.id)}
                      className="btn btn-secondary"
                    >
                      Lab Test{" "}
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default Feed;
