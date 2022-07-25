import React, { useState } from "react";
import ReactDOM from "react-dom";

import "../form.css";

const RegistrationForm = () => {
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const [email, setEmail] = useState('');
  const [passwordHash, setPassword] = useState('');
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');

  const errors = {
    submitError: "Please fill out all fields",
    passwordError: "Passwords do not match"
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const newCustomer = {email, passwordHash, firstName, lastName }
    console.log(newCustomer)
    let address = 'http://localhost:8080/registration';
    const request = {
        method: 'POST',
        headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
        'Access-Control-Allow-Headers': '*'
      },
        body: JSON.stringify(newCustomer)
    }
    fetch(address , request)
    .then(result=>{
        setIsSubmitted(result)
        console.log(result)
    })
  }

function checkpassword() {
    if (checkpassword.value){
      if (passwordHash.value !== checkpassword.value) {
        setErrorMessages({ name: "passworderror", message: errors.passwordError });
      }
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
          <input type="text" name="firstName" required placeholder="Enter your first name" 
            value={firstName} onChange={event=>setFirstName(event.target.value)}/>
        </div>
        <div className="input-container">
          <label>Last Name</label>
          <input type="text" name="lastName" required placeholder="Enter your last name" 
          value={lastName} onChange={event=>setLastName(event.target.value)}/>
        </div>
        </div>
        <div className="input-container">
          <label>Email </label>
          <input type="text" name="email" required placeholder="Enter email" 
          value={email} onChange={event=>setEmail(event.target.value)}/>
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="password" required placeholder="Password" 
          value={passwordHash} onChange={event=>setPassword(event.target.value)}/>
        </div>
        <div className="input-container">
          <label>Confirm Password </label>
          <input type="password" name="confpass" required placeholder="Confirm password" onClick={checkpassword(passwordHash)}/>
        </div>
        {renderErrorMessage("passerror")}
        <div className="button-container">
          <input type="submit" />
        </div>
      </form>
    </div>
  );

    const renderSuccessfulSignup =(

    <div className="register-success-message">
      <p>Sign up successful! New user created. </p>
      <p>You can now sign in</p>
    </div>
    
    );

  return (

      <div className="reg-form">
        <div className="info">Not already a member?</div>
        <div className="reg-title">Register</div>
        {isSubmitted ? renderSuccessfulSignup : renderForm}
      </div>
    
  );
}

export default RegistrationForm;