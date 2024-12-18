import express from 'express';
const app = express();
const PORT = 4000;
app.use(express.json());
app.get('/', (req, res) => {
    res.send('BIENVENIDOS A EXPRESS CON TS');
});
app.listen(PORT, () => console.log(`Servidor Web escuchando en el puerto ${PORT}`));
