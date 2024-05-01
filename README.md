<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Repositorio: Calificación de Películas en Java</title>
  <style>
    body {
      font-family: sans-serif;
      margin: 20px;
    }

    h1 {
      text-align: center;
      font-size: 24px;
    }

    h2 {
      font-size: 18px;
      margin-top: 20px;
    }

    p {
      line-height: 1.6;
    }

    ul {
      list-style-type: disc;
      margin-left: 20px;
    }

    pre {
      background-color: #f6f8fa;
      border: 1px solid #ddd;
      padding: 10px;
      font-family: monospace;
    }

    strong {
      font-weight: bold;
    }
  </style>
</head>
<body>
  <h1>Repositorio: Calificación de Películas en Java</h1>

  <p>Este repositorio contiene un proyecto Java que permite a los usuarios calificar una película y obtener la calificación promedio en tiempo real. Es ideal para obtener feedback instantáneo de los espectadores sobre un filme en particular.</p>

  <h2>Características:</h2>

  <ul>
    <li><strong>Entrada de usuario:</strong> El programa solicita el nombre de la película y las calificaciones individuales.</li>
    <li><strong>Validación de calificaciones:</strong> Se asegura que las calificaciones ingresadas estén entre 1 y 5.</li>
    <li><strong>Visualización de resultados:</strong> Al finalizar la entrada de datos, se muestra el nombre de la película, la calificación promedio y un detalle de las calificaciones individuales.</li>
    <li><strong>Manejo de errores:</strong> El programa maneja entradas no numéricas y verifica que las calificaciones estén dentro del rango válido.</li>
  </ul>

  <h2>¿Cómo funciona?</h2>

  <ol>
    <li>El usuario ingresa el nombre de la película.</li>
    <li>Se le pide al usuario que ingrese una calificación entre 1 y 5.</li>
    <li>El programa valida la entrada y la almacena.</li>
    <li>Se repiten los pasos 2 y 3 hasta que el usuario decide no ingresar más calificaciones.</li>
    <li>El programa calcula la calificación promedio y la muestra junto con el nombre de la película y el detalle de las calificaciones individuales.</li>
  </ol>

  <h2>Ejemplo de ejecución:</h2>

  <pre>
Nombre de la película: El Padrino
Calificación 1: 5
Calificación 2: 4
Calificación 3: 5
...
Calificación 10: 3

Calificación promedio: 4.5

Calificaciones individuales:
1. 5
2. 4
3. 5
...
10. 3
  </pre>

  <h2>Tecnologías utilizadas:</h2>

  <ul>
    <li>Java</li>
  </ul>

  <h2>Entorno de desarrollo:</h2>

  <ul>
    <li>IntelliJ IDEA</li>
  </ul>

  <h2>¿Cómo usar este repositorio?</h2>

  <ol>
    <li>Clona el repositorio en tu ordenador local.</li>
    <li>Abre el proyecto en IntelliJ IDEA.</li>
    <li>Ejecuta la clase principal `EvaluacionPeliculas`.<br>
        **Nota:** El nombre de la clase principal puede variar según la estructura del proyecto.</li>
    <li>Sigue las instrucciones en pantalla para ingresar las calificaciones de la película.</li>
  </ol>

  <h2>Recursos adicionales:</h2>

  <ul>
    <li><a href="https://docs.oracle.com/en/java/">Documentación de Java</a></li>
    <li><a href="https://www.youtube.com/watch?v=eIrMbAQSU34">Tutoriales de Java en YouTube</a></li>
  </ul>

  <h2>¡Contribuye!</h2>

  <p>Siéntete libre de contribuir a este proyecto creando nuevas características, corrigiendo errores o mejorando la documentación.</p>

  <h2>¡Que la disfrutes!</h2>
</body>
