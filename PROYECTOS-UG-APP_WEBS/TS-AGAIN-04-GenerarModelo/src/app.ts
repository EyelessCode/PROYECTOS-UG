import { PrismaClient } from "@prisma/client";

const prisma=new PrismaClient()

async function createPaciente() {
    const paciente=await prisma.paciente.create({
        data:{
            cedula:"0943791061",
            nombres:"Cristhian Josué Guedes Guillén"
            
        }
    })

    return paciente
}

async function main() {
    const paciente=await createPaciente()
}

main()