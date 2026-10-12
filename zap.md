1) Abrir OWASP ZAP   -------> CLI
2) Configurar el host/ip : port  ----------> API / Preconfigurar
   herramientas>opciones
   red>servidores/proxy
   ie.:  localhost:9095

3) configurar el browser usando la informacion del paso 2 (ip/host:port)  ------> Selenium-Java
   manual >  click [Exploracion Manual]
   uncheck del HUD
   seleccionar el navegador (i.e: Chrome)
   click iniciar sesion

4) realizar un flujo en el navegador smoke test / e2e test / sanity tests  (PASSED/FAILED) ----> Selenium-Java

5) iniciar el escaneo (de todo el flujo grabado se empiezan a ejecutar diferente test de vulnerabilidad) ------> API
   ir sitios > SUT  (ip  / hostname)
   click derecho > atacar > escaneo activo

6) que pruebas pruebas de vulnerabilidad?    
   existe un boton de progreso por vulnerabilidad (lista de vulnerabilidades)  -------> API

7) tenemos la barra de progreso que nos muestra si el escano llego al 100% (completo)  -----> API

8) tenemos la seccion de alertas para ver las vulnerabilidades encontradas en tiempo real -------> API

9) generar el report de vulnerabilidad   ---------> API
   menu> informe > generar informe
   -seleccionar carpeta donde se crea el reporte
   - seleccion url/sitios
   - click plantillas> seleccionar una platilla
   - click generar reporte

   nota: el reporte deberia ser abierto en el navegador

10) generar el report de las pruebas funcionales   --------> Allure
11) integrar el reporte de vulnerabilidad + reporte de funcionalidad ----> Allure
   

EJECUTAR PRUEBAS
   cmd > gradle test