import './App.css';
import './navbar.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navibar from './components/Navbar';
import Searching from './pages/Searching';
import backgr from './img/homepageimg.jpeg';

const App = () => {
  return (
    <div className="App">
      <header>
      <Navibar/>
      </header>
      <body>
      <Searching/>
      </body>
    </div>
  );
}

export default App;
