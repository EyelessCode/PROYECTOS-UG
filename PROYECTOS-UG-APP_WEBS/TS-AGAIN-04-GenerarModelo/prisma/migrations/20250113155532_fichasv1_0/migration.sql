-- CreateTable
CREATE TABLE "Paciente" (
    "id" SERIAL NOT NULL,
    "cedula" TEXT NOT NULL,
    "nombres" TEXT NOT NULL,

    CONSTRAINT "Paciente_pkey" PRIMARY KEY ("id")
);

-- CreateTable
CREATE TABLE "TomaSignos" (
    "numero" SERIAL NOT NULL,
    "fecha" TIMESTAMP(3) NOT NULL,
    "pacienteId" INTEGER NOT NULL,

    CONSTRAINT "TomaSignos_pkey" PRIMARY KEY ("numero")
);

-- CreateIndex
CREATE UNIQUE INDEX "Paciente_cedula_key" ON "Paciente"("cedula");

-- AddForeignKey
ALTER TABLE "TomaSignos" ADD CONSTRAINT "TomaSignos_pacienteId_fkey" FOREIGN KEY ("pacienteId") REFERENCES "Paciente"("id") ON DELETE RESTRICT ON UPDATE CASCADE;
