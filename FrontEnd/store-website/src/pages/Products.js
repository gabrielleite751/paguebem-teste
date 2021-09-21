import React from 'react';
import Card from '../components/Card'
import api from "../services/api";
import styles from './Products.module.css'

function Products() {
  const [products, setProducts] = React.useState([]);
  let content = null;

  React.useEffect(() => {
	api
	  .get("/products")
	  .then((response) => setProducts(response.data))
	  .catch((err) => {
		console.error("error" + err);
	  });
  }, []);

  if (products) {
    content = 
    products.map((product, key) =>
      <Card key={product.code}
        product={product}
      />
    )
  }
  return (
  <div className={styles.Container}>
      <h1 style={{display: "flex"}}>
        Products
      </h1>
      <div style={{display: "flex"}}>
        {content}
      </div>    
    </div>
  )
 
}

export default Products;