public class Main {
		
		public static int fin;
		public static int premierEnCourse;
		
	public static void main(String[] args){
		
		
		/* 20 voitures */
		Voiture voiture1 = new Voiture(1, "L.Hamilton", 0.72, 35.0, 0.94, 0.004);
		Voiture voiture2 = new Voiture(2, "N.Rosberg", 0.66, 35.0, 0.96, 0.005);
		Voiture voiture3 = new Voiture(3, "K.Raikkonen", 0.78, 32.0, 0.92, 0.003);
		Voiture voiture4 = new Voiture(4, "M.Schumacher", 0.79, 32.0, 0.93, 0.002);
		Voiture voiture5 = new Voiture(5, "JM.Fangio", 0.69, 31.0, 0.90, 0.005);
		Voiture voiture6 = new Voiture(6, "A.Prost", 0.75, 31.0, 1.01, 0.004);
		Voiture voiture7 = new Voiture(7, "S.Vettel", 0.70, 34.0, 0.88, 0.001);
		Voiture voiture8 = new Voiture(8, "J.Brabham", 0.76, 34.0, 0.89, 0.005);
		Voiture voiture9 = new Voiture(9, "N.Lauda", 0.68, 36.0, 0.93, 0.004);
		Voiture voiture10 = new Voiture(10, "N.Piquet", 0.66, 36.0, 0.91, 0.003);
		Voiture voiture11 = new Voiture(11, "A.Senna", 0.71, 38.0, 0.85, 0.005);
		Voiture voiture12 = new Voiture(12, "J.Stewart", 0.73, 38.0, 0.86, 0.005);
		Voiture voiture13 = new Voiture(13, "F.Alonso", 0.74, 30.0, 0.95, 0.004);
		Voiture voiture14 = new Voiture(14, "A.Ascari", 0.76, 30.0, 0.94, 0.003);
		Voiture voiture15 = new Voiture(15, "J.Clark", 0.65, 31.0, 0.98, 0.005);
		Voiture voiture16 = new Voiture(16, "E.Fittipaldi", 0.67, 31.0, 0.99, 0.004);
		Voiture voiture17 = new Voiture(17, "M.Hakkinen", 0.67, 34.0, 1.02, 0.003);
		Voiture voiture18 = new Voiture(18, "G.Hill", 0.69, 34.0, 1.01, 0.003);
		Voiture voiture19 = new Voiture(19, "V.Hermal", 0.80, 33.0, 1.00, 0.002);
		Voiture voiture20 = new Voiture(20, "R.Aubry", 0.80, 33.0, 0.99, 0.002);
		
		/* 10 écuries */
		Ecurie ecurie1 = new Ecurie(voiture1, voiture2, "Ferrari");
		Ecurie ecurie2 = new Ecurie(voiture3, voiture4, "Williams");
		Ecurie ecurie3 = new Ecurie(voiture5, voiture6, "Audi");
		Ecurie ecurie4 = new Ecurie(voiture7, voiture8, "McLaren");
		Ecurie ecurie5 = new Ecurie(voiture9, voiture10, "BMW");
		Ecurie ecurie6 = new Ecurie(voiture11, voiture12, "Bugatti");
		Ecurie ecurie7 = new Ecurie(voiture13, voiture14, "Porsche");
		Ecurie ecurie8 = new Ecurie(voiture15, voiture16, "Lamborghini");
		Ecurie ecurie9 = new Ecurie(voiture17, voiture18, "Aston Martin");
		Ecurie ecurie10 = new Ecurie(voiture19, voiture20, "Red Bull");
		
      	/* 10 Courses */
		Course course1 = new Course(50,"Albert Park");
		Course course2 = new Course(50,"Sepang");
		Course course3 = new Course(50,"Sakhir");
		Course course4 = new Course(50,"Shangai");
		Course course5 = new Course(50,"Catalunya");
		Course course6 = new Course(50,"Monaco");
		Course course7 = new Course(50,"Silverstone");
		Course course8 = new Course(50,"Suzuka");
		Course course9 = new Course(50,"Hockenheim");
		Course course10 = new Course(50,"Sotchi");
      
		//Classement des pilotes : initialisation (il comprend une voiture et ses points associés)
		ClassementPilote ptsPilote1 = new ClassementPilote(voiture1, 0);
		ClassementPilote ptsPilote2 = new ClassementPilote(voiture2, 0);
		ClassementPilote ptsPilote3 = new ClassementPilote(voiture3, 0);
		ClassementPilote ptsPilote4 = new ClassementPilote(voiture4, 0);
		ClassementPilote ptsPilote5 = new ClassementPilote(voiture5, 0);
		ClassementPilote ptsPilote6 = new ClassementPilote(voiture6, 0);
		ClassementPilote ptsPilote7 = new ClassementPilote(voiture7, 0);
		ClassementPilote ptsPilote8 = new ClassementPilote(voiture8, 0);
		ClassementPilote ptsPilote9 = new ClassementPilote(voiture9, 0);
		ClassementPilote ptsPilote10 = new ClassementPilote(voiture10, 0);
		ClassementPilote ptsPilote11 = new ClassementPilote(voiture11, 0);
		ClassementPilote ptsPilote12 = new ClassementPilote(voiture12, 0);
		ClassementPilote ptsPilote13 = new ClassementPilote(voiture13, 0);
		ClassementPilote ptsPilote14 = new ClassementPilote(voiture14, 0);
		ClassementPilote ptsPilote15 = new ClassementPilote(voiture15, 0);
		ClassementPilote ptsPilote16 = new ClassementPilote(voiture16, 0);
		ClassementPilote ptsPilote17 = new ClassementPilote(voiture17, 0);
		ClassementPilote ptsPilote18 = new ClassementPilote(voiture18, 0);
		ClassementPilote ptsPilote19 = new ClassementPilote(voiture19, 0);
		ClassementPilote ptsPilote20 = new ClassementPilote(voiture20, 0);
		
		ClassementPilote TotalPilote[] = new ClassementPilote[20];
		TotalPilote[0] = ptsPilote1;
		TotalPilote[1] = ptsPilote2;
		TotalPilote[2] = ptsPilote3;
		TotalPilote[3] = ptsPilote4;
		TotalPilote[4] = ptsPilote5;
		TotalPilote[5] = ptsPilote6;
		TotalPilote[6] = ptsPilote7;
		TotalPilote[7] = ptsPilote8;
		TotalPilote[8] = ptsPilote9;
		TotalPilote[9] = ptsPilote10;
		TotalPilote[10] = ptsPilote11;
		TotalPilote[11] = ptsPilote12;
		TotalPilote[12] = ptsPilote13;
		TotalPilote[13] = ptsPilote14;
		TotalPilote[14] = ptsPilote15;
		TotalPilote[15] = ptsPilote16;
		TotalPilote[16] = ptsPilote17;
		TotalPilote[17] = ptsPilote18;
		TotalPilote[18] = ptsPilote19;
		TotalPilote[19] = ptsPilote20;
		
		//Classement des écuries : initialisation (il comprend une écurie et ses points associés)
		ClassementEcurie ptsEcurie1 = new ClassementEcurie(ecurie1, 0);
		ClassementEcurie ptsEcurie2 = new ClassementEcurie(ecurie2, 0);
		ClassementEcurie ptsEcurie3 = new ClassementEcurie(ecurie3, 0);
		ClassementEcurie ptsEcurie4 = new ClassementEcurie(ecurie4, 0);
		ClassementEcurie ptsEcurie5 = new ClassementEcurie(ecurie5, 0);
		ClassementEcurie ptsEcurie6 = new ClassementEcurie(ecurie6, 0);
		ClassementEcurie ptsEcurie7 = new ClassementEcurie(ecurie7, 0);
		ClassementEcurie ptsEcurie8 = new ClassementEcurie(ecurie8, 0);
		ClassementEcurie ptsEcurie9= new ClassementEcurie(ecurie9, 0);
		ClassementEcurie ptsEcurie10 = new ClassementEcurie(ecurie10, 0);
		
		ClassementEcurie TotalEcurie[] = new ClassementEcurie[10];
		TotalEcurie[0] = ptsEcurie1;
		TotalEcurie[1] = ptsEcurie2;
		TotalEcurie[2] = ptsEcurie3;
		TotalEcurie[3] = ptsEcurie4;
		TotalEcurie[4] = ptsEcurie5;
		TotalEcurie[5] = ptsEcurie6;
		TotalEcurie[6] = ptsEcurie7;
		TotalEcurie[7] = ptsEcurie8;
		TotalEcurie[8] = ptsEcurie9;
		TotalEcurie[9] = ptsEcurie10;
		
		//Saison[] : Tableau de 10 courses
		Course Saison[] = new Course[10];
		Saison[0] = course1;
		Saison[1] = course2;
		Saison[2] = course3;
		Saison[3] = course4;
		Saison[4] = course5;
		Saison[5] = course6;
		Saison[6] = course7;
		Saison[7] = course8;
		Saison[8] = course9;
		Saison[9] = course10;
		
		//Pour chaque course
		for (int k=0; k<10; k++){ 
			
			//Compteur sur le nombre de pilotes qui ont terminé la course
			fin = 0;
			
			//Position-1 de la 1ère voiture encore en course
			premierEnCourse = 0;
								
			//Classement de la course : initialisation
			ClassementCourse position1 = new ClassementCourse(voiture1, 0, "En course", 0);
			ClassementCourse position2 = new ClassementCourse(voiture2, 0, "En course", 0);
			ClassementCourse position3 = new ClassementCourse(voiture3, 0, "En course", 0);
			ClassementCourse position4 = new ClassementCourse(voiture4, 0, "En course", 0);
			ClassementCourse position5 = new ClassementCourse(voiture5, 0, "En course", 0);
			ClassementCourse position6 = new ClassementCourse(voiture6, 0, "En course", 0);
			ClassementCourse position7 = new ClassementCourse(voiture7, 0, "En course", 0);
			ClassementCourse position8 = new ClassementCourse(voiture8, 0, "En course", 0);
			ClassementCourse position9 = new ClassementCourse(voiture9, 0, "En course", 0);
			ClassementCourse position10 = new ClassementCourse(voiture10, 0, "En course", 0);
			ClassementCourse position11 = new ClassementCourse(voiture11, 0, "En course", 0);
			ClassementCourse position12 = new ClassementCourse(voiture12, 0, "En course", 0);
			ClassementCourse position13 = new ClassementCourse(voiture13, 0, "En course", 0);
			ClassementCourse position14 = new ClassementCourse(voiture14, 0, "En course", 0);
			ClassementCourse position15 = new ClassementCourse(voiture15, 0, "En course", 0);
			ClassementCourse position16 = new ClassementCourse(voiture16, 0, "En course", 0);
			ClassementCourse position17 = new ClassementCourse(voiture17, 0, "En course", 0);
			ClassementCourse position18 = new ClassementCourse(voiture18, 0, "En course", 0);
			ClassementCourse position19 = new ClassementCourse(voiture19, 0, "En course", 0);
			ClassementCourse position20 = new ClassementCourse(voiture20, 0, "En course", 0);
			
			ClassementCourse Course [] = new ClassementCourse[20]; 
			Course[0] = position1;
			Course[1] = position2;
			Course[2] = position3;
			Course[3] = position4;
			Course[4] = position5;
			Course[5] = position6;
			Course[6] = position7;
			Course[7] = position8;
			Course[8] = position9;
			Course[9] = position10;
			Course[10] = position11;
			Course[11] = position12;
			Course[12] = position13;
			Course[13] = position14;
			Course[14] = position15;
			Course[15] = position16;
			Course[16] = position17;
			Course[17] = position18;
			Course[18] = position19;
			Course[19] = position20;
					
			//Tant que la course n'est pas finie
			while(fin<20){
				
				fin = 0;
				
				//Pour chaque voiture
				for (int i=0; i<20; i++){
					
					//Tour actuel
					int tour_actuel = (int) Course[i].distance; //Tour actuel avant que la voiture avance
					
					if (Course[i].statut != "Course terminée"){ 
						
						//Si le pilote a terminé la course
						if (tour_actuel >= Saison[k].nbTours){
							Course[i].statut = "Course terminée";
							premierEnCourse += 1;							
						}
					}
					
					if (Course[i].statut == "Course terminée"){
						
						//Nombre de pilotes qui ont terminé la course
						fin += 1; 
						
						//La course vient de se terminer
						if(fin >= 20 ){
							
							//Affichage du classement de la course
							System.out.println("\n" + Saison[k].nom + " est terminé");
							for (int g=0; g<20; g++){
								int position = g+1;
								if (Course[g].distance != 0){
									System.out.println(Course[g].voiture.pilote + " termine en position " + position);
								}
							}
							System.out.println("Les autres pilotes n'ont pas pu terminer la course\n");
						}
					}
					
					//La voiture est aux stands
					if (Course[i].statut == "Stand"){
						Course[i].pause +=1;
						
						//La pause de 10 secondes est finie
						if (Course[i].pause >= 10){
							
							//Le pilote repart en course
							Course[i].statut = "En course";
							Course[i].pause = 0;
						}
					}
					
					//La voiture est toujours en course						
					if (Course[i].statut == "En course" || Course[i].statut == "Avarie"){
						
						//La voiture avance
						if (Course[i].statut == "En course"){
							Course[i].distance += Course[i].voiture.vitesse;
						} else if (Course[i].statut == "Avarie"){
							Course[i].distance += 0.8*Course[i].voiture.vitesse;
						}
						
						//Test de collisison + Mise à jour des positions
						for (int j=i; j>premierEnCourse; j--){
							
							//Dépassement
							if (Course[j].distance >= Course[j-1].distance){
								
								//Les 2 voitures sont en course, donc on effectue un test de collision
								if ((Course[j].statut == "En course" || Course[j].statut == "Avarie") && (Course[j-1].statut == "En course" || Course[j-1].statut == "Avarie")){ 
									double collision = Math.random();
									
									//Si il y a collision
									if (collision < 0.0025){
										
										//Les deux pilotes ne sont plus en course
										Course[j].statut = "Course terminée";
										Course[j-1].statut = "Course terminée";
										Course[j].distance = 0;
										Course[j-1].distance = 0;
										System.out.println("Collision entre "+ Course[j].voiture.pilote + " et " + Course[j-1].voiture.pilote);
									}
								}
								
								//Echange des positions
								ClassementCourse aux = Course[j];
								Course[j] = Course[j-1];
								Course[j-1] = aux;
							}
						}
						
						//Tour actuel après avoir incrémenté la distance
		                int new_tour = (int) Course[i].distance;
		                
		                //Nouveau tour 
		                if (new_tour > tour_actuel){
		
		                	//Fin de l'avarie
		                    if (Course[i].statut == "Avarie"){
		                        Course[i].statut = "En course";
		                    }
		                    
		                    //Vérification du réservoir
		                    
		                    //Le réservoir diminue
		                    Course[i].voiture.reservoir += -Course[i].voiture.consoKm;
		                    
		                    //Si il n'a plus assez d'essence pour terminer ce tour
		                    if (Course[i].voiture.reservoir - Course[i].voiture.consoKm < 0){
		                        Course[i].voiture.reservoir += 30;
		                        
		                        //La voiture rentre aux stands
		                        Course[i].statut = "Stand";
		                        System.out.println(Course[i].voiture.pilote +" rentre aux stands pour faire le plein d'essence");
		                    }
		                    
		                    //On vérifie qu'il ne vient pas de rentrer aux stands pour pouvoir effectuer les tests sur l'avarie et la panne
		                    if (Course[i].statut != "Stand"){
		                    	
				                //Test avarie
				                double avarie = Math.random();
				                if(avarie < Course[i].voiture.fiabilite){
				                	
				                	//La voiture subit une avarie
				                    Course[i].statut = "Avarie";
				                    System.out.println(Course[i].voiture.pilote +" subit une avarie !");
				                }
				
				                //Test panne
				                double panne = Math.random();
				                if(panne < Course[i].voiture.fiabilite){
				                	
				                	//La voiture subit une panne
				                    Course[i].statut = "Course terminée";
				                    Course[i].distance = 0;
				                    System.out.println(Course[i].voiture.pilote +" subit une panne, il n'est plus dans la course !");
				                }
		                    }//Fin test panne + avarie
		                }//Fin nouveau tour
					}//Fin voiture toujours en course
				}//Fin pour chaque voiture
			}//Fin de la course
			
			//Liste des points à attribuer
			int pts[] = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
			
			//Ajout des points au classement des pilotes et des écuries
			for (int l=0; l<10; l++){
				int indice = Course[l].voiture.code;
				
				//Si la voiture a bien terminé la course
				if (Course[l].distance != 0){
					
					//Ajout des points au classement des pilotes
					TotalPilote[indice-1].point += pts[l];
					
					//Ajout des points au classement des écuries
					if (indice%2 == 0){
						indice = indice/2 -1;
					}else {
						indice = (indice-1)/2;
					}
					TotalEcurie[indice].point += pts[l];				
				}		
			}
		}//Fin de toutes les courses
		
		//Tri du classement des pilotes
		for (int i=0 ;i<19;i++){
            for (int j=19;i < j;j--){
            	if(TotalPilote[j].point >= TotalPilote[j-1].point){
            		ClassementPilote aux = TotalPilote[j];
            		TotalPilote[j] = TotalPilote[j-1];
            		TotalPilote[j-1] = aux;
            	}
			}
		}
		
		//Tri du classement des écuries
		for (int i=0 ;i<9;i++){
            for (int j=9;i < j;j--){
            	if(TotalEcurie[j].point >= TotalEcurie[j-1].point){
            		ClassementEcurie aux = TotalEcurie[j];
            		TotalEcurie[j] = TotalEcurie[j-1];
            		TotalEcurie[j-1] = aux;
            	}
			}
		}
		
		//Affichage du classement des pilotes
		System.out.println("\nLe classement pilote de la saison :\n");
		for (int m=0; m<20; m++){
			System.out.println(m+1 +". " + TotalPilote[m].voiture.pilote + " : " + TotalPilote[m].point + "pts");
		}
		
		//Affichage du classement des écuries
		System.out.println("\nLe classement écurie de la saison :\n");
		for (int m=0; m<10; m++){
			System.out.println(m+1 +". " + TotalEcurie[m].ecurie.nom + " : " + TotalEcurie[m].point + "pts");
		}		
	}
}