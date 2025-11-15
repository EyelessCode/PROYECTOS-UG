import Student from "./models/estudiante";

const student=new Student("0943791061","Cristhian Josué","Guedes Guillén",22,"cristhian.guedesg@ug.edu.ec")

function print() {
    const university=`UNIVERSIDAD DE GUAYAQUIL`
    const career=`SISTEMAS DE INFORMACIÓN`
    console.log(`
        Institución: ${university}\n
        Carrera: ${career}\n
        ${"=".repeat(15)}\n
        Estudiante: ${student.getLastname} ${student.getName}\n
        Edad: ${student.getAge}\tEmail: ${student.getEmail}\n
        Estado: ${student.getIsActive}
    `)
}

print()
