import './App.css';
import './navbar.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navibar from './components/Navbar';
import Searching from './pages/Searching';
import backgr from './img/homepageimg.jpeg';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Destination from './pages/Destination';
import Flights from './pages/Flights';
import Homepage from './pages/homepage';
import Journey from './pages/Journey';
import Testing from './pages/Testing';
import Admin from './pages/Admin';


function App() {
  return (
  <BrowserRouter> 

<Navibar />

    <div className="App">
            <Routes>
              <Route path="/" element={<Homepage/>}/>
              <Route path = "/journey" element = {<Journey/>}/>
              <Route path = "/flights" element = {<Flights/>}/>
              <Route path = "/destination" element={<Destination/>}/>
              <Route path = "/search" exact element={<Searching/>}/>
              <Route path = "/testing" exact element={<Testing/>}/>
              <Route path = "/admin" exact element={<Admin/>}/>
            </Routes>
    </div>

  </BrowserRouter>
  );
}
export default App;
