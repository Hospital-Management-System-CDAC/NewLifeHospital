import React, { Component } from 'react';  
import { Button, Card, CardFooter, CardBody, CardGroup, Col, Container, Form, Input, InputGroup, InputGroupAddon, InputGroupText, Row } from 'reactstrap';  
  
class Reg extends Component {  
  
  constructor() {  
    super();  
  
    this.state = {  
       
        email: '',
        password: '',
        name: '',
        age: '',
        gender: '',
        address: '',
        phoneNumber: ''
    }
  
     
    this.changeEmailHandler = this.changeEmailHandler.bind(this);
    this.changePasswordHandler = this.changePasswordHandler.bind(this);
    this.changeNameHandler = this.changeNameHandler.bind(this);
    this.changeAgeHandler = this.changeAgeHandler.bind(this);
    this.changeGenderHandler = this.changeGenderHandler.bind(this);
    this.changeAddressHandler = this.changeAddressHandler.bind(this);
    this.changePhoneNumberHandler = this.changePhoneNumberHandler.bind(this);
    this.register = this.register.bind(this);
  }  
  
  
  
  changeEmailHandler= (event) => {
    this.setState({email: event.target.value});
}

changePasswordHandler= (event) => {
    this.setState({password: event.target.value});
}

changeNameHandler= (event) => {
    this.setState({name: event.target.value});
}
changeAgeHandler= (event) => {
    this.setState({age: event.target.value});
}

changeGenderHandler= (event) => {
    this.setState({gender: event.target.value});
}

changeAddressHandler= (event) => {
    this.setState({address: event.target.value});
}
changePhoneNumberHandler= (event) => {
    this.setState({phoneNumber: event.target.value});
}

  
  register(event) {  
  
    fetch('http://localhost:8080/Api/login/InsertEmployee', {  
      method: 'post',  
      headers: {  
        'Accept': 'application/json',  
        'Content-Type': 'application/json'  
      },  
      body: JSON.stringify({  
  
                     email: this.state.email,
                    password: this.state.password,
                    name: this.state.name,
                    age:this.state.age,
                    gender: this.state.gender,
                    address: this.state.address,
                    phoneNumber:this.state.phoneNumber
        
      })  
    }).then((Response) => Response.json())  
      .then((Result) => {  
        if (Result.Status == 'Success')  
                this.props.history.push("/Dashboard");  
        else  
          alert('Sorrrrrry !!!! Un-authenticated User !!!!!')  
      })  
  }  
  
  render() {  
  
    return (  
      <div className="app flex-row align-items-center">  
        <Container>  
          <Row className="justify-content-center">  
            <Col md="9" lg="7" xl="6">  
              <Card className="mx-4">  
                <CardBody className="p-4">  
                  <Form>  
                  <h3>Register</h3> 
                  
                    <InputGroup className="mb-3">  
                      <Input type="text"  onChange={this.email} placeholder="Enter Email Name" />  
                    </InputGroup>  
                    <InputGroup className="mb-3">  
                      <Input type="text"  onChange={this.password} placeholder="Enter password" />  
                    </InputGroup>  
                    <InputGroup className="mb-3">  
                      <Input type="password"  onChange={this.name} placeholder="Enter name" />  
                    </InputGroup>  
                    <InputGroup className="mb-4">  
                      <Input type="text"  onChange={this.age} placeholder="Enter age" />  
                    </InputGroup>  
                    <InputGroup className="mb-4">  
                      <Input type="text"  onChange={this.gender} placeholder="gender " />  
                    </InputGroup> 
                    <InputGroup className="mb-4">  
                      <Input type="text"  onChange={this.address} placeholder="Enter address" />  
                    </InputGroup> 
                    <InputGroup className="mb-4">  
                      <Input type="text"  onChange={this.phoneNumber} placeholder="Enter phone No" />  
                    </InputGroup>  
                    <Button  onClick={this.register}  color="success" block>Create Account</Button>  
                    <p className="forgot-password text-right">
                    Already registered <a href="#">sign in?</a>
                </p>
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
  
export default Reg; 