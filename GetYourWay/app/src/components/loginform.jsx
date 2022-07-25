import React, { useState } from "react";
import ReactDOM from "react-dom";
import { useNavigate } from "react-router-dom";

import "../form.css";

const LoginForm = () => {
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);
  const [email, setEmail] = useState('');
  const [passwordHash, setPassword] = useState('');
  
  const errors = {
    loginError: "Invalid login details",
    userError: "No user exists. Please sign up."
  };

  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault();

    const customerInput = {email, passwordHash}
    let address = 'http://localhost:8080/login';
    const request = {
        method: 'POST',
        headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
        'Access-Control-Allow-Headers': '*'
      },
        body: JSON.stringify(customerInput)
    }
    fetch(address , request)
    .then(response=>{
        if(response.status === 302) {
          setIsSubmitted(true)
          console.log(response)
          setTimeout(() =>navigate('/search'),3000);
        } else if (response.status === 400){
          setErrorMessages({ name: "loginerror", message: errors.loginError });
        } else {
          setErrorMessages({ name: "loginerror", message: errors.userError });
        }
    })

 };

  const renderErrorMessage = (name) =>
    name === errorMessages.name && (
      <div className="error">{errorMessages.message}</div>
    );

  const renderForm = (
    <div className="log-form">
      <form onSubmit={handleSubmit}>
        <div className="input-container">
          <label>Email </label>
          <input type="text" name="email" required placeholder="Enter email" 
          value={email} onChange={event=>setEmail(event.target.value)}/>
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="pass" required placeholder="Password" 
          value={passwordHash} onChange={event=>setPassword(event.target.value)}/>
        </div>
        <div className="button-container">
          <input type="submit" />
        </div>
        {renderErrorMessage("loginerror")}
      </form>
    </div>
  );

  const renderSuccessfulLogin =(

    <div className="login-success-message">
      <p>Successfully logged in</p>
      <p>Taking you to the search page</p>
      <div class="lds-roller"><div></div><div></div><div></div><div></div><div></div><div></div><div></div><div></div></div>
    
    </div>
  
  );

  return (
    
      <div className="log-form">
        <div className="info">Already have an account?</div>
        <div className="login-title">Sign In</div>
        {isSubmitted ? renderSuccessfulLogin : renderForm}
      </div>
    
  );
}

export default LoginForm;