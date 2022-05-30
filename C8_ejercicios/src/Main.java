public class Main {
    public static void main(String[] args) {

    Persona persona = new Persona();
            persona.SetNombre("Pepe");
            persona.SetEdad(30);
            persona.SetTelefono(445577945);
        System.out.println("Persona: Nombre:" + persona.GetNombre());
        System.out.println("Persona: Edad:" +  persona.GetEdad());
        System.out.println("Persona:Telefono:" + persona.GetTelefono());

    }
}


class Persona{
    private String nombre;
    private int telefono;
    private int edad;

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public void SetTelefono(int telefono){
        this.telefono = telefono;
    }

    public void SetEdad(int edad){
        this.edad = edad;
    }



    public String GetNombre(){
        return nombre;
    }

    public int GetTelefono(){
        return telefono;
    }

    public int GetEdad(){
        return edad;
    }





}