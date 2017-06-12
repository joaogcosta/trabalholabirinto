
public class Inimigos {
	private String goblin; 
	private String orc;
	private String troll;
	private String tipo;
	
	private int dano;
    private int vida;

    public void Inimigo(String tip){
    	this.tipo = tip;
    	int damage;
    		if(tip.equals(goblin)){
    			damage = (int) ((Math.random()*2) + 1);
    					this.dano = damage;
    			damage = (int) ((Math.random()*2) + 2);
    					this.vida = damage;
    		}    		
    		
    		else{
    			if(tip.equals(orc)){
        			damage = (int) ((Math.random()*4) + 2);
        					this.dano = damage;
        			damage= (int) ((Math.random()*3) + 3);
        					this.vida = damage;
    			}
    					
    		
    		
    		else{
    			if(tip.equals(troll)){
        			damage = (int) ((Math.random()*6) + 2);
        					this.dano = damage;
        			damage= (int) ((Math.random()*6) + 2);
        					this.vida = damage;
    			}
    					
    		}
    		
    }




    }

}//Final Inimigos








