import express, { Request, Response } from 'express'
import routerSignos from './router/router'
import 'dotenv/config'

const app=express()
const PORT=process.env.PORT||4001

app.use(express.json())
// app.use(express.static('public'))
app.use('/api',routerSignos)
app.get('/test',(req:Request,res:Response)=>{
    res.send('HOLA MUNDO!')
})

app.listen(PORT,()=>console.log(`ESCUCHANDO EN EL PUERTO ${PORT}`))