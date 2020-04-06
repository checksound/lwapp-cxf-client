# CXF Client 

Utilizzando [CXF](http://cxf.apache.org/) e il plugin di Maven [cxf-codegen-plugin](http://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html) per generare dal WSDL le classi java. 
 
PARTENDO da progetto:

[LEARN WEB SERVICES | Free, public SOAP web services example](http://www.learnwebservices.com/)

e codice par client CXF:
https://github.com/vicziani/learnwebservices/tree/master/lwsapp-cxf-client

Per generare il codice da WSDL `mvn generate-sources`.

I servizi per cui si sono generati di client sono [hello](http://www.learnwebservices.com/services/hello?WSDL) e [Celsius to Fahrenheit converter](http://www.learnwebservices.com/services/tempconverter?wsdl).

Le applicazioni sono: [com.learnwebservices.hello.HelloMain](./src/main/java/com/learnwebservices/hello/HelloMain.java) ed
[com.learnwebservices.tempconverter.TempConverterMain](./src/main/java/com/learnwebservices/tempconverter/TempConverterMain.java).






