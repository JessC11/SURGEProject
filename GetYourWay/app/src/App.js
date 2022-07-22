import './App.css';
import './navbar.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navibar from './components/Navbar';
import Searching from './pages/Searching';
import backgr from './img/homepageimg.jpeg';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Destination from './pages/Destination';
import Flights from './pages/Flights';

function App() {
  return (
  <BrowserRouter> 

<Navibar />

    <div className="App">
            <Routes>
              <Route path = "/flights" element = {<Flights/>}/>
              <Route path = "/destination" element={<Destination/>}/>
              <Route path = "/search" exact element={<Searching/>}/>
            </Routes>
    </div>

  </BrowserRouter>
  );
}
export default App;
