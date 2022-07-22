import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import logo from '../surgelogo6.png';

function Navibar() {
  return (
    <header>
        <Navbar className='nav' expand="lg" variant="light">
        <Container className='navbar' fluid>
          <Navbar.Brand href="/"><img src={logo} class="img-fluid" id="nav-logo"/></Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/home">Login</Nav.Link>
            <Nav.Link href="/search">My Search</Nav.Link>
            <Nav.Link href="/destination">Destination</Nav.Link>
            <Nav.Link href="/journey">My Journey</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      </header>
  );
}

export default Navibar;