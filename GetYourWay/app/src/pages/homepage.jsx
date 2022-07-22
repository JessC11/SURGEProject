import React from 'react';
import LoginForm from '../components/loginform';
import RegistrationForm from '../components/registrationform';
import Background from '../homepageimg.jpeg';

import '../homepage.css'

function Homepage() {
    return( 
        <div className='homepage-content'>
            <div className='form-container'>

                <div className='form-col1'>
                    <LoginForm />
                </div>
                <div className='form-col2'>
                    <RegistrationForm />
                </div>
            
            </div>
        </div>
    );

}

export default Homepage;