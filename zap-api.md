-   API OWASP ZAP

1) Iniciar el scaner -> API

   http://localhost:9095/UI/ascan/action/scan/
   request: GET/POST

ejemplo:
GET
http://localhost:9095/JSON/ascan/action/scan/?url={URL_HOST_OR_IP}

	http://localhost:9095/JSON/ascan/action/scan/?url=https://todo.ly  -->  {"scan":"3"}

2) El porcentaje de avance del scanner

   http://localhost:9095/UI/ascan/view/status/
   request: GET/POST

   ejemplo:
   GET
   http://localhost:9095/JSON/ascan/view/status/?scanId={ID_SCANNER}

   http://localhost:9095/JSON/ascan/view/status/?scanId=3


3)  Obtener lista de vulnerabilidades ejecutadas

    http://localhost:9095/UI/ascan/view/scanProgress/

request:  GET/ POST

ejemplo

	http://localhost:9095/HTML/ascan/view/scanProgress/?scanId={ID_SCANNER}

	http://localhost:9095/HTML/ascan/view/scanProgress/?scanId=3


4) obtener lista de alertas - posibles vulnerabilidades encontradas

   http://localhost:9095/UI/alert/view/alerts/
   request: GET/POST

   ejemplo: HTML/JSON

   http://localhost:9095/HTML/alert/view/alerts/?baseurl={HOST_NAME_IP}

   http://localhost:9095/HTML/alert/view/alerts/?baseurl=https://todo.ly


5) Generar el reporte de owasp zap

**** http://localhost:9095/UI/reports/

	http://localhost:9095/JSON/reports/action/generate/?title=zap&template=traditional-html -->	{"generate":"C:\\Users\\EYNAR\\2025-09-03-ZAP-Report-.html"}

***** http://localhost:9095/UI/core/other/htmlreport/

	http://localhost:9095/OTHER/core/other/htmlreport/?


