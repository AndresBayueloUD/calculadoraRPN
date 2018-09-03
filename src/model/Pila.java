package model;

import java.util.Stack;

public class Pila extends Stack {
	
	private int  indexSearch=0;
	private String itemSearch="";

    public void agregar(Object object){
        this.push(object);
    }

    public Object remover(){
        return this.pop();
    }

    public Object obtener(int indice){
        return this.get(indice);
    }

    public int tamanio(){
        return this.size();
    }

    public int buscar(String object){
    	if(!itemSearch.equals(object)) {
    		itemSearch = object;
    		indexSearch = 0;
    	}else if( indexSearch>=this.size() )
    		indexSearch = 0;
    	else
    		indexSearch++;
    	while( indexSearch<this.size() && !itemSearch.equals((String)this.get(indexSearch)) )
    		indexSearch++;
    	return indexSearch;
    }
    
    public void ordenarInsercion() {
    	int i,j;
        String actual;
        for(i=0; i<this.size(); i++){
            actual = (String)this.get(i);
            for(j=i; j>0 && Double.parseDouble((String)this.get(j-1)) >Double.parseDouble(actual); j--)
            	this.set(j, (String)this.get(j-1));
            this.set(j, actual);
        }
    }
    
    public void ordenarSeleccion() {
    	String temp;
        for(int i=0; i<this.size(); i++){
            for(int j=0; j<this.size(); j++){
                if(Double.parseDouble((String)this.get(j))>Double.parseDouble((String)this.get(i))){
                    temp=(String)this.get(i);
                    this.set(i, (String)this.get(j));
                    this.set(j, temp);
                }
            }
        }
    }
    
    public int getIndexSearch() {
    	return indexSearch;
    }
    
    public void setIndexSearch(int i) {
    	indexSearch += i;
    }

}
