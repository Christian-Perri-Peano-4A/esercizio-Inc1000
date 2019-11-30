# esercizio-Inc1000
#In questo esercizio ho creato 2 oggetti con la stessa classe a cui ho assegnato un Thread,questi 2 oggetti hanno il compito di incrementare
un contatore di 1000 ciascuno.
Quando si va a fare l' output si può chiamare il metodo dell' oggetto soltanto richiamando la classe,questo perchè il contatore all' interno
della classe viene dichiarata statica,quindi tutti gli oggetti di quella la condividono,infatti se la variabile contatore venisse dichiarato
public ci sarebbe un errore.
In output viene restituito il valore 0,questo perchè i Thread vengono fermati priva che facciano il loro incremento.

