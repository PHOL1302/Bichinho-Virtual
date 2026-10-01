public class Bicho {

    private String nome;
    private int humor;
    private int fome;
    private int energia;

    @Override
    public String toString() {
        return "bicho{" +
                "nome='" + nome + '\'' +
                ", humor='" + humor + '\'' +
                ", fome=" + fome +
                ", energia=" + energia +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setFome(int fome) {
        if(fome<0 || fome>100){
            IO.println("valor invalido");
        }else{
            this.fome = fome;}
    }

    public void setEnergia(int energia) {
        if(energia<0 || energia>100){
            IO.println("valor invalido");
        }else{
            this.energia = energia;}
    }



    public void humor(){
        humor= energia+fome;

        if(humor<=0){
        }
        else if(humor<50){
            IO.println("bravo");
        }else if(humor<80){
            IO.println("calmo");
        }else{
            IO.println("alegre");
        }
    }

























































}