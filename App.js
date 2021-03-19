import React from 'react';  
import logo from './logo.svg';  
import './App.css';  
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Login from './Login';  
import Reg from './Reg';  
import Dashboard from './Dashboard';  
import car from './images/download.png';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';   
function App() {  
  return (  
    
    <Router>    
      
      <nav class="navbar navbar-inverse">
  <div class="container-fluid">
  <nav class="navbar navbar-expand-sm bg-dark justify-content-center">
                  
                  <div><h2 className="navbar-brand"  class="display-4" style={{color: "lightgreen"}}> NEWLIFE HOSPITAL
                  </h2></div>
                 
                  </nav>
    <ul class="nav navbar-nav navbar-left">
    <li className="nav-item" class="glyphicon glyphicon-user">    
                <Link to={'/Login'} className="nav-link">
                  <h4>Login</h4></Link>    
              </li>    
              <li className="nav-item"  class="glyphicon glyphicon-log-in">    
                <Link to={'/Signup'} className="nav-link">
                  <h4>Sign Up</h4></Link>    
              </li>  
    </ul>
  </div>
</nav>

  
       
        <Switch>    
          <Route exact path='/Login' component={Login} />    
          <Route path='/Signup' component={Reg} />    
       
        </Switch>    
        <Switch>  
        <Route path='/Dashboard' component={Dashboard} />    
        </Switch>  
        <div>
             <img src={car} alt="this is car image" />
        </div>
      
         
    </Router>   
   
  );  
}  
  
export default App;  
