import React, { Component } from "react";
import HospitalService from "../../services/HospitalService";
import NavMenu from "../../components/profileLayout/Menu.jsx";
import Cookies from "universal-cookie";
import {
  Button,
  Card,
  CardBody,
  Col,
  Container,
  Form,
  Input,
  InputGroup,
  Row,
} from "reactstrap";

class Lab extends Component {
  constructor(props) {
    super(props);

    this.state = {
      name: "",
      email: "",
      testname: "",
      date: "",
      slot: "",
    };

    this.changeNameHandler = this.changeNameHandler.bind(this);
    this.changeEmailHandler = this.changeEmailHandler.bind(this);
    this.changeTestHandler = this.changeTestHandler.bind(this);

    this.changeDateHandler = this.changeDateHandler.bind(this);
    this.changeSlotHandler = this.changeSlotHandler.bind(this);

    this.doLab = this.doLab.bind(this);
  }
  changeNameHandler = (event) => {
    this.setState({ name: event.target.value });
  };
  changeEmailHandler = (event) => {
    this.setState({ email: event.target.value });
  };
  changeTestHandler = (event) => {
    this.setState({ testname: event.target.value });
  };

  changeDateHandler = (event) => {
    this.setState({ date: event.target.value });
  };
  changeSlotHandler = (event) => {
    this.setState({ slot: event.target.value });
  };

  doLab(event) {
    event.preventDefault();
    const cookies = new Cookies();
    let lab = {
      name: this.state.name,
      email: cookies.get("email"),
      testname: this.state.testname,
      date: this.state.date,
      slot: this.state.slot,
    };
    console.log("lab => " + JSON.stringify(lab));

    HospitalService.processLab(lab)
      .then((response) => {
        this.props.history.push("/Feed");
        // this.props.history.push("/loggingOut");
        alert(" Your have successfully registered");
      })
      .catch((error) => {
        alert(" Please try again");
      });
  }

  render() {
    return (
      <div
        className="app flex-row align-items-center"
        style={{
          paddingTop: "0",
          boxSizing: "content-box",
        }}
      >
        <NavMenu />
        <Container>
          <Row className="justify-content-center">
            <Col md="9" lg="7" xl="6">
              <Card className="mx-4">
                <CardBody className="p-4">
                  <Form onSubmit={this.doLab}>
                    <h3>Book the Test</h3>
                    <InputGroup className="mb-3">
                      <Input
                        type="text"
                        placeholder="Enter Patient Name"
                        onChange={this.changeNameHandler}
                      />
                    </InputGroup>

                    <InputGroup className="form-group">
                      <select
                        value={this.state.value}
                        onChange={this.changeTestHandler}
                      >
                        <option value="test">Test</option>
                        <option value="blood">Blood</option>
                        <option value="MRI">MRI</option>
                        <option value="X-Ray">X-Ray</option>
                        required
                      </select>
                    </InputGroup>

                    <InputGroup className="mb-3">
                      <Input
                        type="date"
                        placeholder="Enter date"
                        onChange={this.changeDateHandler}
                      />
                    </InputGroup>
                    <InputGroup className="mb-3" class="dropdown-menu">
                      <Input
                        type="text"
                        placeholder="slot"
                        onChange={this.changeSlotHandler}
                      />
                    </InputGroup>

                    <Button color="success" block>
                      Book Appoinment{" "}
                    </Button>
                  </Form>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </Container>
      </div>
    );
  }
}

export default Lab;
