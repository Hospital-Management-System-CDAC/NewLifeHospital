import React, { Component } from "react";
import HospitalService from "../../services/HospitalService";
import NavMenu from "../../components/profileLayout/Menu.jsx";
import Cookies from "universal-cookie";

class ListPatientComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      patient: {},
    };
  }

  componentDidMount() {
    const cookies = new Cookies();
    HospitalService.getPatientById(
      cookies.get("email"),
      cookies.get("pwd")
    ).then((res) => {
      console.log(res.data);
      this.setState({ patient: res.data });
      console.log(this.state.patient);
    });
  }

  render() {
    //let patient = this.state.patients;
    return (
      <div>
        <NavMenu />

        <div className="card text-white bg-info mb-3" class="card text-center">
          <h3>Personal Information</h3>

          <div className="card-body">
            <div className="row">
              <label> Email :</label>
              <div> {this.state.patient.email}</div>
            </div>

            <div className="row">
              <label> Name :</label>
              <div> {this.state.patient.name}</div>
            </div>
            <div className="row">
              <label> Age :</label>
              <div> {this.state.patient.age}</div>
            </div>
            <div className="row">
              <label> Gender :</label>
              <div> {this.state.patient.gender}</div>
            </div>
            <div className="row">
              <label> Address :</label>
              <div> {this.state.patient.address}</div>
            </div>
            <div className="row">
              <label> Phone Number :</label>
              <div> {this.state.patient.phoneNumber}</div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default ListPatientComponent;
