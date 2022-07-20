import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Searching from './views/Searching';
import Destination from './views/Destination';

const App = () => {
  return (
    <div className="App">
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
