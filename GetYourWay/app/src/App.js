import './App.css';
import './navbar.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navibar from './components/Navbar';
import Searching from './pages/Searching';
import backgr from './img/homepageimg.jpeg';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Searching from './views/Searching';
import Destination from './views/Destination';

const App = () => {
  return (
    <div className="App">
      <header>
      <Navibar/>
      </header>
      <body>
      <Searching/>
      </body>
        <Router>
            <Routes>
              <Route path = "/destination" element={<Destination/>}/>
              <Route path = "/search" exact element={<Searching/>}/>
            </Routes>
         </Router>
    </div>
  );
}

export default App;
