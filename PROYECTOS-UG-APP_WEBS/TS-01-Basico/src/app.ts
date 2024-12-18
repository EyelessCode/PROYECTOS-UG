/* let saludo:String="Bienvenido a mi mundo animal!";

console.log(saludo); */

import express, { Request, Response } from 'express';

const app = express();
const PORT = 4000;

app.use(express.json());
app.get('/',(req:Request,res:Response)=>{
    res.send('BIENVENIDOS A EXPRESS CON TS');
})
app.listen(PORT, () => console.log(`Servidor Web escuchando en el puerto ${PORT}`));