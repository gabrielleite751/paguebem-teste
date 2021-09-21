import React from 'react';
import './index.css';
import Statistics from './pages/Statistics';
import Contact from './pages/Contact';
import Products from './pages/Products';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import NavBar from './components/NavBar';
import Footer from './components/Footer';

export default (props) => (
  <Router>
    <div className="App">
      <div>
			<NavBar />
      </div>
				<div>
				<Switch>
      	  <Route path='/' exact component={Home}/>
      	  <Route path='/statistics' exact component={Statistics}/>
      	  <Route path='/contact' exact component={Contact}/>
      	  <Route path='/products' exact component={Products}/>
      	</Switch>
				</div>
			<div>
			<Footer />
			</div>
    </div>
  </Router>
)

const Home = () => (
  <div>
    <h1>Home Page</h1>
		<h1>About Us</h1>
		<p>
		Lorem ipsum dolor sit amet. Sed sint illo qui nisi delectus ea sapiente delectus atque doloribus. Non omnis officiis et error doloribus ad quam adipisci.

		Sit voluptates dolorem et quae aliquid cum nihil animi sed voluptas neque sit corrupti nihil et suscipit blanditiis. Ut expedita voluptatibus eos molestiae numquam id repellendus magni. Ea sequi consequatur et neque rerum qui fuga rerum non officia quis est sint eligendi non doloremque nulla qui veniam fuga.

		Et impedit sint qui velit libero sit perspiciatis dolorem et minus quos in eveniet voluptatum qui delectus deleniti est facilis dolores. Aut consequatur quidem sed tenetur galisum 33 iste quod.
		</p>

  </div>
)