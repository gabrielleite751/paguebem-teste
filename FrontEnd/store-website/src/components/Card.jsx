import "./Card.css"
import React from "react"


const Card = (props) => {
  console.log(props.product.imgUrl)
  return (
    <div className="Card">
      <div className="Content" style={{backgroundImage: `url(${props.product.imgUrl})`}}>
      </div>
      <div className="Footer">
        <h2>{props.product.name} {props.product.brand}</h2>
        <p>R$ {props.product.price}</p>  
      </div>
    </div>
  )
}

export default Card;