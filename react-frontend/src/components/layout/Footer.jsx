import React, { Component } from "react";
import pic from "../../images/hospPic.png";

class Footer extends Component {
  state = {};
  render() {
    return (
      <div style={{ paddingTop: "300px", paddingBottom: 0 }}>
        <nav className="navbar navbar-expand-lg  bg-info">
          <img
            src={pic}
            style={{
              width: 100,
              height: 80,

              left: this.props.left,
            }}
            alt="y?"
          />
          <p>@All Rights Reserved</p>
        </nav>
      </div>
    );
  }
}

export default Footer;
