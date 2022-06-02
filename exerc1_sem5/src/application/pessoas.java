package application;

public class pessoas {
	String name[]=new String[5];
	int dia[]=new int[5];
	int mes[]=new int[5];
	int ano[]=new int[5];
	String estadoCivil[]=new String[5];
	char sexo[]=new char[5];

	public String person() {
		for (int i = 0; i < 2; i++) {
			if (sexo[i] == 'F') {
				return name[i] + "nascido em" + dia[i] + "/" + mes[i] + "/" + ano[i] + "/\n" + "estado civil ="
						+ estadoCivil[i] + "sexo biologico = feminino";
			} else if (sexo[i] == 'M') {
				return name[i] + "nascido em" + dia[i] + "/" + mes[i] + "/" + ano[i] + "/\n" + "estado civil ="
						+ estadoCivil[i] + "sexo biologico = masculino";
			}
		}
		return "error sexo não identificado";
	}

}
