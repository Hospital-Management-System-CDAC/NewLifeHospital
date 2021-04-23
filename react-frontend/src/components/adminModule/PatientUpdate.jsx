import React, { Component } from "react";
import HospitalService from "../../services/HospitalService";
import NavMenu from "../../components/profileLayout/Menu.jsx";
import Cookies from "universal-cookie";
import { Button, Form, Input, InputGroup } from "reactstrap";
class ListPatientComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      patient: {},
      email: "",
      password: "",
      name: "",
      age: 0,
      gender: "",
      address: "",
      phoneNumber: 0,
    };

    this.changePasswordHandler = this.changePasswordHandler.bind(this);
    this.changeNameHandler = this.changeNameHandler.bind(this);
    this.changeAgeHandler = this.changeAgeHandler.bind(this);
    this.changeGenderHandler = this.changeGenderHandler.bind(this);
    this.changeAddressHandler = this.changeAddressHandler.bind(this);
    this.changePhoneNumberHandler = this.changePhoneNumberHandler.bind(this);
    this.updateProfile = this.updateProfile.bind(this);
  }

  componentDidMount() {
    const cookies = new Cookies();
    HospitalService.getPatientById(
      cookies.get("id"),
      cookies.get("password")
    ).then((res) => {
      console.log(res.data);
      this.setState({ patient: res.data });
      console.log(this.state.patient);
    });
  }
  changePasswordHandler = (event) => {
    this.setState({ password: event.target.value });
  };

  changeNameHandler = (event) => {
    this.setState({ name: event.target.value });
  };
  changeAgeHandler = (event) => {
    this.setState({ age: event.target.value });
  };

  changeGenderHandler = (event) => {
    this.setState({ gender: event.target.value });
  };

  changeAddressHandler = (event) => {
    this.setState({ address: event.target.value });
  };
  changePhoneNumberHandler = (event) => {
    this.setState({ phoneNumber: event.target.value });
  };

  updateProfile(event) {
    event.preventDefault();
    const cookies = new Cookies();
    let patients = {
      email: cookies.get("id"),
      password: cookies.get("password"),
      name: this.state.name,
      age: this.state.age,
      gender: this.state.gender,
      address: this.state.address,
      phoneNumber: this.state.phoneNumber,
    };
    console.log("patients => " + JSON.stringify(patients));

    HospitalService.updatePatient(patients)
      .then((response) => {
        alert("Your profile is updated");
        window.location.reload();
      })
      .catch((error) => {
        alert(" Please try again");
      });
  }

  render() {
    //let patient = this.state.patients;
    return (
      <div>
        <NavMenu />

        <div className="card text-white bg-info mb-3" class="card text-center">
          <h3>Patient Details</h3>

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
        <div>
          <Form onSubmit={this.updateProfile}>
            <h3>Edit</h3>

            <InputGroup className="mb-3">
              <Input
                type="text"
                onChange={this.changeNameHandler}
                placeholder="Enter name"
                required
              />
            </InputGroup>
            <InputGroup className="mb-4">
              <Input
                type="number"
                onKeyPress={() => "return event.charCode >= 48"}
                min="0"
                max="150"
                onChange={this.changeAgeHandler}
                placeholder="Enter age"
                required
              />
            </InputGroup>
            <InputGroup className="mb-4">
              <select
                value={this.state.value}
                onChange={this.changeGenderHandler}
              >
                <option value="gender">Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                required
              </select>
            </InputGroup>
            <InputGroup className="mb-4">
              <Input
                type="text"
                onChange={this.changeAddressHandler}
                placeholder="Enter address"
              />
            </InputGroup>
            <InputGroup className="mb-4">
              <Input
                type="number"
                onKeyPress={() => "return event.charCode >= 48"}
                min="1000000000"
                max="9999999999"
                onChange={this.changePhoneNumberHandler}
                placeholder="Enter phone No"
              />
            </InputGroup>
            <Button
              type="submit"
              style={{ marginLeft: "20px" }}
              className="btn btn-success"
            >
              Save
            </Button>
          </Form>
        </div>
      </div>
    );
  }
}

export default ListPatientComponent;
