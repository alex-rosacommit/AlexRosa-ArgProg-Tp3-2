package alexRosa_Tp3_2;

public class AlexRosa_Tp3_2_Class {

	public static void main(String[] args) {
		// AlexRosa_Tp3_2_
		String listaNombres = "Mateo_Martin_Romina_Lucas_Leo_Daniel_Mariana_Alejandro_Manuel_Carolina";
		
		String[]nombresEnArray = listaNombres.split("_");
		
		for(int index = 0; index < nombresEnArray.length; index++) {
			System.out.println(nombresEnArray[index]);
		}
		
	}

}
