import java.util.Scanner;

public class fechas {
	public static void main(String[] args) {
		int dia,mes,anio;
		System.out.println("introduce el dia del mes");
		Scanner dias=new Scanner(System.in);
		dia=dias.nextInt();
		System.out.println("Introduce el mes");
		Scanner meses=new Scanner(System.in);
		mes=meses.nextInt();
		System.out.println("Introduce el año, este año debe tener 4 numeros, Ej: 2001");
		Scanner anios=new Scanner(System.in);
		anio=anios.nextInt();
		
		if (anio>999&&anio<10000) {
			if (mes>0&&mes<13) {
				if (dia>0&&dia<32) {
					if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) {
						System.out.println("Tu fecha es correcta: "+dia+" del "+mes+" del "+anio);
					}else {
						if (mes==4||mes==6||mes==9||mes==11) {
							if (dia<31) {
								System.out.println("Tu fecha es correcta: "+dia+" del "+mes+" del "+anio);
							}else {
								System.out.println("Los dias, mes y año que has introducido son validos pero es una fecha no valida ya que no concuerdan los dias con los meses");
							}
						}else {
							if (mes==2&&dia<29) {
								System.out.println("Tu fecha es correcta: "+dia+" del "+mes+" del "+anio);
							}else {
								System.out.println("Los dias, mes y año que has introducido son validos pero es una fecha no valida ya que no concuerdan los dias con los meses");
							}
						}
					}
				}else {
					System.out.println("Introduceme bien el dia, que los meses no tienen más de 31 dias");
				}
			}else {
				System.out.println("Introduce bien el mes, no te lo inventes");
			}
		}else {
			System.out.println("introduce bien el año");
		}
	}
}
