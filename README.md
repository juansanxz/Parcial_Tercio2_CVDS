# LABORATORIO 7
# ESCUELA COLOMBIANA DE INGENIERÍA
# CICLOS DE VIDA DEL DESARROLLO DE SOFTWARE - CVDS

## Finalización CI/CD - Manejo de Data - ORM
## PARTE II. USANDO SPRING DATA DESDE CERO
**Crea un nuevo repositorio en tu cuenta de github llamado cvds-7, y sigue lasinstrucciones delsiguiente tutorial de spring. https://medium.com/@saultobias13/a-quick-start-with-spring-boot-and-spring-data-jpa-32718a8f4706**
* Creación del proyecto:
<img src='https://user-images.githubusercontent.com/123812766/227719912-e1a61656-d445-4663-ab11-7664cc6de4f3.png' width=100% height=100%/>

* Luego de generarlo e importarlo en eclipse, en el pom.xml se evidencia las dependencias añadidas:
<img src='https://user-images.githubusercontent.com/123812766/227720371-21a5eeda-b5a2-49c4-8df9-b0728ecb0e09.png' width=50% height=50%/>

* Y en el paquete main encontramos la clase que va a ser el punto de entrada de la aplicación, esto lo sabemos por la anotación de @SpringBootApplication:
<img src='https://user-images.githubusercontent.com/123812766/227720518-c0196b8e-a9b0-4c49-9e9a-90d13d5304b9.png' width=50% height=50%/>

* Después, añadiendo las propiedades para la base de datos H2, en el archivo application.properties:
<img src='https://user-images.githubusercontent.com/123812766/227720729-7abd95b4-cf87-4bb5-8c97-4f208495a58a.png' width=50% height=50%/>  

* Código de la clase Employee se encuentra en el proyecto.
* Se crea una interfaz de repositorio en el paquete com.santiyjuan.repository:
```
package com.santiyjuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiyjuan.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
```
* Se creó un paquete com.santiyjuan.service, con el código especificado en la guía.
* Se añadió el código especificado a la clase con la anotación @SpringBootApplication.
* Al compilar y ejecutar la aplicación, obtenemos lo siguiente:
<img src='https://user-images.githubusercontent.com/123812331/229292561-b9d91e42-fdb9-4b36-8a67-22f626810f4a.png' width=50% height=50%/>

* Descargar imagen de MySQL, desde docker desktop:  
<img src='https://user-images.githubusercontent.com/123812331/229293115-042a5040-8f84-44ce-b841-af7b756c0b14.png' width=50% height=50%/>    

* Correr contenedor de MySQL:  
<img src='https://user-images.githubusercontent.com/123812331/229293498-56d3e274-71e0-41fb-9d35-70f39d090a95.png' width=50% height=50%/>  

* Descargar cliente de base de datos en Dbeaver.  

* Luego de realizar la conexión, usando la clave creada con el comando docker run, debemos establecer en true el driver property allowPublicKeyRetrieval: 
 
<img src='https://user-images.githubusercontent.com/123812331/229295071-40ebffb8-c43c-4168-8238-48f69ef0b3ed.png' width=50% height=50%/>   

* Crear una tabla de la base de datos: EMPLOYEE, con las columnas especificadas.  
<img src='https://user-images.githubusercontent.com/123812331/229295567-7acb579b-6f66-430a-96b8-7e2f3f8fdd5e.png' width=50% height=50%/>  

* Para conectar un proyecto Spring con una base de datos MySQL, en el archivo application.properties lo escribimos de la siguiente forma:
<img src='https://user-images.githubusercontent.com/123812331/229296048-7a69e710-a291-4237-8893-6de4200c25a1.png' width=50% height=50%/>

* Además, se agrega la siguiente dependencia al pom:
<img src='https://user-images.githubusercontent.com/123812331/229296126-79931956-89e2-4f57-8cf7-cf2c6457b1fb.png' width=50% height=50%/>  

* Al ejecutar la aplicación, se observa la conexión con la base de datos:  
<img src='https://user-images.githubusercontent.com/123812331/229296173-8944831d-5781-42df-9c68-851d5ae77870.png' width=50% height=50%/>   







