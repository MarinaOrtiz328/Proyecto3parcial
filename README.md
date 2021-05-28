# Proyecto tercer parcial

Descripción "Utilizando los conocimientos adquiridos en la unidad, vamos a crear nuestro primer sitio web para esto toma en cuenta el siguiente problema"

## Instrucciones de proyecto 📋

Para el tercer parcial se requiere realizar un proyecto para la plataforma Android que cumpla las siguientes características:

a) Debe implementar una interfaz visual que muestre los datos de su curriculum. (nombre completo, bio, educación y lista de habilidades)

b) Los datos deben provenir del servidor web creado en el proyecto del parcial II la ruta es /{matricula} (debe haber una ruta por cada integrante).

Se debe entregar una actividad que funcione como menú y que lleve a cada curriculum de cada miembro del equipo.

Entregable: Cada miembro del equipo deberá subir la liga de su repositorio en gitlab / github.
 
## Miembros del equipo

Ana Marina Ortiz Ruiz 329577

Daniel Lopez Villalobos 315120

Daniel Flotte Corral 329842

## Requerimientos

Tener instalado ngrok y node

## Instrucciones para ejecutar ⚙️


Corremos el servidor en la terminal de la siguiente manera:

```
node app.js
```

Nos vamos a la carpeta donde se encuentra ngrok y lo ejecutamos


```
./ngrok http 8888 
```

(ya que es el puerto usado en el servidor)
Copiar el link que aparece después de la palabra "Forwarding".
En el proyecto de Android, en la clase MainActivity.java, en el método onClick() modificar la variable "url" con el link de ngrok.

