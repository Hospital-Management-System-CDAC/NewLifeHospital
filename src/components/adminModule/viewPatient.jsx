import React, { Component } from "react";
import Header from "../../components/layout/Header.jsx";

import HospitalService from "../../services/HospitalService";
import Cookies from "universal-cookie";
class viewPatient extends Component {
  constructor(props) {
    super(props);

    this.state = {
      id: this.props.match.params.id,
      patients: [],
    };

    this.viewPatients = this.viewPatients.bind(this);
    this.deletePatient = this.deletePatient.bind(this);
  }
  deletePatient(id) {
    HospitalService.deletePatient(id).then((res) => {
      this.setState({
        patients: this.state.patients.filter((patient) => patient.id !== id),
      });
    });
    window.location.reload();
  }

  viewPatients(id, pwd) {
    console.log(pwd);
    const cookies = new Cookies();
    cookies.set("id", JSON.stringify(id), {
      path: "edit-patient/",
    });
    cookies.set("password", JSON.stringify(pwd), {
      path: "edit-patient/",
    });
    this.props.history.push(`/edit-patient/${id}`);
  }
  componentDidMount() {
    HospitalService.listUsers().then((res) => {
      this.setState({ patients: res.data });
    });
  }

  render() {
    // let patients = this.state.patient;
    return (
      <div>
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
                      style={{ marginLeft: "5px" }}
                      onClick={() => this.deletePatient(patient.email)}
                      className="btn btn-primary"
                    >
                      Delete the Account
                    </button>
                    <button
                      style={{ marginLeft: "50px" }}
                      onClick={() =>
                        this.viewPatients(patient.email, patient.password)
                      }
                      className="btn btn-success"
                    >
                      Update
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

export default viewPatient;
