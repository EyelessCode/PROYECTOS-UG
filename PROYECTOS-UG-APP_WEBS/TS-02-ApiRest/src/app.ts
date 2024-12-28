import express from 'express';
import ClienteRoutes from './routes/cliente.router'


const app=express();
const PORT=4000;

app.use(express.json());
app.use('/api',ClienteRoutes);

app.listen(PORT,()=>console.log(`Servidor escuchando ${PORT}`));