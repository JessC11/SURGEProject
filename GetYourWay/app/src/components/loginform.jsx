import React, { useState } from "react";
import ReactDOM from "react-dom";
import { useNavigate } from "react-router-dom";

import "../form.css";

function LoginForm() {
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);

  // User Login info
  const database = [
    {
      email: "user1",
      password: "pass1",
    }
  ];

  const errors = {
    loginError: "Invalid login details"
  };

  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault();

    var { email, pass } = document.forms[0];

    const userData = database.find((user) => user.email === email.value);

    if (userData) {
      if (userData.password !== pass.value) {
        // Invalid password
        setErrorMessages({ name: "loginerror", message: errors.loginError });
      } else {
        setIsSubmitted(true);
      }
    } else {
      // Username not found
      setErrorMessages({ name: "loginerror", message: errors.loginError });
    }

    setTimeout(() =>navigate('/search'),3000);
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
          <input type="text" name="email" required placeholder="Enter email" />
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="pass" required placeholder="Password" />
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