package clasearchivo;

import java.util.Date;
import java.util.GregorianCalendar;

public class ClaseArchivo {
    //Atributos
    private String nombre;
    private String tipo;
    private Date fecha_creacion;
    private String contenido;
    
    //Constructor 1 
    public ClaseArchivo(String nombre, int año, int mes, int dia){
        this.nombre=nombre;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha_creacion=calendario.getTime();
    }
    //Constructor 2
    public ClaseArchivo(String nombre, String tipo, int año, int mes, int dia){
        this.nombre=nombre;
        this.tipo=tipo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha_creacion=calendario.getTime();
    }
    //Constructor 3
    public ClaseArchivo(String nombre, String tipo, int año, int mes, int dia, String contenido){
        this.nombre=nombre;
        this.tipo=tipo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha_creacion=calendario.getTime();
        this.contenido=contenido;
    }
    
    public String getNombre(){
		return "El nombre del archivo es: "+nombre;
	}
    public String getTipo(){
		return "El tipo de archivo es: "+tipo;
	}
    
    public String getFechaCreacion(){
        return "La fecha de creacion del archivo es: "+fecha_creacion;
    }
    
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public String getContenido(){
		return "El contenido es: "+contenido;
	}

    public static void main(String[] args) {
        ClaseArchivo objeto1 = new ClaseArchivo("Deber",2018,05,07);
        System.out.println("\tBienvenido a mi Programa\n");
        System.out.println("  Objeto 1\n");
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaCreacion());
        
        ClaseArchivo objeto2 = new ClaseArchivo("Proyecto",".pdf",2018,02,25);
        System.out.println("\n  Objeto 2\n");
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getTipo());
        System.out.println(objeto2.getFechaCreacion());
        
        ClaseArchivo objeto3 = new ClaseArchivo("Programa",".java",2018,05,07,"Vacio");
        System.out.println("\n  Objeto 3\n");
        objeto3.setContenido("Hola mundo");
        System.out.println(objeto3.getNombre());
        System.out.println(objeto3.getTipo());
        System.out.println(objeto3.getContenido());
        
    }
    
}