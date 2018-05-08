package validacioncedula;

public class ValidacionCedula {
    //Encapsulamiento
    private String cedula;
    //Constructor
    public ValidacionCedula(String cedula){
        this.cedula=cedula;
    }
    //Metodo Get
    public String getCedula(){
		if(cedula.length() != 10 ) {
			return "Error: ID ingresado incorrecto";
		}else {
                        int r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
                        r1= Integer.valueOf(cedula.substring(0,1));
                        r2= Integer.valueOf(cedula.substring(1,2));
                        r3= Integer.valueOf(cedula.substring(2,3));
                        r4= Integer.valueOf(cedula.substring(3,4));
                        r5= Integer.valueOf(cedula.substring(4,5));
                        r6= Integer.valueOf(cedula.substring(5,6));
                        r7= Integer.valueOf(cedula.substring(6,7));
                        r8= Integer.valueOf(cedula.substring(7,8));
                        r9= Integer.valueOf(cedula.substring(8,9));
                        r10= Integer.valueOf(cedula.substring(9,10));
                        r1= r1*2;
                        r2= r2*1;
                        r3= r3*2;
                        r4= r4*1;
                        r5= r5*2;
                        r5= r5-9;
                        r6= r6*1;
                        r7= r7*2;
                        r8= r8*1;
                        r9= r9*2;
                        r9= r9-9;
                        r10= r10*1;
                        int suma= r1+r2+r3+r4+r5+r6+r7+r8+r9+r10-1;
                        int suma1= suma-50;
                            for(int i=0; i<10;i+=2){
                                System.out.println(cedula.charAt(i)+" x 2 = ");
                                System.out.println(cedula.charAt(i+1)+" x 1 = ");  
                            }
                            System.out.println("El resultado de la comprobacion es "+suma+" - 50 ="+suma1);     
		}
		return "El # de cedula ingresado es correcto: "+cedula;
	}
    
    public static void main(String[] args) {
        ValidacionCedula p1 = new ValidacionCedula("1725890691");
        System.out.println("\tBienvenido a mi Programa");
        System.out.println(p1.getCedula());
           
    }
    
}