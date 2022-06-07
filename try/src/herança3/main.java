package herança3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		notebook not = new notebook(0, 0, true, 0.0);
		smartphone cell = new smartphone(0, 0, true, 0);
		boolean bol = true;
		while (bol) {

			System.out.println("o dispositivo é um celular ou notebook ?\n1 para notebook     \n2 para celular");
			int choise = sc.nextInt();
			if (choise == 1) {
				System.out.println("quanto de ram o dispositivo tem ?");
				not.setRam(sc.nextInt());
				System.out.println("quanto de armazenamento o dispositivo (GB)?");
				not.setStorage(sc.nextInt());
				boolean bol2 = true;
				while (bol2) {
					System.out.println("possui teclado ? \n(Sim)    (Não)");
					String ketb = sc.next();
					if (ketb.equals("Sim")) {
						boolean V = true;
						bol2 = false;
						not.setKeyBoard(V);
					} else if (ketb.equals("Não")) {
						boolean V = false;
						not.setKeyBoard(V);
						bol2 = false;
					} else {
						System.err.println("error , tente novamente.");
					}
				}
				System.out.println("quantos Kg esse notebook pesa ?");
				not.setPeso(sc.nextDouble());
				if (not.ehPesado()) {
					System.out.println("é pesado e tem mais de 3Kg");
				} else {
					System.out.println("pesa menos de 3Kg");
				}
				System.out.printf(
						"dados do Notebook\nRam = %d GB \nArmazenamento interno %d GB\npossui teclado ? = %s \npesa %.2f \n",
						not.getRam(), not.getStorage(), not.tecla(), not.getPeso());
				System.out.println("aumentar quantos Gb de ram?");
				not.ramAdd(sc.nextInt());
				System.out.println(
						"agora possui " + not.getRam() + "GB\nQuantos Gb de armazenamento interno deseja aumentar ?");
				not.storageAdd(sc.nextInt());
				System.out.println("agora possui " + not.getStorage() + "GB de armazenamento interno");
				bol = false;
			} else if (choise == 2) {
				System.out.println("quanto de ram o dispositivo tem ?");
				cell.setRam(sc.nextInt());
				System.out.println("quanto de armazenamento o dispositivo (GB)?");
				cell.setStorage(sc.nextInt());
				boolean bol2 = true;
				while (bol2) {
					System.out.println("possui teclado ? \n Sim    Não");
					String ketb = sc.next();
					if (ketb.equals("Sim")) {
						boolean V = true;
						bol2 = false;
						cell.setKeyBoard(V);
					} else if (ketb.equals("Não")) {
						boolean V = false;
						cell.setKeyBoard(V);
						bol2 = false;
					} else {
						System.err.println("error , tente novamente.");
					}
				}
				System.out.println("numero de selfies tiradas ?");
				cell.setSelfies(sc.nextInt());
				System.out.println("deseja tirar quantas selfies a mais ?");
				int self = sc.nextInt();
				if (self >= 1) {
					cell.tirarSelfies(self);
				} else {
					System.err.println("error numero invalido");
				}
				System.out.printf(
						"dados do Smartphone\nRam = %d \nArmazenamento interno %d GB\npossui teclado ? = %s \nQuantidade de Selfies tiradas %d;",
						cell.getRam(), cell.getStorage(), cell.tecla(), cell.getSelfies());
				System.out.println("não é possivel aumentar ram ou armazenamento interno.");

				bol = false;
			} else {
				System.err.println("escolha invalida;");
			}
		}

	}

}
