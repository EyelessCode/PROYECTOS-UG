EL SENTIDO DEL PROYECTO ES MOSTRAR DATOS DE UNA TABLA EN CONCRETO UNIÉNDO OTRAS TABLAS CON CAMPOS ESPECÍFICOS PARA ASÍ MOSTRAR LOS DATOS, TANTO EN CONSOLA COMO EN LA INTERFAZ.

EN LA PRESENTACIÓN DE LA 'CONSOLA' CON LA CONEXIÓN Y LA INSERCIÓN/PRESENTACIÓN DE LOS DATOS ES LA SIGUIENTE:

1. LA PRESENTACIÓN DE DATOS DE 'CIRCUITS' TOTALMENTE, PERO AL SER UNA CANTIDAD GIGANTESCA SE LIMITÓ EN LA CONSULTA A SÓLO 5 FILAS. LA CAPTURA ES LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/a2a0bb08-f0aa-4dab-a648-e1d87a53cee4)

2. LA PRESENTACIÓN DE DATOS DE 'CIRCUITS' PERO ESPECIFICANDO UN PAÍS DE LOS CONDUCTORES, AL ESTAR ESPECIFICADO PORM PAÍS LA CANTIDAD DE DATOS EN FILA PUEDE VARIAR PERO EN ESTA OCACIÓN NO SE USÓ UN LÍMITE, LA CAPTURA ES LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/3b46149f-f1dd-41d9-bd05-6da7d5a2cb9f)

3. EN LA PRESENTACIÓN DE LOS CONDUCTORES YA ORIENTADO AL RESULTADO ('DRIVER_RESULT'), ES DECIR, A LA CANTIDAD DE VICTORIAS, RANGO, PUNTAJE DE CADA PARTICIPANTE, SE CREÓ UN REPOSITORIO YA QUE NO EXISTE UNA TABLA DE 'BD' (BASE DE DATOS) PARA ESTE OBJETIVO. COMO EL OBJETIVO ES FILTRAR POR AÑO PARA QUE ARROJARA DATOS COMO NOMBRE, APELLIDO, VICTORIAS, PUNTAJE TOTAL Y RANGO SE HIZO UN REPOSITORIO DONDE CONLLEVA LOS CAMPOS DE DRIVERS, RESULTS Y DRIVERSTANDINGS DE LA 'BD', EN EL CÓDIGO SE EJECUTÓ EL AÑO ESPECÍFICO DE: '1985', LA CAPTURA ES LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/7872f753-7ef1-4a20-b37d-2f748c8d5f29)

4. AHORA, EN LA PRESENTACIÓN DE TEMPORADAS 'SEASON' SE TIENE OBLIGATORIAMENTE QUE ESPECIFICAR UN AÑO, PERO EN ESTE CASO SE HIZO QUE ARROJARA TODOS LOS RESULTADOS DE 'MENOR A MAYOR' JUNTO CON SUS URL DE CADA AÑO, LA CAPTURA ES LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/e077bcb1-1053-4d85-bac9-772f8ec3ef56)

5. POR ÚLTIMO EN LA PRESENTACIÓN EN 'CONSOLA' SON LAS MISMAS TEMPORADAS PERO ORDENADAS DE 'MAYOR A MENOR' USANDO 'DESC' PARA EL CORRECTO ORDEN, LA SIGUIENTE CAPTURA ES LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/23400576-72f6-4aec-b6a7-c01c1c8584d0)

AHORA PARA EL LADO DE LA INTERFAZ SE HIZO UNA UN TABLEVIEW Y UN COMBOBOX, EN EL TABLEVIEW SE PRESENTA LOS DATOS EN FILAS ORDENADOS EN COLUMNAS, CADA CAMPO VA PARA CADA COLUMNA. MEDIANTE EL COMBOBOX FILTRO EL AÑO PARA QUE ME MUESTRE LOS DATOS ESPECÍFICOS DE ESE AÑO. LA PRESENTACIÓN EN LA PANTALLA SERÍA LA SIGUIENTE:

1. VENTANA SIN MUESTRA DE DATOS, INTERFAZ PURA:
![image](https://github.com/user-attachments/assets/1aa01c34-cec5-46a3-8a66-3ff88eb2214a)

2. PARA LA PRESENTACIÓN DE DATOS DE UN AÑO FILTRADO SERÍA LA SIGUIENTE:
![image](https://github.com/user-attachments/assets/b7cd1c0a-7f70-41c7-ba91-99c291fbc5c3)

ESO SERÍA ABSOLUTAMENTE TODO.
