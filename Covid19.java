import java.util.Scanner;

public class Covid19{
    public static void main(String[] args){

        int sum = 0;

        System.out.println("I need you to answer these few questions rightly by saying either YES or NO");
        System.out.println("Do you have cough?");
        Scanner coughObj = new Scanner(System.in);
        String cough = coughObj.next();
        if(cough.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Do you have a running Nose?");
        Scanner rNoseObj = new Scanner(System.in);
        String rNose = rNoseObj.next();
        if(rNose.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Are you having Diarrhea?");
        Scanner diarrheaObj = new Scanner(System.in);
        String diarrhea = diarrheaObj.next();
        if(diarrhea.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Do you have headache?");
        Scanner headacheObj = new Scanner(System.in);
        String headache = headacheObj.next();
        if(headache.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Are you experiencing MYALGIA or body arches?");
        Scanner myalgiaObj = new Scanner(System.in);
        String myalgia = myalgiaObj.next();
        if(myalgia.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Are you having a sore throat?");
        Scanner sThroatObj = new Scanner(System.in);
        String sThroat = sThroatObj.next();
        if(sThroat.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Are you having fever(temperature 37.8 C and above)?");
        Scanner feverObj = new Scanner(System.in);
        String fever = feverObj.next();
        if(fever.equalsIgnoreCase("yes")){
            sum += 1;
        }
        System.out.println("Are you having difficulty breathimg?");
        Scanner diffBrtObj = new Scanner(System.in);
        String diffBrt = diffBrtObj.next();
        if(diffBrt.equalsIgnoreCase("yes")){
            sum += 2;
        }
        System.out.println("Are you experiencing fatigue?");
        Scanner fatigueObj = new Scanner(System.in);
        String fatigue = fatigueObj.next();
        if(fatigue.equalsIgnoreCase("yes")){
            sum += 2;
        }
        System.out.println("Have you travelled recently during the past 14 days?");
        Scanner travelledObj = new Scanner(System.in);
        String travelled = travelledObj.next();
        if(travelled.equalsIgnoreCase("yes")){
            sum += 3;
        }
            System.out.println("Do you have a travel history to COVID-19 INFECTED AREA?");
        Scanner historyObj = new Scanner(System.in);
        String history = historyObj.next();
        if(history.equalsIgnoreCase("yes")){
            sum += 3;
        }
        System.out.println("Do you have direct contact or taking care of a positive COVID-19 PATIENT?");
        Scanner positiveObj = new Scanner(System.in);
        String positive = positiveObj.next();
        if(positive.equalsIgnoreCase("yes")){
            sum += 3;
        }
         System.out.println("score result points is: " + sum);

	if(sum <= 2){
		System.out.println("May be stress related and observe.");
	}
		
	else if(sum == 3 || sum <= 5){
		System.out.println("Hydrate properly and proper personal hygiene.");
	}
		
	else if(sum == 6 || sum <= 12){
		System.out.println("Seek a consultation with a Doctor.");
	}
		
	else if(sum == 6 || sum <= 20){
		System.out.println("CALL THE NCDC HOTLINE 080097000010");
	}
		
    }
}