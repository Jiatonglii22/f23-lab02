import { newRenderer } from "./renderer.js"
import { newRectangle } from "./shapes/rectangle.js";
import { newCircle } from "./shapes/circle.js";
import { newSquare } from "./shapes/square.js"; 
import {Shape} from "./shapes/shape"

//Rectangle 
const rectangle: Shape = newRectangle(2, 3);
const renderer = newRenderer(rectangle);
renderer.draw();

//Circle 
const circle: Shape = newCircle(5); 
const renderer2 = newRenderer(circle); 
renderer2.draw(); 

//Square 

const square: Shape = newSquare(3); 
const renderer3 = newRenderer(square); 
renderer3.draw(); 