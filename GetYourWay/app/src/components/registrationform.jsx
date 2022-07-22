import React, { useState } from "react";
import ReactDOM from "react-dom";

import "../form.css";

function RegistrationForm() {
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);

  const errors = {
    submitError: "Please fill out all fields",
    passError: "Passwords do not match"
  };

  const handleSubmit = (event) => {

    event.preventDefault();

    var { fname, lname, email, pass, confpass } = document.forms[0];

    //need to send user info to database

  
      if (pass !== confpass) {
        // Invalid password
        setErrorMessages({ name: "passerror", message: errors.passError });
      }
    }

  const renderErrorMessage = (name) =>
    name === errorMessages.name && (
      <div className="error">{errorMessages.message}</div>
    );


  const renderForm = (
    <div className="reg-form">
      <form onSubmit={handleSubmit}>
      <div className="name-container">
      <div className="input-container">
          <label>First Name</label>
          <input type="text" name="fname" required placeholder="Enter your first name" />
        </div>
        <div className="input-container">
          <label>Last Name</label>
          <input type="text" name="lname" required placeholder="Enter your last name" />
        </div>
        </div>
        <div className="input-container">
          <label>Email </label>
          <input type="text" name="email" required placeholder="Enter email" />
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="pass" required placeholder="Password" />
        </div>
        <div className="input-container">
          <label>Confirm Password </label>
          <input type="password" name="confpass" required placeholder="Confirm password" />
        </div>
        {renderErrorMessage("passerror")}
        <div className="button-container">
          <input type="submit" />
        </div>
      </form>
    </div>
  );

  return (

      <div className="reg-form">
        <div className="info">Not already a member?</div>
        <div className="reg-title">Register</div>
        {isSubmitted ? <div className="success-message">Sign up successful! \n New user created. \n You can now sign in.</div> : renderForm}
      </div>
    
  );
}

export default RegistrationForm;