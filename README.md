## Ciclo de ejecución de los métodos del patrón utilizado:

### Los métodos que intervienen para la implementación del patrón Observer de este programa son:

- addObserver(Observer o), del objeto observado;
- setChanged() y notifyObservers(Object arg), en el objeto observado;
- update(Observable o, Object arg), en el objeto Observador.

Para que un objeto sea observado por otro u otros, este debe extender de la clase Observable, y el o los objetos observadores
deben implementar la interfaz Observer.

### El ciclo de ejecución es el siguiente:
- El programa indica al objeto Observable que hay un objeto que deberá ser notificado cuando éste (el observable) cambie su estado.
El objeto a notificar es el Observador. Esto ocurre mediante la invocación del método addObserver(Observer o) del Observado. 
Mediante este método, el Observable añade al observador pasado como parámetro a la lista de objetos a notificar del cambio.

- El objeto observable realiza una llamada al método setChanged() para indicar que ha realizado un cambio.

- Luego, invoca al método notifyObservers() para actualizar a todos los observadores.

- El objeto observador realiza automáticamente una llamada a su método update() al ser notificado de ese cambio en el observable.

## Que argumentos se pasan al método update() y en qué momento se ejecuta dicho método?

### El método update recibe como parámetros:
	- el objeto observable, y
	- un objeto pasado al método notifyObservers().
  
### Y se ejecuta cuando...
... el observer sea notificado de un cambio de estado en el observable.
